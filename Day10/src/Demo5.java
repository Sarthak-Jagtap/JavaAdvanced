import java.util.*;
import java.util.stream.*;

public class Demo5 {

	public static void main(String[] args) {
		
		// Operations on Stream
		// Get a list of numbers make them distinct and sort them
		// and convert them to a new List.
		
		List<Integer> list = Stream.iterate(0,x -> new Random().nextInt(101))
				.limit(200)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(list.size());
	}	
}
