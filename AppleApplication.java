package com.apple.code.challenge.flagSelector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AppleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AppleApplication.class, args);
	}

}
