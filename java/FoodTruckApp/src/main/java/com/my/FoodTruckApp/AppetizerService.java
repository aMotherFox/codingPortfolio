package com.my.FoodTruckApp;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Service
@Data //has all the getters, setters, and toString built in

public class AppetizerService {

    public static String testingDependancyInjectionMethod() {
        System.out.println("This is the appetizer service");
        String testResult = "appetizer service";
        return testResult;
    } // TESTING THE GET IN POSTMAN

    AppetizerModel appetizer1 = new AppetizerModel(1, "small", "spicy", "dinner", 4);
    AppetizerModel appetizer2 = new AppetizerModel(2, "medium", "sweet", "breakfast", 6);
    ArrayList<AppetizerModel> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));

    //---------------------------------------------------------------------------------------------------------------------------------
    public ArrayList<AppetizerModel> getListOfAppetizers() {
        System.out.println("These are the appetizers: " + appetizers);
        return appetizers;
    }
    //---------------------------------------------------------------------------------------------------------------------------------
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
    //---------------------------------------------------------------------------------------------------------------------------------
    public Optional<AppetizerModel> getAppById(@PathVariable Integer id) {
        System.out.println("getting app by id: " + id);
        Optional<AppetizerModel> appetizerById = appetizers.stream().filter(appetizer -> appetizer.getId() == id).findFirst();
        return appetizerById;
    }
    //---------------------------------------------------------------------------------------------------------------------------------
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
    //---------------------------------------------------------------------------------------------------------------------------------
       public AppetizerModel changeField(@RequestBody AppetizerModel requestBody, @PathVariable Integer id) {
       Optional<AppetizerModel> optionalAppetizerById = appetizers.stream().filter(appetizer -> appetizer.getId().equals(id)).findFirst();
       //find appetizer by ID

           //we want to find the optional appetizer
           //figure out if field is set to null
           //IF field == null, do not change field
           //else, set field
           //cannot return or loop will stop

       if (optionalAppetizerById.isPresent()) { //isPresent ensures we are entering object that exists, if the ID (ID we found above) exists, it will be plugged in here
           AppetizerModel foundAppetizer = optionalAppetizerById.get();
           if (requestBody.getPrice() == null) { //only GETTING price to check if null, not setting it
               System.out.println("before change" + foundAppetizer);
               return foundAppetizer; //this is incorrect because it stops the code when the field is null, so rest of fields don't run
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
