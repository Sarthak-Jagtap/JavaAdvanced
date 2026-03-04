package PaymentSystem;

public class CryptoProcessor extends PaymentProcessor{
	public CryptoProcessor(String transactionId, double amount) {
		super(transactionId, amount);
	}
	
	@Override
	boolean validatePayment() {
		// TODO Auto-generated method stub
		
		if(transactionId.startsWith("0x")) {
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
			return true;
		}
	}
	
	
}
