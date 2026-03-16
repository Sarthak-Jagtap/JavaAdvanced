package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

	public void sendNotification(String message) {
		System.out.println("Notification Message : " + message);
	}
}
