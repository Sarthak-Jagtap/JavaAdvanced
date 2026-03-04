package PaymentSystem;

public abstract class PaymentProcessor {
	String transactionId;
	double amount;
	enum Status {
		PENDING, SUCCESS, FAILED
	}
	Status status;
	double transcationAmount;
	
	public PaymentProcessor(String transactionId, double amount) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.status = Status.PENDING;
	}
	
	abstract boolean validatePayment();
	abstract boolean executeTransaction(double transactionAmount);
	
	public void printRecipt() {
		System.out.println("Payment " + status);
		System.out.println("Trasaction Id : " + transactionId );
		if(status != Status.FAILED)
			System.out.println("Transaction amount :" + transcationAmount);
		else
			System.out.println("No amount deducted...");
		System.out.println("Current Balance : " + amount);
	}
	
	final void process() {
		if(validatePayment()) {
			if(executeTransaction(transcationAmount)) {
				status = Status.SUCCESS;
			}else {
				status = Status.FAILED;
			}
		}else {
			status = Status.FAILED;
		}
	}
}
