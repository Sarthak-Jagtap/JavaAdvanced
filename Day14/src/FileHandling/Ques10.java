package FileHandling;

import java.io.*;
import java.util.Scanner;

// Copy data from one file and paste into another
public class Ques10 {

	public static void main(String[] args) {
		String path1 = "src/FileHandling/input01.txt";
		String path2 = "src/FileHandling/output04.txt";

		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(path1));
				BufferedWriter wr = new BufferedWriter(new FileWriter(path2));) {

			while ((line = br.readLine()) != null) {
				wr.write(line);
				wr.newLine();
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
