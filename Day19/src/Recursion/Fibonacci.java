package Recursion;

public class Fibonacci {

	public static void fibo(int num1, int num2, int count) {
		
		if(count == 0)
			return;
		System.out.print((num1 + num2) + " ");
		fibo(num2, num1+num2, --count);
	}
	public static void main(String[] args) {
		fibo(0,1, 10);
	}
}
