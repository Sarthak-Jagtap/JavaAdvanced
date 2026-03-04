package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		System.out.println(numbers);

		// 1. Find all even numbers
		List<Integer> l1 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);

		// 2. Find all odd numbers
		List<Integer> l2 = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(l2);

		// 3. Multiply each number by 2
		List<Integer> l3 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(l3);

		// 4. Find numbers greater than 25
		List<Integer> l4 = numbers.stream().filter(n -> n > 25).collect(Collectors.toList());
		System.out.println(l4);

		// 5. Count total numbers
		Integer count = (int) numbers.stream().count();
		System.out.println(count);

		// 6. Find sum of all numbers
		Integer sum = (int) numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

		// 7. Find max and min
		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
		OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
		System.out.println(max);
		System.out.println(min);

		// 8. Convert all numbers to String
		List<String> l8 = numbers.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(l8);
		
		
		List<String> names = Arrays.asList("Sekhar", "Amit", "Anita", "Ravi", "Suman", "Ajay");
		System.out.println(names);
		
		// 9. Names starting with "A"
		List<String> l9 = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		System.out.println(l9);
		
		// 10. Names ending with "i"
		List<String> l10 = names.stream().filter(n->n.endsWith("i")).collect(Collectors.toList());
		System.out.println(l10);
		
		// 11. Convert all names to uppercase
		List<String> l11 = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(l11);
		
		// 12. Sort names alphabetically
		List<String> l12 = names.stream().map(n -> n.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println(l12);
		
		// 13. Sort names by length
		List<String> l13 = names.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println(l13);
		
		// 14. Find first name starting with "S"
		Optional<String> l14 = names.stream().filter(s->s.startsWith("S")).findFirst();
		System.out.println(l14);
		
		// 15. Check if any name starts with "R"
		boolean l15 = names.stream().filter(s->s.startsWith("S")).findFirst().isPresent();
		System.out.println(l15);
		
		// 16. Check if all names have length > 3
		boolean l16 = !names.stream().filter(s->s.length() < 3).findFirst().isPresent();
		System.out.println(l16);
		
		
	}

}
