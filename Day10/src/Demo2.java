import java.util.*;
import java.util.function.*;

public class Demo2 {

	public static void main(String[] args) {
		
		Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
		printUpper.accept("insfansdnaisd");
		
		Supplier<Integer> random = () -> new Random().nextInt(100);
		System.out.println("Random Number : " + random.get());
	}	
}
