package HackerRank;

import java.util.Scanner;

public class Ques01 {

	public static int lexicoValue(String subStr) {

		return 0;
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		smallest = s.substring(0, k);
		largest = s.substring(0, k);

		int n = s.length();
		for (int i = 1; i < n - k + 1; i++) {

			String subString = s.substring(i, i + k);
			if (smallest.compareTo(s.substring(i, i + k)) > 0) {
				smallest = subString;
			}
			if (largest.compareTo(s.substring(i, i + k)) < 0) {
				largest = subString;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}