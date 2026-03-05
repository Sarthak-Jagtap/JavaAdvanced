package com.example;

import java.time.LocalDate;

public class Main {
	
	public static void addSampleData() {
		EmployeeDao dao = new EmployeeDao();

		dao.addEmployee(new Employee("Amit Sharma", 55000, "IT", LocalDate.of(2022, 1, 10)));
		dao.addEmployee(new Employee("Priya Patil", 62000, "HR", LocalDate.of(2021, 5, 12)));
		dao.addEmployee(new Employee("Rahul Verma", 70000, "Finance", LocalDate.of(2020, 3, 20)));
		dao.addEmployee(new Employee("Renu Joshi", 48000, "Marketing", LocalDate.of(2023, 2, 15)));
		dao.addEmployee(new Employee("Rohit Gupta", 52000, "IT", LocalDate.of(2021, 7, 18)));
		dao.addEmployee(new Employee("Neha Kulkarni", 65000, "Finance", LocalDate.of(2019, 11, 5)));
		dao.addEmployee(new Employee("Karan Mehta", 72000, "IT", LocalDate.of(2020, 9, 25)));
		dao.addEmployee(new Employee("Pooja Deshmukh", 50000, "HR", LocalDate.of(2022, 6, 8)));
		dao.addEmployee(new Employee("Ankit Singh", 54000, "Marketing", LocalDate.of(2021, 8, 14)));
		dao.addEmployee(new Employee("Meera Iyer", 68000, "Finance", LocalDate.of(2020, 4, 30)));

		dao.addEmployee(new Employee("Vikas Yadav", 47000, "Support", LocalDate.of(2023, 1, 22)));
		dao.addEmployee(new Employee("Shreya Nair", 61000, "IT", LocalDate.of(2022, 10, 11)));
		dao.addEmployee(new Employee("Arjun Reddy", 75000, "Management", LocalDate.of(2019, 12, 3)));
		dao.addEmployee(new Employee("Kavita Jain", 53000, "HR", LocalDate.of(2021, 3, 17)));
		dao.addEmployee(new Employee("Manish Agarwal", 67000, "Finance", LocalDate.of(2020, 5, 9)));
		dao.addEmployee(new Employee("Ritika Shah", 56000, "Marketing", LocalDate.of(2022, 7, 13)));
		dao.addEmployee(new Employee("Aditya Rao", 71000, "IT", LocalDate.of(2019, 6, 28)));
		dao.addEmployee(new Employee("Deepak Mishra", 49000, "Support", LocalDate.of(2023, 4, 2)));
		dao.addEmployee(new Employee("Nisha Kapoor", 63000, "HR", LocalDate.of(2020, 8, 19)));
		dao.addEmployee(new Employee("Sahil Khan", 58000, "Marketing", LocalDate.of(2021, 9, 23)));

		System.out.println("20 Employee Added Successfully!");
		
	}

	public static void main(String[] args) {
		
//		addSampleData();
		
		EmployeeDao dao = new EmployeeDao();
		
		dao.getAll();
		dao.getAllBySalary(60000);
				
	}
}