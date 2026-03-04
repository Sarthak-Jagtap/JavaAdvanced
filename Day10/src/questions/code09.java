package questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class code09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reduce to find factorial
		
				Integer num = 5;
				
				Integer fact = IntStream.range(1, num+1)
						.reduce(1, (a,b) -> a*b);
				
				System.out.println(fact);
	}
}
