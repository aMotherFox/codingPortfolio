package com.my.FoodTruckApp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class AppetizerRepository {
    AppetizerModel appetizer1 = new AppetizerModel(1, "small", "spicy", "dinner", 4);
    AppetizerModel appetizer2 = new AppetizerModel(2, "medium", "sweet", "breakfast", 6);
    ArrayList<AppetizerModel> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));

    public ArrayList<AppetizerModel> getAllAppetizers() {
        return appetizers;
    }
}
