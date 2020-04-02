package com.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class LoggerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		logger.info(" LoggerApplication ");
		SpringApplication.run(LoggerApplication.class, args);
	}

}
