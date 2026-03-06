package com.example;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {

		Employee e1 = new Employee("ShreeRam");

		RegularEmployee e2 = new RegularEmployee();
		e2.setName("Lakshman");
		e2.setSalary(55000.00);

		ContractEmployee e3 = new ContractEmployee();
		e3.setName("Hanuman");
		e3.setPayPerHour(25000.00);

		Session session = HBUtil.getSessionFactory().openSession();

		session.beginTransaction();

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		session.getTransaction().commit();

		session.close();
	}
}
