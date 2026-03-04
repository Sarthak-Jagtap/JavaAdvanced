package FileHandling;

import java.io.*;
import java.util.Scanner;

// Append a line to an existing file.
public class Ques07 {

	public static void main(String[] args) {
		String path = "src/FileHandling/output01.txt";

		String line;
		StringBuffer content = new StringBuffer();

		try (BufferedReader br = new BufferedReader(new FileReader(path));) {

			while ((line = br.readLine()) != null) {
				content.append(line + "\n");
			}

			System.out.println(content);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (Scanner sc = new Scanner(System.in); 
				BufferedWriter wr = new BufferedWriter(new FileWriter(path));) {
			content.append(sc.nextLine());
			
			wr.write(content.toString());


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
