package HackerRankQuestions;

import java.util.Scanner;

/**
 * You are given a lowercase English string S. Each character in the string is
 * assigned a numeric value based on its position in the English alphabet using
 * a grouped mapping system: the characters 'a' and 'b' are assigned a value of
 * 1, 'c', 'd', and 'e' are assigned a value of 2, 'f', 'g', and 'h' are
 * assigned a value of 3, and so on, such that every group of 3 characters after
 * 'b' gets the next increasing value, ending with 'x', 'y', and 'z' receiving a
 * value of 9. Your task is to find the total number of substrings of S such
 * that the sum of the values of the characters in the substring is divisible by
 * the length of that substring. The goal is to count all such valid substrings
 * that satisfy this condition.
 * 
 */

public class SubStringQues {
	
	public static int charValue(char ch) {
		int i = ch;
		return (i-93)/3;
	}
	
	public static int subStringValue(String subStr) {
		int sum = 0;
		for(int i = 0; i<subStr.length(); i++) {
			sum += charValue(subStr.charAt(i));
		}
		
		return sum;
	}

	public static int countValidSubString(String str) {

		int count = 0;
		
		int n = str.length();
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				String subStr = str.substring(i, j+1);
				if(subStr.length() == subStringValue(subStr)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(countValidSubString(str));
				
		sc.close();
	}
}
