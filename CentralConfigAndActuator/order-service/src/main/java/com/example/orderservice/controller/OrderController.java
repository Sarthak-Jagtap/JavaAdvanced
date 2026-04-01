package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {

	@Value("${app.name}")
	String name;
	
	@GetMapping("/order")
	public String name(){
		return name;
	}
	
}
