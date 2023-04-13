package com.developerrafu.boletoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BoletoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoletoServiceApplication.class, args);
	}

}
