package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	@CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
	public String placeOrder() {
	    try {
	        String response = restTemplate.getForObject(
	            "http://localhost:8082/payment",
	            String.class
	        );
	        return "Order Placed " + response;
	    } catch (Exception e) {
	        throw e; // important → let circuit breaker handle it
	    }
	}

	// MUST match method signature + Exception
	public String paymentFallback(Throwable t) {
	    return "Order Placed → Payment Service is DOWN (Fallback)";
	}
}
