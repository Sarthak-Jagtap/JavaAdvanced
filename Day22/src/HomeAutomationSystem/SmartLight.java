package HomeAutomationSystem;

public class SmartLight implements Switchable, Dimmable, Connectable, Updatable{

	int level = 0;
	Status lightStatus = Status.OFF;
	@Override
	public void setBrightness(int level) {
		// TODO Auto-generated method stub
		if(level > 100) {
			return;
		}
		this.level = level;
		if(level == 0) {
			lightStatus = Status.OFF;
		}
		lightStatus = Status.ON;
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		lightStatus = Status.ON;
		setBrightness(100);
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		lightStatus = Status.OFF;
		setBrightness(0);
	}

	@Override
	public void syncStatus() {
		// TODO Auto-generated method stub
		Connectable.super.syncStatus();
	}

	
}
