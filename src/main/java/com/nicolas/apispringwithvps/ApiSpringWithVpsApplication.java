package com.nicolas.apispringwithvps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiSpringWithVpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringWithVpsApplication.class, args);
	}

}
