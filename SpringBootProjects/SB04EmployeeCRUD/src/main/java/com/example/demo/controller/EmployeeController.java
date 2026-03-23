package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	public EmployeeService service;

	@GetMapping("/")
	public String getAll(Model model) {
		
		model.addAttribute("employees",service.getAllEmployees());
		return "home";
	}
	
	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "add";
	}
	
	@PostMapping("/save")
	public String postMethodName(@ModelAttribute Employee employee ) {
		//TODO: process POST request
		service.saveEmployee(employee);
		return "redirect:/";
	}
	

	@GetMapping("/{id}")
	public Employee getById(@PathVariable Long id) {
		return service.getEmployeeById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {

		service.deleteEmployee(id);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String editingForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", service.getEmployeeById(id));
		return "edit";
	}
	
	
}
