package com.example;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	int did;
	String name;

	@OneToMany
	@JoinColumn(name = "deptId")
	List<Employee> list;

	public Department() {

	}

	public Department(int did, String name, List<Employee> list) {
		super();
		this.did = did;
		this.name = name;
		this.list = list;
	}

	public int getId() {
		return did;
	}

	public void setId(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

}
