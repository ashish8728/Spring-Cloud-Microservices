package com.spring.learn.controller;

import java.io.IOException;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/caller")
public class CallerServiceController {

	private LoadBalancerClient loadBalancerClient;

	public CallerServiceController(LoadBalancerClient loadBalancerClient) {
		this.loadBalancerClient = loadBalancerClient;
	}

	@GetMapping("/home")
	public String home() {
		return "Message from caller-service.";
	}

	@GetMapping("/callReceiver")
	public String callReceiver() {
		ServiceInstance serviceInstance = loadBalancerClient.choose("receiver-service");
		System.out.println(serviceInstance.getUri());
		String baseUrl = serviceInstance.getUri().toString() + "/receiver/home";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return response.getBody();
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.TEXT_PLAIN_VALUE);
		return new HttpEntity<>(headers);
	}
}
