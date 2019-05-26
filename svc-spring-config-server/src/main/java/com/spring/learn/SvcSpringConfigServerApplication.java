package com.spring.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SvcSpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcSpringConfigServerApplication.class, args);
	}

}
