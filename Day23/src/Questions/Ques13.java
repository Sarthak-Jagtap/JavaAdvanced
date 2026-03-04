package Questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Product Stock Update:
 * 
 * You have two lists : CurrentInventory and NewArrivals. Update the quantity id
 * products and add new ones to the list.
 * 
 * Map operations (merge or putIfAbsent)
 */

public class Ques13 {

	public static void main(String[] args) {

		Map<String, Integer> currentInventory = new HashMap<>();
		Map<String, Integer> newArrivals = new HashMap<>();

		newArrivals.entrySet().stream().forEach(e -> currentInventory.merge(e.getKey(), e.getValue(), Integer::sum));

		System.out.println(currentInventory);
	}
}
