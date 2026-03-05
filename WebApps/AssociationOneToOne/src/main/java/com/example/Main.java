package com.example;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {

		// Employee 1
		ParkingSpot p1 = new ParkingSpot();
		p1.setId(101);
		p1.setLocation("A1");

		Employee e1 = new Employee("Amit Sharma", 55000, p1);
		p1.setEmployee(e1);

		// Employee 2
		ParkingSpot p2 = new ParkingSpot();
		p2.setId(102);
		p2.setLocation("B2");

		Employee e2 = new Employee("Priya Patil", 62000, p2);
		p2.setEmployee(e2);
		
		// Employee 3
		ParkingSpot p3 = new ParkingSpot();
		p3.setId(103);
		p3.setLocation("C3");

		Employee e3 = new Employee("Rahul Verma", 70000, p3);
		p3.setEmployee(e3);


		Session session = HBUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		session.persist(e1);
		session.persist(p1);
		
		session.persist(e2);
		session.persist(p2);
		
		session.persist(e3);
		session.persist(p3);
		
		session.getTransaction().commit();
		
	}
}