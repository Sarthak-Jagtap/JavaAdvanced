package HackerRank;

/**
 * 📝 Count Binary Substrings
 * 
 * Given a string s consisting only of characters '0' and '1', return the number
 * of non-empty substrings that:
 * 
 * Have the same number of 0s and 1s, and
 * 
 * All the 0s and all the 1s in the substring are grouped consecutively.
 */

public class Ques03 {
	
	private static boolean isSameCount(String str) {
		int n = str.length();
		
		int count0 = 0;
		int count1 = 0;
		
		for(int i =0; i < n ;i ++ ) {
			if(str.charAt(i) == '0') {
				count0++;
			}else {
				count1++;
			}
		}
		
		return count0 == count1;
	}
	
	public static boolean isConsecutive(String str) {
		
		for(int i = 0; i<(str.length() / 2) - 1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				return false;
			}
		}
		
		for(int i = str.length() / 2; i<str.length() - 1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int countBinarySubString(String s) {
		
		int n = s.length();
		
		int result = 0;
		
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				String subStr = s.substring(i, j+1);
				
				if(subStr.length() != 0 && subStr.length() % 2 == 0) {
					if(isSameCount(subStr)) {
						if(isConsecutive(subStr)) {
							result++;
						}
					}
				}
				
			}
		}
		
		return result;
	}
	public static void main(String[] args) {

		String str = "00110011";
		System.out.println(countBinarySubString(str));
	}
}
