package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.UserService;
import com.example.demo.enums.Role;
import com.example.demo.model.User;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserService service;

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) {
		User user = service.getUserByEmail(email);

		if (user == null || !password.equals(user.getPassword())) {

			return "error";
		}

		if (user.getRole().equals(Role.ADMIN)) {
			return "admin";
		} else {
			return "customer";
		}
	}

	@PostMapping("/register")
	public String signup(@ModelAttribute User user) {
		service.signupUser(user);
		return "auth";
	}
}
