package CapgM1;

/**
 * 4. Interface Default Methods (The Diamond Problem) Scenario: If Interface
 * A and Interface B both have a default void display() method, and Class
 * C implements both, what happens? 
 * 
 * • Key Concept: Diamond Problem in Java 8.
 * The class will fail to compile unless you override the method and explicitly
 * specify which one to use via A.super.display().
 */

interface A {
	default void display() {
		System.out.println("In A Default");
	}
}

interface B {
	default void display() {
		System.out.println("In B Default");
	}
}

class C implements A, B {

	@Override
	public void display() {
		B.super.display();
	}

}

public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
		c.display();
	}

}
