package com.test.test_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApiApplication {

	public static void main(String[] args) {
		try {
			// Force le chargement du driver MariaDB
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("MariaDB Driver not found: " + e.getMessage());
		}
		SpringApplication.run(TestApiApplication.class, args);
	}

}
