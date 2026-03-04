package HackerRankQuestions;

import java.util.Scanner;
import java.util.Stack;

/***
 * Given a list of strings containing parentheses ( and ), return 1 if the
 * pattern can be made balanced with a single switch, otherwise return 0. Note:
 * The pattern must be almost balanced, meaning it should be close to forming a
 * valid balanced expression.
 * 
 */


public class ValidParantheses {
	
	public static int canBalance(String input) {
		
		int n = input.length();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i<n; i++) {
			char ch = input.charAt(i);
			if(ch == '(') {
				stack.push(ch);
			}else {
				if(!stack.empty() && ch == ')') {
					stack.pop();
				}
			}
		}
		
		System.out.println(stack);
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		System.out.println(canBalance(input));
		
		sc.close();
	}
}
