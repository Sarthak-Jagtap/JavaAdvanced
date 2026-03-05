package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeData")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	private String name;

	private double salary;

	@OneToOne
	@JoinColumn(name = "spotId")
	ParkingSpot spot;

	public Employee(String name, double salary, ParkingSpot spot) {
		super();
		this.name = name;
		this.salary = salary;
		this.spot = spot;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ParkingSpot getSpot() {
		return spot;
	}

	public void setSpot(ParkingSpot spot) {
		this.spot = spot;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", spot=" + spot + "]";
	}

}
