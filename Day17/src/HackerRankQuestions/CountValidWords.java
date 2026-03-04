package HackerRankQuestions;

import java.util.Scanner;

/**
Given a string s consisting of multiple words separated by spaces, implement a method countValidWords 
that returns the number of valid words in the string.

1. A valid word must satisfy all the following conditions:
2. The word must be at least 3 characters long.
3. The word must contain only alphanumeric characters (letters a-z, A-Z, or digits 0-9). No symbols or 
	punctuation are allowed.
4.The word must contain at least one vowel (a, e, i, o, u in any case).
5. The word must contain at least one consonant (b-z excluding vowels, in any case).

*/


public class CountValidWords {
	
	public static int countValidWords(String str) {
		
		String[] words = str.split(" ");
		
		int count = 0;
		
		for(int i = 0; i<words.length; i++) {
			
			String word = words[i];
			
			if (word.length() >= 3 &&
	                word.matches("[a-zA-Z0-9]+") &&          
	                word.matches(".*[aeiouAEIOU].*") &&   
	                word.matches(".*[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z].*")) { 

	                count++;
	            }
		}
		
		return count;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("No. of Valid Words : " + countValidWords(str));
		
		sc.close();
	}
}
