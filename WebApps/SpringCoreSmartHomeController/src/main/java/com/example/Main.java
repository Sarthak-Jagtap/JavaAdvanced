package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * The Project: Smart Home Controller
 *
 * You are building a system to manage different Smart Devices (Lights,
 * Thermostats) using Spring’s core DI features.
 *
 * Step 1: Interface & Multiple Implementations
 *
 * Create a SmartDevice interface and two implementations.
 *
 * Interface: SmartDevice with a method void operate();
 *
 * Impl A: SmartLight — prints "Turning on the lights."
 *
 * Impl B: SmartThermostat — prints "Setting temperature to 22°C."
 *
 * The Task: Mark both as @Component.
 *
 * Step 2: Constructor Injection with @Qualifier
 *
 * Create a RoomController class that manages one specific device.
 *
 * The Task: Use Constructor Injection to bring a SmartDevice into
 * RoomController.
 *
 * The Goal: Since you have two devices, Spring will get confused. Use
 * the @Qualifier annotation in the constructor to tell Spring specifically to
 * inject the SmartLight.
 *
 * Step 3: Collection Injection
 *
 * Create a HomeDashboard class that monitors all devices in the house.
 *
 * The Task: In the constructor of HomeDashboard, inject a List<SmartDevice>.
 *
 * The Goal: Spring will automatically find all beans that implement SmartDevice
 * and put them in this list.
 *
 * Create a method showAll() that loops through the list and calls operate() on
 * each.
 *
 * Step 4: Using @Value for Configuration
 *
 * Add a configuration property to your SmartLight.
 *
 * The Task: Add a private String field location to SmartLight.
 *
 * The Goal: Use the @Value("${light.location:Living Room}") annotation to set
 * this field.
 *
 * This ensures that if no property is found in application.properties, it
 * defaults to "Living Room."
 *
 * Step 5: Lifecycle Callbacks
 *
 * Add "Startup" and "Shutdown" logic to your devices.
 *
 * The Task: In SmartThermostat, create two methods: init() and cleanup().
 *
 * The Goal: Annotate them with @PostConstruct and @PreDestroy.
 *
 * Print messages to the console to see when Spring creates and destroys the
 * bean.
 */
public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context =
                new AnnotationConfigApplicationContext(AppComfig.class);

        RoomController controller = context.getBean(RoomController.class);
        controller.controlDevice();

        HomeDashboard dashboard = context.getBean(HomeDashboard.class);
        dashboard.showAll();

        ((AbstractApplicationContext) context).close();
	}

}
