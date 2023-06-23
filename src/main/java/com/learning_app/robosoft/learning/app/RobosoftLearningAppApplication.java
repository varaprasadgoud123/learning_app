package com.learning_app.robosoft.learning.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RobosoftLearningAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobosoftLearningAppApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(){
//		return runner -> {
//			System.out.println("hello world!!!");
//		};
//	}

}
