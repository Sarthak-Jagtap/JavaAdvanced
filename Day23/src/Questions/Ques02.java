package Questions;

/**
 * Compress the consecutive repeating character string to there count
 * 
 * eg = aaabbbbccdddddeeefffffffff
 * answer = a3b4c2d5e3f8
 * */

public class Ques02 {
	public static String reduceString(String s) {
		StringBuffer result = new StringBuffer();
		
		char ch = s.charAt(0);
		int charCount = 1;
		for(int i = 1; i<s.length(); i++) {
			if(ch == s.charAt(i) && i != s.length() - 1) {
				charCount++;
			}else {
				result.append(ch);
				result.append(charCount);
				
				ch = s.charAt(i);
				charCount = 1;
			}
		}
		
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reduceString("aaabbbbccdddddeeefffffffff"));
	}
}
