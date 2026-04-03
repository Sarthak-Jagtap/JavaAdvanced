package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public String order(@PathVariable int id) {
		String user = restTemplate.getForObject("http://user-service/users/" + id, String.class);
		return "Order for user -> " + user;
	}
}


