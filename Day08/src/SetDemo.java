import java.util.*;


public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(15);
		set.add(15);
		set.add(20);
		set.add(19);
		set.add(10);
		
		for(Integer temp : set) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}

}
