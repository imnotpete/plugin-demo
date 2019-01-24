package com.example.demo.application;

import org.springframework.stereotype.Component;

import com.example.demo.core.DemoService;

@Component
public class ApplicationService implements DemoService {

	@Override
	public String getName() {
		return "Application Service";
	}

}
