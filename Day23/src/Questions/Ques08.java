package Questions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Remove Duplicate Words Given a sentence, remove all duplicate words and print
 * the unique ones in their original order.
 * 
 * Use: LinkedHashSet or distinct() method of Stream API.
 * 
 */

public class Ques08 {
	public static void main(String[] args) {
		String str = "hell hell oaj nasj asdn dlk asd asd ";

		List<String> str1 = Arrays.stream(str.split(" ")).distinct().collect(Collectors.toList());

		Set<String> str2 = Arrays.stream(str.split(" ")).collect(Collectors.toCollection(LinkedHashSet::new));

		String str3 = Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));

		String str4 = Arrays.stream(str.split(" ")).collect(Collectors.toCollection(LinkedHashSet::new)).stream()
				.collect(Collectors.joining(" "));

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}
}
