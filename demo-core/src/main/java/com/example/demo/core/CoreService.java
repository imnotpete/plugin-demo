package com.example.demo.core;

import org.springframework.stereotype.Component;

@Component
public class CoreService implements DemoService {

	@Override
	public String getName() {
		return "Core Service";
	}

}
