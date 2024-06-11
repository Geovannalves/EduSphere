package com.tech.edusphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.tech.edusphere.entities")
public class EdusphereApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdusphereApplication.class, args);
	}

}
