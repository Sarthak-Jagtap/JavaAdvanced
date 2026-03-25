package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User getUserByEmail(String email) {
		return repository.getUserByEmail(email);
	}
	
	public void signupUser(User user) {
		repository.save(user);
	}
	
	
}
