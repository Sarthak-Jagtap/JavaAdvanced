package FileHandling;

import java.io.*;
import java.util.Scanner;

// Write a user input in the file.
public class Ques06 {

	public static void main(String[] args) {
		String path = "src/FileHandling/output01.txt";
		try (BufferedWriter wr = new BufferedWriter(new FileWriter(path));Scanner sc =  new Scanner(System.in);) {

			String line = sc.nextLine();
			wr.write(line);
			wr.newLine();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
