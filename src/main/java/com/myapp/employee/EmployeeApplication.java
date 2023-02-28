package com.myapp.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microsoft.applicationinsights.attach.ApplicationInsights;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationInsights.attach();
		SpringApplication.run(EmployeeApplication.class, args);
	}

}