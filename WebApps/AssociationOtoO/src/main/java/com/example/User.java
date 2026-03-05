package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserData")
public class User {

	@Id
	private int userId;
	private String name;
	private String email;

	@OneToOne(mappedBy = "user")
	private Profile profile;

	public User() {

	}

	public User(int userId, String name, String email, Profile profile) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.profile = profile;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
