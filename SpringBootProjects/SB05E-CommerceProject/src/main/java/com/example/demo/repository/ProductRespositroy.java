package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Category;
import com.example.demo.model.Product;


public interface ProductRespositroy extends JpaRepository<Product, Integer>{

	public List<Product> findByCategory(Category category);
	
	public List<Product> findByPriceBetween(double min, double max);
	
	public List<Product> findByCategoryAndPriceBetween(Category category, double min, double max);
}
