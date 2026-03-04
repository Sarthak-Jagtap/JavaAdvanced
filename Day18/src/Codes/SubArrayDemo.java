package Codes;

public class SubArrayDemo {
	
	public static int maxKLengthSubArray(int[] arr, int kLength) {
		int n = arr.length;

		
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0 ; i < n - kLength + 1; i++) {
			int sum = 0;
			for(int j = i; j < i + kLength; j++) {
				sum+= arr[j];
			}
			
			if(maxSum < sum)
				maxSum = sum;
		}
		
		return maxSum;
	}
	
/**
 * Sliding window is an approach in which we first make the calculation for the window in 
 * O(n) complexity.
 * Now in the next loop we slide the window, that is we add the next element in the calculation and remove the
 * first element from the window. 
 * 
 * So here: 
 * 1. We will find the sum of first k terms = windowSum
 *    We will use another loop to slide the window
 * 2. We will add the next element in the windowSum
 * 3. Remove the first element from the windowSum.
 * 4. Calculate the windowSum and find maxWindowSum.
 * */	
	
	public static int slidingWindow(int arr[], int kLength) {
		int n = arr.length;
		
		int windowSum = 0;
		
		for(int i = 0; i< kLength; i++) {
			windowSum += arr[i];
		}
		
		int maxSum = windowSum;
		
		for(int i = kLength; i<n; i++) {
			windowSum = windowSum + arr[i];
			windowSum = windowSum - arr[i-kLength];
			
			if(maxSum < windowSum)
				maxSum = windowSum;
		}
		return maxSum;
	}
	
	public static int subStringsOfSizeK(String str, int k) {
		return str.length() - k + 1;
	}
	
	public static int countVowelsInWindow(String str, int k) {
		
		int n = str.length();
		
		int vowelCount = 0;
		
		for(int i = 0; i<k; i++) {
			if("aeiouAEIOU".indexOf(str.charAt(i)) != -1) {
				vowelCount++;
			}
		}
		System.out.println(vowelCount);

		
		for(int i = k; i<n ; i++) {
			if("aeiouAEIOU".indexOf(str.charAt(i)) != -1)
				vowelCount++;
			if("aeiouAEIOU".indexOf(str.charAt(i-k)) != -1)
				vowelCount--;
			
			System.out.println(vowelCount);
		}
		return 0;
	}

	public static void main(String[] args) {

		
		int arr[] = {2,5,4,6,1,7,5};
		
		System.out.println(maxKLengthSubArray(arr, 4));
		
		System.out.println(slidingWindow(arr, 4));

		countVowelsInWindow("dypdpuabcdasdkpooihabvbasd", 4);
		
	}
}
