import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> vector = new Vector<Integer>();
			
		vector.add(10);
		vector.add(20);
		vector.add(40);
		vector.add(15);
		vector.add(70);
		
		System.out.println(vector);
		
		Iterator<Integer> itr = vector.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(vector);

		vector.remove(3);
		
		System.out.println(vector.contains(15));
		
		System.out.println(vector.size());
	}
}
