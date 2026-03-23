package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	public void saveEmployee(Employee employee) {
		repo.save(employee);
	}
	
	public Employee getEmployeeById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
	}
	
	public Employee getByEmail(String email) {
		return repo.findByEmail(email);
	}
}
