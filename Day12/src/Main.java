// User function Template for Java

class Solution {
	static public int longestSubarray(int[] arr, int k) {
		// code here
		int subArrLen = 0;
		int n = arr.length;

		int prefixArray[] = new int[n];
		prefixArray[0] = arr[0];

		for (int i = 1; i < n; i++) {
			prefixArray[i] = arr[i] + prefixArray[i - 1];
		}

		for (int i = 0; i < n; i++) {
			int sum = 0;
			int j;
			for (j = i; j < n; j++) {
				if (i == 0)
					sum = prefixArray[j];
				else {
					sum = prefixArray[j] - prefixArray[i - 1];
				}
//				System.out.println(sum);

				if (sum == k) {
					if (i == 0) {
						if (j + 1> subArrLen)
							subArrLen = j+1;
					} else {
						if (j - i + 1 > subArrLen)
							subArrLen = j - i + 1;
					}
				}
			}

		}

		return subArrLen;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { -5, 8, -14, 2, 4, 12 };
		int k = -5;

		Solution.longestSubarray(arr, k);

		System.out.println(Solution.longestSubarray(arr, k));

	}

}
