package com.vidyo.moderatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ModeratorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModeratorAppApplication.class, args);
	}

}
