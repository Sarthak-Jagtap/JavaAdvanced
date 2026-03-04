import java.util.*;
import java.util.stream.*;

public class Demo3 {

	public static void main(String[] args) {
		
		// 1. 
		// Using the Collection object and create a Stream
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		Stream<Integer> stream1 = list.stream();
		
		// 2. 
		// Directly using Arrays.stream method.
		
		Stream<String> stream2 = Arrays.stream(new String[] {"Apple", "Banana", "Grapes"});
		
		// 3.
		// by using of() method and pass values to it.
		// of() is a static method in the Stream class.
				
		Stream<Character> stream3 = Stream.of('a','b','c');
		
		// 4. 
		// Creating an infinite stream 
		// Example : 
		// i) numbers from 1 to n 
		// ii) Set of all even numbers
		// This can be done using a static method iterate() present in 
		// Stream class.
		
		Stream<Integer> stream4 = Stream.iterate(0, n->n);
	}	
}
