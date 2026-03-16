package com.example;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HomeDashboard {

	List<SmartDevice> list;
	
	public HomeDashboard(List<SmartDevice> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	public void showAll() {
		System.out.println("All Active Devices...");
		for(SmartDevice device : list) {
			device.operate();
		}
	}
}
