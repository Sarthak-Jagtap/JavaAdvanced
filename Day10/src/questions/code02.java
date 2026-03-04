package questions;

import java.util.*;
import java.util.stream.Collectors;

public class code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using skip() and get() function
		List<Integer> list = Arrays.asList(1,2,4,5,7,8,9,6,3,1,5,4,2,5,5,6,6,5,3);
		List<Integer> duplicates = list.stream()
				.filter(i -> Collections.frequency(list, i) > 1)
				.distinct()
				.collect(Collectors.toList());				
		
		System.out.println(duplicates);
		
		List<Integer> uniques = list.stream()
				.filter(i -> Collections.frequency(list, i) <= 1)
				.distinct()
				.collect(Collectors.toList());				
		
		System.out.println(uniques);
	}
}
