package com.example;

import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "regular")
public class RegularEmployee extends Employee {

	double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
