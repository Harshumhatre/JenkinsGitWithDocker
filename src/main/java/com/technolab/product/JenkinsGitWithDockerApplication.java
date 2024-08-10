package com.technolab.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsGitWithDockerApplication {
	
	@GetMapping("/")
	public void getData() {
		System.out.println("Hi Harshad");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsGitWithDockerApplication.class, args);
	}

}
