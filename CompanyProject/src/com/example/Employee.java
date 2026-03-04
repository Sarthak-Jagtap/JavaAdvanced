package com.example;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String empName;
	private String empEmail;
	private double empSal;
	private int deptId;
	private LocalDate joiningDate;

	public Employee(int empId, String empName, String empEmail, double empSal, int deptId, LocalDate joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSal = empSal;
		this.deptId = deptId;
		this.joiningDate = joiningDate;
	}

	public Employee(String empName, String empEmail, double empSal, int deptId, LocalDate joiningDate) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSal = empSal;
		this.deptId = deptId;
		this.joiningDate = joiningDate;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public double getEmpSal() {
		return empSal;
	}

	public int getDeptId() {
		return deptId;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empSal=" + empSal
				+ ", deptId=" + deptId + ", joiningDate=" + joiningDate + "]";
	}

}
