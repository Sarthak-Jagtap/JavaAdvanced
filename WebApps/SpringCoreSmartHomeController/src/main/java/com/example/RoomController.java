package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class RoomController {
	
	SmartDevice smartDevice;

	
	public RoomController(@Qualifier("smartLight") SmartDevice smartDevice) {
		// TODO Auto-generated constructor stub
		this.smartDevice = smartDevice;
	}
	
	public void controlDevice() {
	    smartDevice.operate();
	}
}
