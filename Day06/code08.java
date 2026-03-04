///
// Insuffencient fund exception custom exception.

import java.util.*;

class InsufficientBalance extends RuntimeException{

	InsufficientBalance(String msg){

		super(msg);
	}
}

class Demo{

	public static void main(String arr[]) throws RuntimeException{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter balance");
		int balance = sc.nextInt();

		System.out.println("Enter transaction amount");
		int transferAmount = sc.nextInt();

		if(balance < transferAmount)
			throw new InsufficientBalance("Insufficient balance cannot perform this transaction");
		else
			System.out.println("Transaction complete. \n Current Balance = " + (balance - transferAmount));
	
	}
}
