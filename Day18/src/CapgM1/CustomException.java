package CapgM1;

/**
 * 
 * 1. Custom Exception for Banking Logic Scenario: Create a custom exception
 * InsufficientFundsException. Write a Withdraw method that throws this if the
 * amount exceeds the balance. • Key Concept: Extending Exception (Checked)
 * vs RuntimeException (Unchecked) and the use of the throw keyword
 * vs throws clause.
 */

class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message) {
		super(message);
	}
}

class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			String message = String.format("Cannot withdraw %.2f. Balance: %.2f", amount, balance);
			throw new InsufficientFundsException(message);
		}
		balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(500.0);

		try {
			account.withdraw(600.0);
		} catch (InsufficientFundsException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
