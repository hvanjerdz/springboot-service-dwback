package com.backend.app.moneystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServiceMoneystoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceMoneystoreApplication.class, args);
	}

}
