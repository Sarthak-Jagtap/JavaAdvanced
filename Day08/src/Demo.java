

public class Demo {
	
	public static void printNos(int n) {
        if(n == 0)
        	return;
        printNos(n-1);
        System.out.print(n + " ");
    }
	
	public static void main(String[] args) {

		printNos(10);
	}
	
//	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		list.add(10);
//		list.add(13);
//		list.add(19);
//		list.add(15);
//		
//		Iterator<Integer> itr = list.iterator();	
//		System.out.println(itr);
//
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		Collections.sort(list);
//		
//		System.out.println(list);
//	}
}
