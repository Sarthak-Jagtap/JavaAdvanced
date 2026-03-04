package HackerRankQuestions;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Question 2 - rounding up using BigDecimal for custom class
 * 
 * Create Custom class
 */


class Product{
	private String name;
	private BigDecimal price;
	
	public Product(String name, String price) {
		this.name = name;
		this.price = new BigDecimal(price);
	}
	
	public BigDecimal getRoundPrice(int decimalPlace) {
		return price.setScale(decimalPlace, RoundingMode.CEILING);
	}

}

public class BigDecimalDemo {
	public static void main(String[] args) {
		Product item = new Product("Widget","10.2621354");
		
		BigDecimal rounded = item.getRoundPrice(3);
		
		System.out.println(rounded);
	}
}
