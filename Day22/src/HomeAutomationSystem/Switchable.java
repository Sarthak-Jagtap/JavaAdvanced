package HomeAutomationSystem;

public interface Switchable {
	enum Status{
		ON, OFF
	}
	void turnOn();
	void turnOff();
}
