package com.example.userandauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userandauth.model.User;
import com.example.userandauth.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		return service.register(user).getUsername();
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		return service.login(user);
	}
	
}
