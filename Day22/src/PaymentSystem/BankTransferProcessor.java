package PaymentSystem;

public class BankTransferProcessor extends PaymentProcessor implements Notifyable {
	AlertChannel channel;

	public BankTransferProcessor(String transactionId, double amount, String alertChannel) {
		super(transactionId, amount);
		// TODO Auto-generated constructor stub
		channel = alertChannel.equals("Email") ? AlertChannel.Email : AlertChannel.SMS;

	}

	@Override
	public void sendAlert(String message) {
		// TODO Auto-generated method stub
		if (channel == AlertChannel.Email) {
			System.out.println("Alert Message on Email...");
			printRecipt();
		} else {
			System.out.println("Alert Message on SMS");
			printRecipt();
		}
	}

	@Override
	boolean validatePayment() {
		// TODO Auto-generated method stub
		if (transactionId.length() == 12) {
			return true;
		}
		return false;
	}

	@Override
	boolean executeTransaction(double transactionAmount) {
		// TODO Auto-generated method stub
		if (transactionAmount > amount) {
			return false;
		} else {
			amount = amount - transactionAmount;
			return true;
		}
	}

}
