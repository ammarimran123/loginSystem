package com.internalsystems.loginSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan("com.internalsystems.errorhandlers")
@ComponentScan("com.internalsystems.loginSystem")
@EntityScan("com.internalsystems.entities")

@EnableWebMvc
public class LoginSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginSystemApplication.class, args);
	}

}
