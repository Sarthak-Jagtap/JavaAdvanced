package com.example.paymentservice.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import com.example.model.Order;
import com.example.paymentservice.config.RabbitConfig;

@Service
public class PaymentConsumer {

	@RabbitListener(queues = RabbitConfig.QUEUE)
	public void processPayment(Order order) {
		System.out.println("Processing --- " + order.getOrderId());
		
		if(order.getAmount() > 0) {
			System.out.println("Payment Successful Order Id : " + order.getOrderId());
		}else {
			System.out.println("Payment Faild Order Id : " + order.getOrderId());
		}
	}
	
	
}
