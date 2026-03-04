package FileHandling;

import java.io.*;
import java.util.Scanner;

// Read numbers from a file and find the sum and average.
public class Ques04 {

	public static void main(String[] args) {
		String path = "src/FileHandling/input02.txt";

		int count = 0;
		int sum = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path));) {

			String line;
			

			while ((line = br.readLine()) != null) {
				String[] nums = line.split(" ");
				
				for(int i = 0; i<nums.length; i++) {
					if(nums[i] != "") {
						try {
							sum += Integer.parseInt(nums[i]);
						}catch(NumberFormatException fm) {
							i++;
						}
						count++;
					}
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+(sum/count));
	}
}
