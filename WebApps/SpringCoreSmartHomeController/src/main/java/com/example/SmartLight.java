package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SmartLight implements SmartDevice{
	
	
	@Value("${light.location:Living Room}")
	private String location;
	

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("Turning on the lights in " + location);
	}

}
