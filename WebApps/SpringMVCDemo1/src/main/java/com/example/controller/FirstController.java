package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/form")
	public String showForm(Model model) {
		return "form";
	}
	
	@PostMapping("/submit")
	public String handleForm(@RequestParam("name") String name, Model model) {
		model.addAttribute("messages", "Welcome <b><u>" + name + "</u></b>");
		return "result";
	}
}
