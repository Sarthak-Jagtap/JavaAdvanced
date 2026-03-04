package FileHandling;

import java.io.*;

// Count number of lines, words and characters in the File.
public class Ques02 {

	public static void main(String[] args) {
		String path = "src/FileHandling/input01.txt";
		
		int lines = 0;
		int words = 0;
		int chars = 0;
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path));) {
			
			
			
			String line;
			while ((line = br.readLine()) != null) {
				lines++;
				chars += line.length();
				
				String[] data = line.split(" ");
				words += data.length;
			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Number of lines = "+ lines);
		System.out.println("Number of Words = "+ words);
		System.out.println("Number of Chars = "+ chars);
	}
}
