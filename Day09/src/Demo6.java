/*
 * Using Lambda Function 
 * 
 * */


@FunctionalInterface
interface Rectangle{
	int area(int x, int y);
}

@FunctionalInterface
interface Add{
	void sum(int a, int b);
}


public class Demo6 {
	public static void main(String[] args) {
		
//		Lambda Function with return type
		Rectangle obj = (int x, int y)-> x * y;
		
		System.out.println(obj.area(5,10));
		
//		Lambda Function without return type
		Add obj2 = (a,b) -> System.out.println("Sum = "+ (a+b));
		obj2.sum(10,20);
	}
}
