package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String homePage() {
		return "Home page";
	}

	@GetMapping("/user")
	public String userPage() {
		return "User Page";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "Admin Page";
	}
	
	@GetMapping("/check")
	public String check(Authentication auth) {
	    return auth.getAuthorities().toString();
	}
}
