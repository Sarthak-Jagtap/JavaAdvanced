package PaymentSystem;

import java.util.ArrayList;
import java.util.List;

public class CreditCardProcessor extends PaymentProcessor implements Notifyable , Refundable{

	List<Double> transactionHistory = new ArrayList<>();
	AlertChannel channel;
	public CreditCardProcessor(String transactionId, double amount, String alertChannel) {
		super(transactionId, amount);
		// TODO Auto-generated constructor stub
		channel = alertChannel.equals("Email") ? AlertChannel.Email : AlertChannel.SMS;

	}

	@Override
	boolean validatePayment() {
		if(transactionId.length() == 16) {
			return true;
		}
		return false;
	}

	@Override
	boolean executeTransaction(double transactionAmount) {
		// TODO Auto-generated method stub
		if(transactionAmount > amount) {
			return false;
		}else {
			amount = amount - transactionAmount;
			transactionHistory.add(transactionAmount * -1);
			return true;
		}
	}
	
	@Override
	public void initializeRefund(double refundAmount) {
		if(transactionHistory.contains(refundAmount)) {
			amount = amount + refundAmount;
			transactionHistory.add(refundAmount);
		}else {
			System.out.println("Rufund not possible. Invalid Refund Request");
		}
	}
	
	@Override
	public void sendAlert(String message) {
		if(channel == AlertChannel.Email) {
			System.out.println("Alert Message on Email...");
			printRecipt();
		}else {
			System.out.println("Alert Message on SMS");
			printRecipt();
		}
	}

}
