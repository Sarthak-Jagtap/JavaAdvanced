package HackerRank;

/**
 * 🧩 Problem: Count Substrings That Start and End with '1'
 * 
 * You are given a binary string S consisting only of characters '0' and '1'.
 * 
 * Your task is to count the total number of substrings of S that:
 * 
 * Start with '1'
 * 
 * End with '1'
 */

public class Ques04 {
	
	public static int countSubString(String s) {
		
		int count = 0;
		int n = s.length();
		
		
		for(int i = 0; i< n; i++) {
			for(int j = i; j<n; j++) {
				String subStr = s.substring(i, j+1);
				if(subStr.endsWith("1") && subStr.startsWith("1")) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String str = "1001";
		
		System.out.println(countSubString(str));

	}
}
