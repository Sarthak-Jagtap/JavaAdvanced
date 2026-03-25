package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


	// Derived Query Methods
	public List<Employee> findByDepartment(String department);

	// Pattern matching : LIKE
	public List<Employee> findByNameContaining(String name);
	
	// Specific type of Query 
	public List<Employee> findBySalaryGreaterThan(Double salary);
	
	// Multiple Parameters
	List<Employee> findByDepartmentAndSalary(String department, double salary);
	
	// JPQL
	@Query("SELECT e FROM Employee e WHERE e.department = :dept")
	public List<Employee> getEmployeByDept(@Param("dept") String dept);
	
	//Native SQL
	@Query(value = "select * from employees where salary < :salary" , nativeQuery = true)
	List<Employee> getLowSalaryEmployee(@Param("salary") double salary);
}
