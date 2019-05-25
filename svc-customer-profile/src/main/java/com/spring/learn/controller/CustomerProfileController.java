package com.spring.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerProfileController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to customer profile service.";
	}

}
