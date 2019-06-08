package com.spring.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learn.repository.PrivilegeRepository;
import com.spring.learn.repository.RoleRepository;
import com.spring.learn.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	PrivilegeRepository privilegeRepository;
	
	@GetMapping("/home")
	public String home() {
		return "Message from auth service.";
	}
	
	@GetMapping("/user")
	public String user() {
		return userRepository.findUserByUsername("user1").toString();
	}
	
	@GetMapping("/role")
	public String role() {
		return roleRepository.findRoleByName("ADMIN").toString();
	}
	
	@GetMapping("/privilege")
	public String privilege() {
		return privilegeRepository.findPrivilegeByName("READ").toString();
	}
	
}