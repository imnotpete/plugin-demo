package com.example.demo.application;

import org.springframework.stereotype.Component;

import com.example.demo.core.Capability;

@Component
public class ApplicationCapability implements Capability {

	@Override
	public String getName() {
		return "Application Capability";
	}

}
