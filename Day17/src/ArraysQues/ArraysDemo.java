package ArraysQues;

import java.util.Scanner;

public class ArraysDemo {
	static Scanner sc = new Scanner(System.in);

	public static int[][] getArrayInput(int row, int col) {

		int arr[][] = new int[row][col];

		System.out.println("Enter array Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("arr[" + i + "][" + j + "] : ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	public static void colMulti(int arr[][], int row, int col) {
		for(int j = 0; j<col; j++) {
			int mul = 1;
			for(int i = 0; i< row; i++) {
				mul *= arr[i][j];
			}
			System.out.println(mul);

		}
	}
	
	public static int[][] transpose(int[][] arr, int row, int col){
		int[][] transposeArr = new int[col][row];
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j < col; j++) {
				transposeArr[i][j] = arr[j][i];
			}
		}
		
		return transposeArr;
	}

	public static void rowSum(int arr[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];
				
			}
			System.out.println(sum);
		}
	}
	
	public static int[][] rotate90(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		int rotateArr[][] = new int[col][row];
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; i<col; j++) {
				rotateArr[i][j] = arr[row - i][col - i];
			}
		}
		
		return rotateArr;
	}

	public static void printArr(int arr[][]) {
		
		int row = arr.length;
		int col = arr[0].length;
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		arr = getArrayInput(row, col);

		printArr(arr);
		
		rowSum(arr, row, col);
		
		colMulti(arr, row, col);
		
		int[][] transposeArr = transpose(arr, row, col);
		
		printArr(transposeArr);
		
		int[][] rotateArr = transpose(arr, row, col);
		
		printArr(rotateArr);
	}

}
