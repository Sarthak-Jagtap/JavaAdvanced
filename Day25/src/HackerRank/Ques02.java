package HackerRank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Ques02 {

	public static String detectEmails(String para) {

		String[] words = para.split(" ");
		List<String> toBeEmails = new ArrayList<>();

		StringBuffer result = new StringBuffer();

		for (int i = 0; i < words.length; i++) {
			if (words[i].contains("@") && words[i].contains(".")) {
				toBeEmails.add(words[i]);
			}
		}
		System.out.println(toBeEmails);
		Iterator<String> itr = toBeEmails.iterator();
		while (itr.hasNext()) {
			String str = itr.next();

			result.append(str);
			result.append(';');
		}

		return result.toString();
	}

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

//    	Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

		StringBuffer para = new StringBuffer();

		try (BufferedReader br = new BufferedReader(new FileReader("src/HackerRank/input.txt"));) {

			String line;
			while ((line = br.readLine()) != null) {
				para.append(line);
				para.append(" \n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(para);

		String result = detectEmails(para.toString());
//
		System.out.println(result);

//        sc.close();

	}
}