package com.my.FoodTruckApp;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class AppetizerController {
    AppetizerModel appetizer1 = new AppetizerModel(1, "small", "spicy", "dinner", 4);
    AppetizerModel appetizer2 = new AppetizerModel(2, "medium", "sweet", "breakfast", 6);
    ArrayList<AppetizerModel> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));

//    @GetMapping("/app") //get appetizer
//    public String getAppetizer() {
//        System.out.println("These are the appetizers: ");
//        return "hi ";
//    }

    @GetMapping("/appetizers") //GET ALL APPS IN LIST
    public List<AppetizerModel> getListOfAppetizers() {
        System.out.println("These are the appetizers: " + appetizers);
        return appetizers;
    }

    @PostMapping("/appetizers") //create an appetizer through POST
    public AppetizerModel createAppetizer(@RequestBody AppetizerRequestBody appRequestBody) {
        System.out.println("Creating an appetizer with requestBody: " + appRequestBody);
        Integer id = appetizers.get(appetizers.size() - 1).getId() + 1;

        AppetizerModel appetizer = new AppetizerModel(
                id,
                appRequestBody.getAppSize(),
                appRequestBody.getAppFlavor(),
                appRequestBody.getAppPairedMeal(),
                appRequestBody.getAppPrice()
        );
        appetizers.add(appetizer);
        return appetizer;
    }

    @GetMapping("/appetizers/{id}") //GET APP BY ID ENDPOINT
    public Optional<AppetizerModel> getAppById(@PathVariable Integer id) {
        System.out.println("getting app by id: " + id);
        Optional<AppetizerModel> appetizerById = appetizers.stream().filter(appetizer -> appetizer.getId() == id).findFirst();
        return appetizerById;
    }


    @PutMapping("/appetizers/")
    public AppetizerModel puttingAppetizer(@PathVariable)

}
