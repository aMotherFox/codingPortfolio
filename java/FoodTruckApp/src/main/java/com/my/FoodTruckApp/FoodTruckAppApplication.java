package com.my.FoodTruckApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodTruckAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckAppApplication.class, args);

		System.out.println("We are making a food truck!");
	}

}
