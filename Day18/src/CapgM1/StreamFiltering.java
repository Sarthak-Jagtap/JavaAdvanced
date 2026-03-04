package CapgM1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 3. Java 8 Stream Filtering on Custom Objects Scenario: Given a List<Product>,
 * use Streams to filter products with a price > 500, sort them by name, and
 * collect them into a new list.
 * 
 * • Key Concept: Using stream(), .filter(), .sorted(),
 * and .collect(Collectors.toList()). Capgemini heavily tests Lambda
 * expressions in M1.
 */

class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + " - $" + price;
	}
}

public class StreamFiltering {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Laptop", 1200), new Product("Mouse", 25),
				new Product("Keyboard", 75), new Product("Monitor", 300), new Product("Phone", 800));

		List<Product> result = products.stream().filter(product -> product.getPrice() > 500)
				.sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());

		result.forEach(System.out::println);
	}
}
