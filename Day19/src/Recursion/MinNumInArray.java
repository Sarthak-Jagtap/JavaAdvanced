package Recursion;

public class MinNumInArray {
	
	public static int findMin(int[] arr, int n) {
		if(n == 1)
			return arr[0];
		return Math.min(arr[n - 1], findMin(arr, n - 1));
	}
	public static void main(String[] args) {
		
		int arr[] = {23,4,5,6,7,8,9,5,3,23,34,4,65,423,3,55,};
		
		System.out.println(findMin(arr, arr.length));
	}
}
