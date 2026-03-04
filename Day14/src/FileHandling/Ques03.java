package FileHandling;

import java.io.*;
import java.util.Scanner;

// Read a file and Display the line containing a given word
public class Ques03 {

	public static void main(String[] args) {
		String path = "src/FileHandling/input01.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path)); Scanner sc = new Scanner(System.in);) {

			String line;
			
			System.out.print("Enter a word : ");
			String word = sc.next();

			while ((line = br.readLine()) != null) {
				if (line.contains(word)) {
					System.out.println(line);
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
