import java.util.*;
import java.util.stream.*;

public class Demo6 {

	public static void main(String[] args) {
		
		// Operations on Stream
		// Get count of numbers make them distinct.
		
		long count = Stream.iterate(0,x -> new Random().nextInt(101))
				.limit(200)
				.distinct()
				.sorted()
				.count();
		
		System.out.println(count);
	}	
}
