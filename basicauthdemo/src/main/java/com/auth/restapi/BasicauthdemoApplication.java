package com.auth.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.auth"})
public class BasicauthdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicauthdemoApplication.class, args);
	}

}
