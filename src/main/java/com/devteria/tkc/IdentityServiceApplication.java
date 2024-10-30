package com.devteria.tkc;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;

import java.util.logging.Logger;
@ComponentScan(basePackages="com.devteria")
@SpringBootApplication
public class IdentityServiceApplication extends SpringBootServletInitializer {
	private static Logger logger = Logger.getLogger(IdentityServiceApplication.class.getName());

	public static void main(String[] args) {
		// Log phiên bản của Spring trước khi khởi chạy ứng dụng
		logger.info("SPRING VERSION: " + SpringVersion.getVersion());

		// Chạy ứng dụng Spring Boot
		SpringApplication.run(IdentityServiceApplication.class, args);
	}
}

