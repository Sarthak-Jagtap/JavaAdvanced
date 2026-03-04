package Questions;

public class Ques01 {

	/***
	 * Given a string of length n containing some # character, move all hashes to
	 * the start of the string.
	 */

	public static String moveHashes(String s) {

		StringBuffer result = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				result.insert(0, '#');
			} else {
				result.append(s.charAt(i));
			}
		}

		return result.toString();
	}

	/***
	 * Given a string of length n containing some characters, move all vowels to the
	 * start of the string.
	 */

	public static String moveVowels(String s) {

		StringBuffer result = new StringBuffer();
		int vowelCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				result.insert(vowelCount, s.charAt(i));
				vowelCount++;
			} else {
				result.append(s.charAt(i));
			}
		}

		return result.toString();
	}

	/***
	 * Given a string of length n containing some characters, move all non
	 * Alphabetic characters to the start of the string.
	 */

	public static String moveNonAlpha(String s) {

		StringBuffer result = new StringBuffer();
		int nonAlphaCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z')) {
				result.insert(nonAlphaCount, ch);
				nonAlphaCount++;
			} else {
				result.append(ch);
			}
		}

		return result.toString();
	}

	/***
	 * Given a string of length n containing some characters, move all UpperCase
	 * characters to the start of the string.
	 */
	
	public static String moveUppercase(String s) {
		StringBuffer result = new StringBuffer();
		
		int upperCaseCount = 0;
		
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				result.insert(upperCaseCount, ch);
				upperCaseCount++;
			}else {
				result.append(ch);
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(moveHashes("hello#world#good#morning##"));
		System.out.println(moveVowels("helloworldgoodmornin"));
		System.out.println(moveNonAlpha("a#b1C$d"));
		System.out.println(moveUppercase("AbscdfNsdjJKasdkDJJKD"));
	}
}
