package questions;

import java.util.*;
import java.util.stream.Collectors;

public class code05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Count occurrences of each element
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		Map<Boolean, List<Integer>> part = list.stream()
				.collect(Collectors.partitioningBy(n -> n%2 == 0));
		System.out.println(part);
	}
}
