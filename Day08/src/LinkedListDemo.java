import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(15);
		linkedList.add(70);
		
		System.out.println(linkedList);
		
		Iterator<Integer> itr = linkedList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(linkedList);

		linkedList.remove(3);
		System.out.println(linkedList);
		
		System.out.println(linkedList.contains(15));
		
		System.out.println(linkedList.size());
		
		linkedList.removeLast();
		
		System.out.println(linkedList);
	}

}
