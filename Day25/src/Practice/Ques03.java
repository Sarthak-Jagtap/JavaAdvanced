package Practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 3️⃣ Count Frequency Using Stream + Map
 * 
 * Given:
 * 
 * List<String> words = Arrays.asList("apple", "banana", "apple", "orange",
 * "banana", "apple");
 * 
 * 
 * Tasks:
 * 
 * Count frequency of each word.
 * 
 * Store in Map<String, Long>.
 * 
 * Print only words appearing more than 1 time.
 */

public class Ques03 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

		Map<String, Long> map = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		
		map.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
	}
}
