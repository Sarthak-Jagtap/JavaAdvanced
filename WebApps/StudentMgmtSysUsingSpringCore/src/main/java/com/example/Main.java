package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * project to manage student details.
 * 
 * Student.java
 * 
 * create a student class - with (id, name, course) properties
 * 
 * use setter injection to set values from XML create a method
 * 
 * - show details() to display details
 * 
 * Main.java
 * 
 * load a spring container
 * 
 * get bean from Container
 * 
 * call showDetails.
 * 
 **/

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Student stud = (Student) ctx.getBean("student");

		stud.showDetails();

		((AbstractApplicationContext) ctx).close();

	}
}
