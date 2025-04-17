package com.hcl.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(AirportManagementSystemApplication.class, args);
		System.out.println("This is Airport management");
	}

}
