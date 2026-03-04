package FileHandling;

import java.io.*;
import java.util.Scanner;

// Read numbers from a file and find the sum and average.
public class Ques05 {

	public static void main(String[] args) {
		String path = "src/FileHandling/input01.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path));) {

			StringBuffer content = new StringBuffer();
			String line;

			while ((line = br.readLine()) != null) {				
				content.append("\n"+line);
			}
			
			content.reverse();
			System.out.println(content);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
