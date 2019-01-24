package com.example.demo.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.core.DemoService;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DemoApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.exit(SpringApplication.run(DemoApplication.class, args));
	}
	
	@Autowired
	private List<DemoService> services;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n\n\n");

		for (DemoService service : services) {
			System.out.println(String.format("name [%s]", service.getName()));
		}

		System.out.println("\n\n\n\n");
	}
}

