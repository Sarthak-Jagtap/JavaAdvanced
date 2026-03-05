package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profileData")
public class Profile {

	@Id
	private int id;
	private String number;
	private String address;

	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

	public Profile() {

	}

	public Profile(int id, String number, String address, User user) {
		super();
		this.id = id;
		this.number = number;
		this.address = address;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
