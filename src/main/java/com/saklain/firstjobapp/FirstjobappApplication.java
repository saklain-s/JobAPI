package com.saklain.firstjobapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.saklain.firstjobapp",
		"com.saklain.firstjobapp.job",
		"com.saklain.firstjobapp.company",
		"com.saklain.firstjobapp.review"
})
@EntityScan(basePackages = {
		"com.saklain.firstjobapp.job",
		"com.saklain.firstjobapp.company",
		"com.saklain.firstjobapp.review"
})
@EnableJpaRepositories(basePackages = "com.saklain.firstjobapp")
public class FirstjobappApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstjobappApplication.class, args);
	}
}

