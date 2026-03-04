import java.util.*;
import java.util.stream.*;

public class Demo4 {

	public static void main(String[] args) {
		
		// Operations on Stream
		// Get a Even number list from infinite list of numbers.
		
		Stream<Integer> stream1 = Stream.iterate(1,n->n+1);
		stream1 = stream1.limit(100);

		stream1 = stream1.filter(n -> n%2 == 0);
				
		List<Integer> evenNumbers = stream1.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
	}	
}
