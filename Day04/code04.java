import java.util.*;
class Demo{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		ArrayList<String> al = new ArrayList<String>(5);

		for(int i= 0; i<5; i++){

			al.add(sc.next());
		}
		
		System.out.println(al);

		System.out.println(al.get(0) + " " + al.get(2));

		System.out.println("Replace the 2nd item");
		al.set(1, sc.next());
		System.out.println(al);

		System.out.println("Removing the 3rd item");
		al.remove(al.get(3));
		System.out.println(al);

		System.out.println("Give an item to add at last");
		
		al.add(sc.next());

		System.out.println(al);


	}
}
