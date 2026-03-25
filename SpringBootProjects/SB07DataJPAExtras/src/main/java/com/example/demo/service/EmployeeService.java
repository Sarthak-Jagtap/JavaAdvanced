package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public void addEmployee(Employee employee) {
		repository.save(employee);
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
	}
	
	public void deleteEmployeeById(int id) {
		repository.deleteById(id);
	}
	
	public List<Employee> getEmployeeByDepartment(String department) {
		return repository.findByDepartment(department);
	}
	
	public List<Employee> getByNameContaing(String str){
		return repository.findByNameContaining(str);
	}
	
	public List<Employee> getEmployeesWithSalaryGreaterThan(double salary){
		return repository.findBySalaryGreaterThan(salary);
	}
	
	public List<Employee> getByDeptartmentAndSalary(String department, double salary){
		return repository.findByDepartmentAndSalary(department, salary);
	}
	
	public List<Employee> getEmployeeByDept(String dept){
		return repository.getEmployeByDept(dept);
	}
	
	public List<Employee> getEmployeesWithSalaryLessThan(double salary){
		return repository.getLowSalaryEmployee(salary);
	}
}

