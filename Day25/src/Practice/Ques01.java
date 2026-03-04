package Practice;

import java.util.*;

/**
 * 1️⃣ Even Numbers from List
 * 
 * Given:
 * 
 * List<Integer> numbers = Arrays.asList(3, 10, 5, 8, 20, 15);
 * 
 * 
 * Tasks:
 * 
 * Print only even numbers using Stream.
 * 
 * Return their square values.
 * 
 * Find the maximum even number.
 */

public class Ques01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 10, 5, 8, 20, 15);

		numbers.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

		numbers.stream().map(e -> e * e).forEach(System.out::println);

		System.out.println(numbers.stream().max(Comparator.comparingInt(e -> e)).get());
	}
}
