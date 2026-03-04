package FileHandling;

import java.io.*;
import java.util.Scanner;

// Add a student data to a file using BufferedWriter
public class Ques09 {

	public static void main(String[] args) {
		String path = "src/FileHandling/output03.txt";
		try (BufferedWriter wr = new BufferedWriter(new FileWriter(path));Scanner sc =  new Scanner(System.in);) {

			wr.write(new Student(101, "Ram", 89.9).toString());
			wr.newLine();
			wr.write(new Student(102, "Lakshaman", 85.6).toString());
			wr.newLine();
			wr.write(new Student(103, "Sita", 94.5).toString());
			wr.newLine();
			wr.write(new Student(104, "Hanuman", 97.3).toString());
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
