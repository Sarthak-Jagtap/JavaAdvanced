package FileHandling;

import java.io.*;
import java.util.Scanner;

// Store even and odd in different files.
public class Ques08 {

	public static void main(String[] args) {
		String path1 = "src/FileHandling/output02a.txt";
		String path2 = "src/FileHandling/output02b.txt";
		try (BufferedWriter wr1 = new BufferedWriter(new FileWriter(path1));
				BufferedWriter wr2 = new BufferedWriter(new FileWriter(path2));
				Scanner sc = new Scanner(System.in);) {

			int arr[] = new int[] {1,2,4,2,5,7,8,9,4,9,7,8,9,5,4,63,1,6,6,32,3,6,6,21,32,65,4,56,32};
			for(int  i = 0; i<arr.length; i++) {
				if(arr[i]%2 == 0) {
					wr1.write(Integer.toString(arr[i]) + " ");
				}else {
					wr2.write(Integer.toString(arr[i]) + " ");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
