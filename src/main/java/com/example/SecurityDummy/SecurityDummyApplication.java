package com.example.SecurityDummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.SecurityDummy.controller", "com.example.SecurityDummy.config"})
public class SecurityDummyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDummyApplication.class, args);
	}

}
