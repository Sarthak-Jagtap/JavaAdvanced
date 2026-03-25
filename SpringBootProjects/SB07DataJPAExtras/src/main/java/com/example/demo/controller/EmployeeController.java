package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping
	public String save(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return "Employe Added";
	}
	
	@GetMapping
	public List<Employee> getAll(){
		return service.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	
	
}
