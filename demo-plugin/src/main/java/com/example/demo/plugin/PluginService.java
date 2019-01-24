package com.example.demo.plugin;

import org.springframework.stereotype.Component;

import com.example.demo.core.DemoService;

@Component
public class PluginService implements DemoService {

	@Override
	public String getName() {
		return "Plugin Service";
	}

}
