package com.example;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("smartThermostat")
public class SmartThermostat implements SmartDevice{

	
	
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("Setting temperature to 22°C.");
	}
	
	@PostConstruct
    public void init() {
        System.out.println("Thermostat initialized.");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Thermostat shutting down.");
    }
}
