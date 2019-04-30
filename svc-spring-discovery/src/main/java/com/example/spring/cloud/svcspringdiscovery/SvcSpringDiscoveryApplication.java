package com.example.spring.cloud.svcspringdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SvcSpringDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcSpringDiscoveryApplication.class, args);
	}

}
