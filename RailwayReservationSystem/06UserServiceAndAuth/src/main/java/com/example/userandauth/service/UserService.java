package com.example.userandauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.userandauth.model.User;
import com.example.userandauth.repository.UserRepository;
import com.example.userandauth.utility.JwtUtility;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	@Autowired
	private JwtUtility jwtUtility;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public User register(User user) {
	    if (repo.findByUsername(user.getUsername()).isPresent()) {
	        throw new RuntimeException("User already exists");
	    }

	    // 🔥 IMPORTANT LINE
	    user.setPassword(passwordEncoder.encode(user.getPassword()));

	    return repo.save(user);
	}
	
	public String login(User user) {

	    User existingUser = repo.findByUsername(user.getUsername())
	            .orElseThrow(() -> new RuntimeException("User not found"));

	    if (!passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
	        throw new RuntimeException("Invalid password");
	    }

	    return jwtUtility.generateToken(existingUser);
	}
}
