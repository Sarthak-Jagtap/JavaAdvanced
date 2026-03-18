package com.example.model;

import java.time.LocalDate;

public class Student {

	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	private String mobile;
	private double cgpa;

	public Student(int id, String name, String email, LocalDate dob, String mobile, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.mobile = mobile;
		this.cgpa = cgpa;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}
