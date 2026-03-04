package Practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 2️⃣ Remove Duplicates Using Stream
 * 
 * Given:
 * 
 * List<String> names = Arrays.asList("John", "Jane", "John", "Alex", "Jane");
 * 
 * 
 * Tasks:
 * 
 * Remove duplicates.
 * 
 * Sort alphabetically.
 * 
 * Convert all to uppercase.
 * 
 * Collect into a Set.
 */

public class Ques02 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "John", "Alex", "Jane");

		names.stream().distinct().forEach(System.out::println);

		names.stream().sorted().forEach(System.out::println);

		names.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println(names.stream().collect(Collectors.toSet()));

	}
}
