package questions;

import java.util.*;
import java.util.stream.Collectors;

public class code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using skip() and get() function
		List<Integer> list = Arrays.asList(1,2,4,5,7,8,9,6,3,1,5,4,66,41,2,5,12,48,5,15,6,6,5,45,3);
		long secLarge = list.stream()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secLarge);
		
		// Using limit()
		List<Integer> thirdLarge = list.stream()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(thirdLarge.get(2));
	}
}
