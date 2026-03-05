package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

/**
 * Build Employee Management System using Criteria API
 * 
 * Tables: EmployeeData
 * 
 * Queries to implement:
 * 
 * - Employees with salary > 50000
 * 
 * - Employees in IT department
 * 
 * - Count employees per department
 * 
 * - Highest salary employee
 * 
 * - Employees hired between two dates
 * 
 * - Search employees dynamically
 */

public class EmployeeDao {

	// Add Employee
	public void addEmployee(Employee emp) {
		try (Session session = HBUtil.getSessionFactory().openSession()) {
			Transaction tr = session.beginTransaction();
			session.persist(emp);
			tr.commit();
		}
	}

	// Get all
	public void getAll() {

		// Step 1:
		try (Session session = HBUtil.getSessionFactory().openSession()) {
			// Step 2:
			CriteriaBuilder cb = session.getCriteriaBuilder();

			// Step 3:
			CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
			Root<Employee> root = cq.from(Employee.class);
			cq.select(root);

			// Step 4:
			Query<Employee> query = session.createQuery(cq);

			// Step 5:
			List<Employee> list = query.getResultList();

			for (Employee e : list) {
				System.out.println(e);
			}

		}
	}

	// Employees with salary > 50000
	public void getAllBySalary(int threshold) {

		// Step 1:
		try (Session session = HBUtil.getSessionFactory().openSession()) {
			// Step 2:
			CriteriaBuilder cb = session.getCriteriaBuilder();

			// Step 3:
			CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
			Root<Employee> root = cq.from(Employee.class);
			cq.select(root).where(cb.gt(root.get("salary"), threshold));
			
			
			// Step 4:
			Query<Employee> query = session.createQuery(cq);
			
			// Step 5: 
			List<Employee> list = query.getResultList();
			for(Employee e : list) {
				System.out.println(e);
			}
		}
	}
}
