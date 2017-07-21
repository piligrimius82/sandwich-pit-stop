package com.teamdelta.sandwichpitstop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SandwichPitStopApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SandwichPitStopApp.class, args);

	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SandwichPitStopApp.class);
	}

}
