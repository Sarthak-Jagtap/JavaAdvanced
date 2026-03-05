package com.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Ram", 50000.00);
		Employee emp2 = new Employee(102, "Lakshaman", 60000.00);

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);

		Department d = new Department(1, "Pune", list);

		Session session = HBUtil.getSessionFactory().openSession();

		session.beginTransaction();

		session.persist(d);
		session.persist(emp1);
		session.persist(emp2);
		

		session.getTransaction().commit();

	}
}
