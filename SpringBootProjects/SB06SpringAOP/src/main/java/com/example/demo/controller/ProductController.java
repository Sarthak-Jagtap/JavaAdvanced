package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping("/add")
	public String add() {
		return service.addProduct();
	}

	@GetMapping("/delete")
	public String delete() {
		return service.deleteProduct();
	}
}
