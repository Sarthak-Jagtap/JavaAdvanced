package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	String newName;

	@GetMapping("/")
	public String home(Model model) {

		model.addAttribute("message", "This is an Thymeleaf");
		model.addAttribute("age", 15);
		model.addAttribute("name", "Ram");

		List<String> itemList = new ArrayList<>();
		itemList.add("Red");
		itemList.add("Blue");
		itemList.add("Green");
		itemList.add("Yellow");
		itemList.add("Pink");

		model.addAttribute("itemList", itemList);

		return "home";
	}
	
	@GetMapping("/home")
	public String goHome() {
		return "home";
	}
}
