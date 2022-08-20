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

/*
- Create a brand new Spring boot application (from scratch) FoodTruckApp
- Add any necessary dependencies
- Create a AppetizerController
- Create a POST endpoint to create an appetizer
- Create a GET all, GET by id endpoints
- Create a PUT endpoint to update an existing appetizer
 ex: update all fields in an appetizer (but the ID)
- Create a PATCH endpoint to update an existing appetizer's field - ANY field
ex: update ONLY the price, or update BOTh the price AND the title
 */