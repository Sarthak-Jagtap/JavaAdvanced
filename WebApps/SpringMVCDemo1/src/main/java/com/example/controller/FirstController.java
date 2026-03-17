package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "DYP University");
		
		return "home";
	}
	
	@GetMapping("/login")	
	public String login(Model model) {
		model.addAttribute("name", "Sarthak Jagtap");
		return "login";
	}
}
