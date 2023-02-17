package com.amba.service.mfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.amba.service.mfa"})
public class LtServiceAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtServiceAuthApplication.class, args);
	}

}
