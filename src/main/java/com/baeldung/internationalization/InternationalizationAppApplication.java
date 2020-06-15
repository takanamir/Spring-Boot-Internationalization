package com.baeldung.internationalization;

import javax.annotation.security.RolesAllowed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternationalizationAppApplication {

	@RolesAllowed("*")
	public static void main(String[] args) {
		SpringApplication.run(InternationalizationAppApplication.class, args);
	}

}