package com.rt.core;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStarter {
	
	public static void main(String args[]) {
		System.out.println("Welcome to RT Core Application server...");
		System.out.println("Initializing RT Core Application server...");
		SpringApplication.run(ApplicationStarter.class, args);
		System.out.println("RT Core Application Server initialization completed.");
		System.out.println("RT Core Application Server Started.");
	}

}
