package com.my.FoodTruckApp;

import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController //this is our API call; recieving the API call is the main job of the controller; it creates endpoints with URLs
@RequiredArgsConstructor //looks for all fields but only uses FINAL fields; this is for the dependency injection
public class OrderController {

    private final EntreeService entreeService; //getting an instance of the service, THIS IS THE DEPENDENCY INJECTION
    private final AppetizerService appetizerService; //spring will look through the variables and see if they have a DEPENDENCY on this service
    private final OrderService orderService;

    @GetMapping("/order")
    public String gettingOrder() {
        return "Hello from order controller";
        //must make appetizer and entrees viewable and usable by this file
    }
    //------------------------get list of orders-----------------------------------------------------------------------------------------------------------
    @GetMapping("/orders")
    public ResponseEntity<ArrayList<Order>> getListOfOrders() {
        ArrayList<Order> orders = orderService.getListOfOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
    //------------------------get order by ID-----------------------------------------------------------------------------------------------------------
    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    //------------------------create order-----------------------------------------------------------------------------------------------------------
    @PostMapping("/orders")
    public Order createOrder(@RequestBody NewOrderRequestBody newOrderRequestBody) {
        //you can only recieved one thing from the request body which is why all the ids cannot go in it
        return orderService.createOrder(newOrderRequestBody);
    }
    // create 2 different APIs and methods; one for just ordering the apps, one for just order entrees, and one for final order aka receipt
    //create BLANK order and use put and patch to insert apps and entrees into the order
    //create LISTS in app & entree that you call



}
/*
create a order controller using CRUD (get all the orders, get order by id, and create an order)
make it so you can call post order API and will be able to order ANY entrees or appetizers by their IDs
-call post order API
-input appetizer and entree IDs
-creates order of all appetizers and entrees entered
-on this controller you can see the order, you can get order by ID, change order, and delete order by ID

**HINT; how are things related to eachother by ID
 */