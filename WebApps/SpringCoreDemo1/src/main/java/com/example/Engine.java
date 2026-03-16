package com.example;

public class Engine {

	public Engine() {
		System.out.println("Engine Created");
	}

	void start() {
		System.out.println("Engine Start");
	}

	public void init() {
		System.out.println("Engine Initialization Completed");
	}

	public void destroy() {
		System.out.println("Engine Destoying");
	}
}
