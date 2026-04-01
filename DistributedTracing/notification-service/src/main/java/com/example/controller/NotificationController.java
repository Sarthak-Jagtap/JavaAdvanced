package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

	@GetMapping("/notify")
	public String notifyUser() {
		return "Notification sent \n";
	}
	
}
