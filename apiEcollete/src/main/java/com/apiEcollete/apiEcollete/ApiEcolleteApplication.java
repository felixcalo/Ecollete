package com.apiEcollete.apiEcollete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.apiEcollete.apiEcollete.pointsModel")
public class ApiEcolleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEcolleteApplication.class, args);
	}

}
