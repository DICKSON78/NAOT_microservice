package com.currencyconversion.conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.currencyexchange")
public class ConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionApplication.class, args);
	}

}
