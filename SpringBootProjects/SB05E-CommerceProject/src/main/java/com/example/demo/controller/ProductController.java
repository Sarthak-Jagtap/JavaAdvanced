package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("admin/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@Autowired
	private CategoryService categoryService;
	
	
	@PostMapping
	public String saveProduct(@ModelAttribute Product product) {
		service.saveProduct(product);
		return "redirect:/admin/product-list";
	}
	
	@GetMapping("/add")
	public String addProduct(Model model) {
		model.addAttribute("categories", categoryService.getAllCategories());
		return "admin/add-product";
	}
	
	@GetMapping
	public String showAllProducts(Model model) {
		model.addAttribute("products", service.getAllProducts());
		return "admin/product-list";
	}
	
	@GetMapping("/{id}")
	public String showProductDetails(@PathVariable int id, Model model) {
		model.addAttribute("product", service.getProductById(id));
		return "admin/product-detail";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		service.deleteProductById(id);
		return "redirect:/admin/product-list";
	}
	
}
