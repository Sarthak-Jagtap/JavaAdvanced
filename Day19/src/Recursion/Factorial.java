package Recursion;


public class Factorial {
	
	public static int fact(int num) {
		if(num == 1)
			return 1;
		return fact(--num) * num;
	}
	public static void main(String[] args) {
		
		System.out.println("Factorail : " + fact(10));
	}

}
