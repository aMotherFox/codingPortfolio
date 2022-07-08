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

    //------------------------create an appetizer through POST and add to list-------------------------------------------
    @PostMapping("/appetizers")
    public AppetizerModel createAppetizer(@RequestBody AppetizerRequestBody appRequestBody) {
        System.out.println("Creating an appetizer with requestBody: " + appRequestBody);
        Integer id = appetizers.get(appetizers.size() - 1).getId() + 1; //getting the ID # of the last object in the list and adding +1 to it so it becomes the next ID

        AppetizerModel appetizer = new AppetizerModel(
                id, //+1 from last ID in list to become new ID
                appRequestBody.getAppSize(),
                appRequestBody.getAppFlavor(),
                appRequestBody.getAppPairedMeal(),
                appRequestBody.getAppPrice()
        );
        appetizers.add(appetizer); //adding new appetizer to list
        return appetizer;
    }

    //------------------------get appetizer by ID-------------------------------------------
    @GetMapping("/appetizers/{id}")
    public Optional<AppetizerModel> getAppById(@PathVariable Integer id) {
        System.out.println("getting app by id: " + id);
        Optional<AppetizerModel> appetizerById = appetizers.stream().filter(appetizer -> appetizer.getId() == id).findFirst();
        return appetizerById;
    }


    //------------------------PUTMAPPING must enter all fields-------------------------------------------
    @PutMapping("/appetizers/{id}")
    public AppetizerModel changeObject(@RequestBody AppetizerModel requestBody, @PathVariable Integer id) {

        Optional<AppetizerModel> optionalAppetizerById = appetizers.stream().filter(appetizer -> appetizer.getId().equals(id)).findFirst();
        //find appetizer by ID

        if (optionalAppetizerById.isPresent()) { //isPresent ensures we are entering object that exists, if the ID (ID we found above) exists, it will be plugged in here
            AppetizerModel foundAppetizer = optionalAppetizerById.get();
            foundAppetizer.setPrice(requestBody.getPrice());
            foundAppetizer.setFlavor(requestBody.getFlavor());
            foundAppetizer.setPairedMeal(requestBody.getPairedMeal());
            foundAppetizer.setSize(requestBody.getSize());
            //will set field if new value is inputted on PostMan
            //if field is NULL aka not changed on PostMan, throw exception
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
            return foundAppetizer; //if app existed AND all field requirements were met
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        // throwing exception if no item by id exists
    }

    //------------------------PATCHMAPPING one or multiple fields-------------------------------------------
   @PatchMapping("/appetizers/{id}")
    public AppetizerModel changeField(@RequestBody AppetizerModel requestBody, @PathVariable Integer id) {
       Optional<AppetizerModel> optionalAppetizerById = appetizers.stream().filter(appetizer -> appetizer.getId().equals(id)).findFirst();
       //find appetizer by ID

       if (optionalAppetizerById.isPresent()) { //isPresent ensures we are entering object that exists, if the ID (ID we found above) exists, it will be plugged in here
           AppetizerModel foundAppetizer = optionalAppetizerById.get();
           if (requestBody.getPrice() == null) { //only GETTING price to check if null, not setting it
               System.out.println("before change" + foundAppetizer);
               return foundAppetizer;
           }
           foundAppetizer.setPrice(requestBody.getPrice()); //price was NOT NULL so moved to this ELSE, which is where we set price
           System.out.println("after change" + foundAppetizer);

           if (requestBody.getFlavor() == null) {//only GETTING flavor to check if null, not setting it
               System.out.println("before change" + foundAppetizer);
               return foundAppetizer;
           }
           foundAppetizer.setFlavor(requestBody.getFlavor());//flavor was NOT NULL so moved to this ELSE, which is where we set price
           System.out.println("after change" + foundAppetizer);

           if (requestBody.getSize() == null) {//only GETTING size to check if null, not setting it
               System.out.println("before change" + foundAppetizer);
               return foundAppetizer;
           }
           foundAppetizer.setSize(requestBody.getSize());//size was NOT NULL so moved to this ELSE, which is where we set price
           System.out.println("after change" + foundAppetizer);

           if (requestBody.getPairedMeal() == null) {//only GETTING pairedMeal to check if null, not setting it
               System.out.println("before change" + foundAppetizer);
               return foundAppetizer;
           }
           foundAppetizer.setPairedMeal(requestBody.getPairedMeal());//pairedMeal was NOT NULL so moved to this ELSE, which is where we set price
           System.out.println("after change" + foundAppetizer);
           return foundAppetizer;
       }
       throw new ResponseStatusException(HttpStatus.NOT_FOUND);
       // throwing exception if no item by id exists
   }
}

// TODO: Change put to allow you to change all fields except for ID
// TODO: create a Patch that allows you to change a specific field
// TODO: PUT should require you to update the entire object, not just the field

//RESTFUL APIS have conventions/patterns we abide by; i.e. RESTFUL APIS will return and recieve JSON
//will use HTTP methods
//naming scheme is RESTFUL API, the URI should be self explanitory; appetizer -> "/appetizers/"
//URI is plural and about the model being worked on; car -> "/cars/"




/*
Dependency Injection:
An instance of a class managed by the Spring container
Spring IOC manages all containers
 */