package com.my.FoodTruckApp;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeRepository;
import com.my.FoodTruckApp.entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Service //annotation that tells spring THIS IS OUR SERVICE
@RequiredArgsConstructor //necessary for the dependency injection to the repository
public class OrderService {

    private final EntreeService entreeService; //getting an instance of the service, THIS IS THE DEPENDENCY INJECTION
    private final AppetizerService appetizerService; //spring will look through the variables and see if they have a DEPENDENCY on this service
    private final EntreeRepository entreeRepository; //we only have to instantiate this once
    private final AppetizerRepository appetizerRepository; //these are picked up by the @RequiredArgsConstructor
    private final OrderRepository orderRepository;
    // -----------------------------------------------------------------------------------------------------------------------------

//    public String getListOfAppsAndEntrees() {
//        ArrayList<Entree> entrees = entreeService.getListOfEntrees();
//        ArrayList<Appetizer> appetizers = appetizerService.getListOfAppetizers();
//        System.out.println("These are the entrees: " + entrees);
//        System.out.println("These are the appetizers: " + appetizers);
//        return "entrees + appetizers";
//    }
//    public ArrayList<Entree> gettingEntrees() {
//        ArrayList<Entree> entrees = entreeRepository.getAllEntrees();
//        System.out.println("These are the entrees: " + entrees);
//        return entrees;
//    }
    public ArrayList<Order> getListOfOrders() {
        ArrayList<Order> orders = orderRepository.getAllOrders();
        System.out.println("There are the orders: " + orders);
        return orders;
    }
    //--------------------------------------------get order by ID------------------------------------------------------------------------------------
    public Optional<Order>  getOrderById(@PathVariable Integer id) {
        ArrayList<Order> orders = orderRepository.getAllOrders();
        System.out.println("order by id: " + id);
        Optional<Order> orderById = orders.stream().filter(order -> order.getId() == id).findFirst();
        return  orderById;
    }
    //--------------------------------------------get list of appetizers------------------------------------------------------------------------------------
    public ArrayList<Appetizer> getListOfAppetizers() {
        ArrayList<Appetizer> appetizers = orderRepository.getAllAppetizers();
        System.out.println("These are the entrees: " + appetizers);
        return appetizers;
    }
    //--------------------------------------------get list of entrees------------------------------------------------------------------------------------
    public ArrayList<Entree> getListOfEntrees() {
        ArrayList<Entree> entrees = orderRepository.getAllEntrees();
        System.out.println("These are the entrees: " + entrees);
        return entrees;
    }
}
