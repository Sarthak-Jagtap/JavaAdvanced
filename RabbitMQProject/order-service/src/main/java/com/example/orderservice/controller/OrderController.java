
package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Order;
import com.example.orderservice.service.OrderProducer;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderProducer producer;
	
	@PostMapping
	public String createOrder(@RequestBody Order order) {
		producer.placeOrder(order);
		return "Order Placed Successfully";
	}
}
