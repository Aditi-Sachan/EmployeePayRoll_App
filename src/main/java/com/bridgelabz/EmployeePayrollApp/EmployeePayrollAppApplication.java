package com.bridgelabz.EmployeePayrollApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j // Enables logging
@SpringBootApplication
public class EmployeePayrollAppApplication {
	public static void main(String[] args) {
		// Capture ApplicationContext
		ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);

		// Log the active environment
		log.info("Employee Payroll App started in {} Environment",
				context.getEnvironment().getProperty("spring.profiles.active", "default"));

		log.info("Employee Payroll DB User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));
	}
}

