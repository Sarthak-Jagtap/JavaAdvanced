/*
 * Different types of Functional Interface
 * 
 * */

import java.util.function.*;

public class Demo7 {
	public static void main(String [] args) {
		
		// 1. Predicate
		Predicate<Integer> p1 = age -> (age > 18);
		System.out.println(p1.test(17));
		
		// 2. Function
		Function<String,Integer> toInt = x -> Integer.parseInt(x);
		System.out.println(toInt.apply("101665"));
		
		// 3. Consumer
		Consumer<Integer> toUpper = s -> System.out.println(s);
		toUpper.accept(100);

	}
}
