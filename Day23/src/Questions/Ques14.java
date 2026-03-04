package Questions;

/**
 * Equilibrium Index:
 * 
 * Find the index in an array where the sum of elements to the left is equal to
 * the sum of element to the right.
 * 
 * Input : {1,2,3,4,6} Output :
 */

public class Ques14 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };

		int totalSum = 0;
		for (int num : arr) {
			totalSum += num;
		}

		int leftSum = 0;

		for (int i = 0; i < arr.length; i++) {

			int rightSum = totalSum - leftSum - arr[i];

			if (leftSum == rightSum) {
				System.out.println(i);
				return;
			}

			leftSum += arr[i];
		}

		System.out.println("No such element");
	}
}
