package HomeAutomationSystem;

public interface Connectable {
	default void syncStatus() {
		System.out.println("Syncing with cloud...");
	}
}
