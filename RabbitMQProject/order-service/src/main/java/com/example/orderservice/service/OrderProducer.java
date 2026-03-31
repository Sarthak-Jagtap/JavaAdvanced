package com.example.orderservice.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Order;
import com.example.orderservice.config.RabbitConfig;

@Service
public class OrderProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void placeOrder(Order order) {

		// ConvertandSend will convert java object into a message.
		rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.ROUTING_KEY, order);

		System.out.println("Order Sent " + order.getOrderId());
	}
}
