package com.example.demo.plugin;

import org.springframework.stereotype.Component;

import com.example.demo.core.Capability;

@Component
public class PluginCapability implements Capability {

	@Override
	public String getName() {
		return "Plugin Capability";
	}

}
