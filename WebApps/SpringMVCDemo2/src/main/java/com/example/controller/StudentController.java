package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Student;

@Controller
public class StudentController {

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "form";
	}
	
	@PostMapping("/submit")
	public String handleForm(@ModelAttribute("student") Student student, Model model) {
		
		model.addAttribute("studData", student);
		return "result";
	}
}
