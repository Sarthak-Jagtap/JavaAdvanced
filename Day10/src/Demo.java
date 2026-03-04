import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		// Here we are using the Functional interface to iterate
		// the array / list. 
		// 
		// USE of FUNCTIONAL INTERFACE we can directly use the 
		// method of interface to iterate the List.
		
		List<Integer> list = Arrays.asList(10,20,30);
		list.forEach(i -> System.out.println(i));
		
		
	}
}
