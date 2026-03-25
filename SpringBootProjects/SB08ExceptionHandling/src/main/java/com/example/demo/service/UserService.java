package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.exception.ResponseNotFoundException;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User createUser(UserDto dto) {
		User user = new User();
		user.setEmail(dto.getEmail());
		user.setName(dto.getName());

		return user;
	}

	public User getUserById(int id) {

		return repository.findById(id).orElseThrow(() -> new ResponseNotFoundException("User not found with id " + id));
	}
}