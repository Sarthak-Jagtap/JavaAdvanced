/*
 * Using Anonymous Class Which is deprecated So we will be 
 * using Lambda Function.
 * 
 * */


@FunctionalInterface
interface Square{
	int area(int x);
}

public class Demo5 {
	public static void main(String[] args) {
		
//		Anonymous Class
		Square obj = new Square() {
			
			@Override
			public int area(int x) {
				System.out.println("Area of Square");
				return x*x;
			}
		};
		
		obj.area(5);
	}
}
