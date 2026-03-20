package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/addProduct")
	public String toAddProduct(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}
	
	@PostMapping("/submit")
	public String addProducts(@ModelAttribute Product product, Model model) {
		service.productList.add(product);
		return "home";
	}	
	
	@GetMapping("/showAll")
	public String toShowAll(Model model) {
		model.addAttribute("productList", service.productList);
		return "showAll";
	}
	
	@GetMapping("/home")
	public String goHome() {
		return "home";
	}
	
}
