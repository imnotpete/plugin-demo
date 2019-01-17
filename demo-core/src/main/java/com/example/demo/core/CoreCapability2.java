package com.example.demo.core;

import org.springframework.stereotype.Component;

@Component
public class CoreCapability2 implements Capability {

	@Override
	public String getName() {
		return "Core Capability 2";
	}

}
