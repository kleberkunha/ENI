package com.JavaPrimefaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class ProjectLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectLearningApplication.class, args);

		System.out.println("test");
	}


}
