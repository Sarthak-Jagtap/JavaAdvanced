package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 5️⃣ Polymorphism + Stream
 * 
 * Create:
 * 
 * abstract class Shape { abstract double area(); }
 * 
 * 
 * Subclasses:
 * 
 * Circle
 * 
 * Rectangle
 * 
 * Store them in:
 * 
 * List<Shape> shapes
 * 
 * 
 * Tasks:
 * 
 * Calculate total area using Stream.
 * 
 * Find shape with maximum area.
 * 
 * Filter shapes with area > 100.
 */

abstract class Shape {
	abstract double area();
}

class Circle extends Shape {
	double r;

	Circle(double r) {
		this.r = r;
	}

	public double area() {
		return 3.14 * r * r;
	}
}

class Rectangle extends Shape {
	double a;
	double b;

	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double area() {
		return a * b;
	}
}

public class Ques05 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();

		list.add(new Circle(5));
		list.add(new Circle(3));
		list.add(new Rectangle(10, 5));
		list.add(new Rectangle(4, 6));
		list.add(new Circle(7));

		
		// Calculate total area using Stream.
		
		double totalArea = list.stream().collect(Collectors.summingDouble(Shape::area));
		double totalArea2 = list.stream().map(Shape::area).reduce(Double::sum).get();
		
		System.out.println(totalArea);
		System.out.println(totalArea2);
		
		// Find shape with maximum area.
		double maxArea = list.stream().map(Shape::area).max(Double::compareTo).get();
		
		
		// Filter shapes with area > 100.
		
		list.stream().filter(e->e.area() > 100).forEach(System.out::println);
		
	}
}
