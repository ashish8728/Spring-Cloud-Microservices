package com.spring.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductDetailController {
	@GetMapping("/home")
	public String home() {
		return "Welcome to product detail service";
	}
}
