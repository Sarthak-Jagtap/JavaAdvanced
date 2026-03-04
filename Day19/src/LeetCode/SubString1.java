package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 📌 Longest Substring with K Distinct Characters
 * 
 * 🧩 Problem Statement
 * 
 * Given a string S and an integer K, find the length of the longest substring
 * of S that contains exactly K distinct characters.
 * 
 * A substring is a contiguous sequence of characters within a string.
 * 
 * 🎯 Output
 * 
 * Return an integer denoting the length of the longest substring with exactly K
 * distinct characters.
 * 
 * If no such substring exists, return -1.
 * 
 */

public class SubString1 {

	public static int countDistEle(String subString) {
		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < subString.length(); i++) {
			set.add(subString.charAt(i));
		}

		return set.size();
	}

	public static boolean reqSubString(String subString, int k) {

		if (countDistEle(subString) == k) {
			return true;
		}
		return false;
	}

	public static int longestSubString(String str, int k) {

		int maxLen = -1;

		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + k; j < n + 1; j++) {

				if (reqSubString(str.substring(i, j), k)) {
					if (maxLen < str.substring(i, j).length()) {
						maxLen = str.substring(i, j).length();
					}
				}
			}
		}

		return maxLen;
	}

	public static int longestSubStringOpt(String str, int k) {
		if (k == 0 || str.length() == 0)
			return -1;

		HashMap<Character, Integer> map = new HashMap<>();

		int left = 0;
		int maxLen = -1;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

			while (map.size() > k) {
				char leftChar = str.charAt(left);
				map.put(leftChar, map.get(leftChar) - 1);

				if (map.get(str.charAt(left)) == 0)
					map.remove(leftChar);
				left++;
			}

			if (map.size() == k) {
				maxLen = Math.max(maxLen, i - left + 1);
			}

		}

		return maxLen;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int k = sc.nextInt();

		System.out.println(longestSubStringOpt(input, k));

		sc.close();
	}

}
