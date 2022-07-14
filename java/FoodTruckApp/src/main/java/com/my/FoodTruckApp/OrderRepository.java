package com.my.FoodTruckApp;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
//@RequiredArgsConstructor //necessary for the dependency injection to the repository
public class OrderRepository {

//    private final EntreeService entreeService; //getting an instance of the service, THIS IS THE DEPENDENCY INJECTION
//    private final AppetizerService appetizerService; //spring will look through the variables and see if they have a DEPENDENCY on this service

    Appetizer appetizer1 = new Appetizer(1, "small", "spicy", "dinner", 4);
    Appetizer appetizer2 = new Appetizer(2, "medium", "sweet", "breakfast", 6);
    ArrayList<Appetizer> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));
    //----------------------------------------------------------------------------------------------------------------------------------------
    Entree entree1 = new Entree(1, "medium", "spicy", "dinner", 14);
    Entree entree2 = new Entree(2, "large", "sweet", "breakfast", 16);
    ArrayList<Entree> entrees = new ArrayList<>(Arrays.asList(entree1, entree2));
    //----------------------------------------------------------------------------------------------------------------------------------------
    Order order1 = new Order(1, appetizer1, entree1);
    Order order2 = new Order(2, appetizer2, entree2);
    ArrayList<Order> orders = new ArrayList<>(Arrays.asList(order1, order2));

    public ArrayList<Appetizer> getAllAppetizers() { return appetizers;}
    public ArrayList<Entree> getAllEntrees() { return entrees;}
    public ArrayList<Order> getAllOrders() { return orders;}
}

//we are getting an object THROUGH the ID{id} of the appetizer and entree
//return ust be object, input must be integer