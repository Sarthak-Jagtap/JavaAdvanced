package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping
	public String addProduct(@ModelAttribute Product product) {
		service.saveProduct(product);
		return "redirect:/products";
	}
	
	@GetMapping
	public String showAllProducts(Model model) {
		model.addAttribute("products", service.getAllProducts());
		return "allProducts";
	}
	
	@GetMapping("/{id}")
	public String showProductDetails(@PathVariable int id, Model model) {
		model.addAttribute("product", service.getProductById(id));
		return "product";
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		service.deleteProductById(id);
		return "Product Deleted Successfully";
	}
	
}
