package Questions;

import java.util.Scanner;

/**
 * 
 * Problem Statement 2–
 * 
 * Write a function to solve the following equation a3 + a2b + 2a2b + 2ab2 + ab2
 * + b3.
 * 
 * Write a program to accept three values in order of a, b and c and get the
 * result of the above equation.
 */

public class Ques02 {

	public static int equation(int a, int b) {

		int result = 0;

		result += a * a * a;
		result += a * a * b;
		result += 2 * a * a * b;
		result += 2 * a * b * b;
		result += a * b * b;
		result += b * b * b;

		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(equation(a, b));
		
		sc.close();
	}
}
