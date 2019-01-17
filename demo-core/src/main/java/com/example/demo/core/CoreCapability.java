package com.example.demo.core;

import org.springframework.stereotype.Component;

@Component
public class CoreCapability implements Capability {

	@Override
	public String getName() {
		return "Core Capability";
	}

}
