package com.example;

public class Car {

	
	Engine engine;
	
	public Car(Engine engine) {
		System.out.println("Car Created");
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car Running");
	}
	
	public void init() {
		System.out.println("Initialization Completed");
	}
	
	public void destroy() {
		System.out.println("Destoying");
	}
}
