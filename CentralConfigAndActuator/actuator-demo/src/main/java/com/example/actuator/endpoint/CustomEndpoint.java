package com.example.actuator.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {

	@ReadOperation
	public Map<String, String> customData() {
		Map<String, String> data = new HashMap<>();
		data.put("message", "Custom Actuator Endpoint");
		data.put("status", "SUCCESS");
		return data;
	}
}
