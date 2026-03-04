package PaymentSystem;

public interface Notifyable {
	enum AlertChannel{
		Email, SMS
	}	
	void sendAlert(String message);
}
