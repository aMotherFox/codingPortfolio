package com.my.FoodTruckApp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class AppetizerController {
    AppetizerModel appetizer1 = new AppetizerModel(1, "small", "spicy", "dinner", 4);
    AppetizerModel appetizer2 = new AppetizerModel(2, "medium", "sweet", "breakfast", 6);
    ArrayList<AppetizerModel> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));


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



    @PutMapping("/appetizers/{id}")
    public AppetizerModel changeObject(@RequestBody AppetizerModel requestBody, @PathVariable Integer id) {

        Optional<AppetizerModel> optionalAppetizerById = appetizers.stream().filter(appetizer -> appetizer.getId().equals(id)).findFirst();

        if (optionalAppetizerById.isPresent()) { //ensures we are entering object that exists
            AppetizerModel foundAppetizer = optionalAppetizerById.get();
            foundAppetizer.setPrice(requestBody.getPrice());
            foundAppetizer.setFlavor(requestBody.getFlavor());
            foundAppetizer.setPairedMeal(requestBody.getPairedMeal());
            foundAppetizer.setSize(requestBody.getSize());
            //if field is NULL, throw exception
            if (requestBody.getPrice() == null) {
                System.out.println("The price is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            } if (requestBody.getFlavor() == null) {
                System.out.println("The flavor is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            } if (requestBody.getPairedMeal() == null) {
                System.out.println("The meal is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            } if (requestBody.getSize() == null) {
                System.out.println("The size is null");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
            return foundAppetizer;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

    }

   @PatchMapping("/appetizers/{id}")
    public AppetizerModel changeField(@RequestBody AppetizerModel requestBody, @PathVariable Integer id) {
       Optional<AppetizerModel> optionalAppetizerById = appetizers.stream().filter(appetizer -> appetizer.getId().equals(id)).findFirst();

       if (optionalAppetizerById.isPresent()) { //ensures we are entering object that exists
           AppetizerModel foundAppetizer = optionalAppetizerById.get();
           foundAppetizer.setPrice(requestBody.getPrice());
           foundAppetizer.setFlavor(requestBody.getFlavor());
           foundAppetizer.setPairedMeal(requestBody.getPairedMeal());
           foundAppetizer.setSize(requestBody.getSize());
           //if field is NULL, do not update field to NULL
           return foundAppetizer;
       }
       throw new ResponseStatusException(HttpStatus.NOT_FOUND);

   }
}

// TODO: Change put to allow you to change all fields except for ID
// TODO: create a Patch that allows you to change a specific field
// TODO: PUT should require you to update the entire object, not just the field

//RESTFUL APIS have conventions/patterns we abide by; i.e. RESTFUL APIS will return and recieve JSON
//naming scheme is RESTFUL API, the URI should be self explanitory; appetizer -> "/appetizers/"




/*
Dependency Injection:
An instance of a class managed by the Spring container
Spring IOC manages all containers
 */