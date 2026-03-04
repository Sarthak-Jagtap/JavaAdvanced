package Sorting;



public class Sorting {
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i<n; i++) {
			int minIndex = i;
			for(int j = i; j<n; j++) {
				if(arr[minIndex] >= arr[j])
					minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length ;
		
		for(int i = 0; i<n-1;i++) {
			for(int j = i+1 ; j<n; j++) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,2,8,5,7,6,0,9};
		
		selectionSort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
