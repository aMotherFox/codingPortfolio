package com.my.FoodTruckApp.appetizer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class AppetizerRepository {
    Appetizer appetizer1 = new Appetizer(1, "small", "spicy", "dinner", 4);
    Appetizer appetizer2 = new Appetizer(2, "medium", "sweet", "breakfast", 6);
    ArrayList<Appetizer> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));

    public ArrayList<Appetizer> getAllAppetizers() {
        return appetizers;
    }
}
