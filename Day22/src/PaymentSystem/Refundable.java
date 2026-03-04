package PaymentSystem;

public interface Refundable {
	void initializeRefund(double refundAmount);
	
	default void logNotification() {
		System.out.println("Notification logged to system");
	}
}
