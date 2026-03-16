package com.example;

import org.springframework.stereotype.Component;

@Component
public interface PaymentService {

	public void processPayment(double amoumt);
}
