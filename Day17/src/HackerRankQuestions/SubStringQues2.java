package HackerRankQuestions;

/**
 * Question 1 Return the length of the smallest possible substring that can be
 * removed from a given string so that the remaining string contains all unique
 * characters.
 */

public class SubStringQues2 {
	
	public static boolean checkUniqueString(String str) {
		
		int n = str.length();
		
		for(int  i = 0; i<n ; i++) {
			if(str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkSubString(String str, int start, int end) {
		
		StringBuffer newString = new StringBuffer(str);
		newString.replace(start, end, "");
		
		return checkUniqueString(newString.toString());
	}
	
	public static int lenOfSubString(String str) {

	    if (checkUniqueString(str)) {
	        return 0;
	    }

	    int n = str.length();
	    int minLen = Integer.MAX_VALUE;

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j <= n; j++) {
	        	

	            if (checkSubString(str, i, j)) {
		        	System.out.println(str.substring(i, j));


	                int removedLength = j - i;
	                minLen = Math.min(minLen, removedLength);
	            }
	        }
	    }

	    return minLen;
	}

	
	public static void main(String[] args) {
		
		System.out.println(lenOfSubString("abcab"));
	}
}
