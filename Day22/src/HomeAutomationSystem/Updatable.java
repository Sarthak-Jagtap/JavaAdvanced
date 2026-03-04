package HomeAutomationSystem;

public interface Updatable {
	default void syncStatus() {
		System.out.println("Checking for firmware updates...");
	}
}
