package com.example.demoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.File;

import static com.example.demoo.constants.FileConstant.USER_FOLDER;

@SpringBootApplication
public class DemooApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemooApplication.class, args);
		new File(USER_FOLDER).mkdirs();
	}


	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}


}
