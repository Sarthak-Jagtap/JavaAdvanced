package com.example;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentService{

	@Override
	public void processPayment(double amoumt) {
		// TODO Auto-generated method stub
		
		System.out.println("Credit Card");
		
	}
}
