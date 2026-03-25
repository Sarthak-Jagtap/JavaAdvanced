package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRespositroy;

@Service
public class ProductService {

	@Autowired
	private ProductRespositroy repository;

	public void saveProduct(Product product) {
		repository.save(product);
	}

	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteProductById(int id) {
		repository.deleteById(id);
	}

	public List<Product> filterProduct(Category category, Double min, Double max) {

		// both category + price
		if (category != null && min != null && max != null) {
			return repository.findByCategoryAndPriceBetween(category, min, max);
		}

		// only category
		if (category != null) {
			return repository.findByCategory(category);
		}

		// only price
		if (min != null && max != null) {
			return repository.findByPriceBetween(min, max);
		}

		// no filters
		return repository.findAll();
	}

}
