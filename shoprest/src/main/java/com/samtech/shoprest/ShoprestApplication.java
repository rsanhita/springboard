 package com.samtech.shoprest;

//for thymeleaf - https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-crud


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoprestApplication {
	
	
	public static void main(String[] args) {
		System.out.println("Starting the application.");
		SpringApplication.run(ShoprestApplication.class, args);
	}

}
