package com.my.FoodTruckApp;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeRepository;
import com.my.FoodTruckApp.entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
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
        ArrayList<Order> orders = orderRepository.getAllOrders(); //should have created an order repository method so you can call it instead of re-iterating it
        System.out.println("order by id: " + id);
        Optional<Order> orderById = orders.stream().filter(order -> order.getId() == id).findFirst();
        return  orderById;
    }
    //--------------------------------------------create new order and add to list------------------------------------------------------------------------------------
    public Order createOrder(NewOrderRequestBody newOrderRequestBody) {
        ArrayList<Order> orders = orderRepository.getAllOrders();
        System.out.println("Creating a new order using the request body: " + newOrderRequestBody);
        Integer orderId = orders.get(orders.size() - 1).getId() + 1;

        newOrderRequestBody.getAppetizerIds();
        newOrderRequestBody.getEntreeIds();



//        Optional<Appetizer> appetizer = appetizerService.getAppById();
//        Optional<Entree> entree = entreeService.getEntreeById();
//        Optional<Entree> entree2 = entreeService.getEntreeById();

//        if (entree.isPresent() && appetizer.isPresent()) {
//            Appetizer foundAppByRequestBodyId = appetizer.get();
//            Entree foundEntreeByRequestBodyId = entree.get();
//            Entree foundEntreeByRequestBodyId2 = entree2.get();
//            ArrayList<Appetizer> foundAppById = new ArrayList<>(Arrays.asList(foundAppByRequestBodyId));
//            ArrayList<Entree> foundEntreeById = new ArrayList<>(Arrays.asList(foundEntreeByRequestBodyId, foundEntreeByRequestBodyId2));
//
//            Order order = new Order(
//                orderId,
//                foundAppById,
//                foundEntreeById
//            );
//            orders.add(order);
//            return order;
        return null;
        }
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

//creating an order; need id, app, and entree


