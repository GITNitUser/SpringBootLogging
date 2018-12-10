package com.nit.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggingApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootLoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingApplication.class, args);
		logger.error("Message Logged at ERROR level");
		logger.warn("Message Logged at WARN level");
		logger.debug("Message Logged at DEBUG level");
		logger.info("Message Logged at INFO level");
	}
}
