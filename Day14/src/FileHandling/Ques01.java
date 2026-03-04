package FileHandling;

import java.io.*;

// Read a text from file and display it.
public class Ques01 {

	public static void main(String[] args) {
		String path = "src/FileHandling/input01.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path));) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
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
