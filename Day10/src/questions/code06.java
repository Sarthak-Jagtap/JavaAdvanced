package questions;

import java.util.*;
import java.util.stream.Collectors;

public class code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Flatten list of lists
		
		
		List<List<Integer>> list = Arrays.asList( Arrays.asList(10,20,30), Arrays.asList(35,25), Arrays.asList(40,15,55));
		
		List<Integer> flat = list.stream()
				.flatMap(Collection::stream).
				collect(Collectors.toList());
		
		System.out.println(flat);
	}
}
