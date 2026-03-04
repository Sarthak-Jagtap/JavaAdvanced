package Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find the first non repeating character.
 * 
 * Use a Stream to find the first non repeating character in the string.
 * 
 * Logic : Convert the string to a stream stream of chars, use groupingBy with
 * LinkedHashMap to maintain order, and find the first entry with count of 1.
 */

public class Ques06 {
	public static void main(String[] args) {
		String str = "askdljhfjjzjasbdbibiabsdifbbihsad";


		Optional<Character> ch = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.findFirst()
				.map(Map.Entry::getKey);
		
		Optional<Character> ch1 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst();
		
		System.out.println(ch);
		System.out.println(ch1);
	}
}
