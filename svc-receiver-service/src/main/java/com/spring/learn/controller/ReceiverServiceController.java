package com.spring.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receiver")
public class ReceiverServiceController {

	@GetMapping("/home")
	public String home() {
		return "Message from receiver-service.";
	}
	
}
