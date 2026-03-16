package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

	private PaymentService paymentService;
	private NotificationService notificationService;
	
	
	@Autowired
	public OrderService(PaymentService paymentService, NotificationService notificationService) {
		this.notificationService = notificationService;
		this.paymentService = paymentService;
	}
	
	public void placeOrder(double amount) {
		paymentService.processPayment(amount);
		notificationService.sendNotification("Order Placed successfully : " + amount);
	}
	
}
