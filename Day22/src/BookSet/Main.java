package BookSet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		MyBook newBook = new MyBook();
		
		newBook.setTitle(s);
		
		System.out.println("Book title : " + newBook.getTitle());
		
		sc.close();
	}

}
