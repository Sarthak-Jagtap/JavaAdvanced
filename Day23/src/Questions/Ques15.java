package Questions;

/**
 * No - 15 Move Zeros to End:
 * 
 * Task: Move all zeros in an array to the end while maintaining the relative
 * order of non-zero elements.
 * 
 * Example: [0, 1, 0, 3, 12] → [1, 3, 12, 0, 0].
 */

public class Ques15 {

	public static void moveZeros(int[] arr) {

		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[k] = arr[i];
				k++;
			}
		}

		while (k < arr.length) {
			arr[k] = 0;
			k++;
		}
	}
}
