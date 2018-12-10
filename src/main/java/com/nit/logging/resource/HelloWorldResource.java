package com.nit.logging.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.logging.SpringBootLoggingApplication;

@RestController
public class HelloWorldResource {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldResource.class);
	@RequestMapping("/")
	public String welcome() {
		logger.error("Message Logged at ERROR level");
		logger.warn("Message Logged at WARN level");
		logger.debug("Message Logged at DEBUG level");
		logger.info("Message Logged at INFO level");
		return "HelloWorld";
	}
}
