package questions;

import java.util.*;
import java.util.stream.Collectors;

public class code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Count occurrences of each element
		
		
		List<Integer> list = Arrays.asList(1,2,4,5,7,8,9,6,3,1,5,4,2,5,5,6,6,5,3);
		
		Map<Integer, Long> freq = list.stream()
				.collect(Collectors.groupingBy(ele -> ele, Collectors.counting()));
				
		System.out.println(freq);
	}
}
