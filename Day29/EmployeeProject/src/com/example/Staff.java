package com.example;

import java.time.LocalDate;

public class Staff {
	private int id;
	private String name;
	private LocalDate doj;
	private double salary;

	public Staff() {

	}

	public Staff(int id, String name, LocalDate doj, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.salary = salary;
	}

	public Staff(String name, LocalDate doj, double salary) {
		super();
		this.name = name;
		this.doj = doj;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", doj=" + doj + ", salary=" + salary + "]";
	}

}
