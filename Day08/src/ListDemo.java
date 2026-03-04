import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(30);
		
		System.out.println(list.reversed());

		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.println(set);
		
		List<Integer> list2 = new ArrayList<Integer>(set);
		System.out.println(list2);

		List<Object> list3 = Arrays.asList(set.toArray());

		System.out.println(list3);
	}
}
