package Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Vowel Count and Sort Take a list of Strings and Sort them based on total
 * number of Vowels they containing. in descending order.
 * 
 * Custom Comparator with stream().sorted()
 */

public class Ques09 {
	
	public static int countVowel(String s) {
		
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			
			
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {

		Comparator<String> custComp = (str1, str2) -> {
			
			if(countVowel(str1) > countVowel(str2))
				return -1;
			
			return 0;
		};
		
		List<String>  str = new ArrayList<>();
		
		List<String> result = str.stream().sorted(custComp).toList();
		
		System.out.println(result);
		
	}
}
