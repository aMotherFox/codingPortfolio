package com.my.FoodTruckApp;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.Entree;
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
    //--------------------------------------------get list of entrees------------------------------------------------------------------------------------
//    @GetMapping("/orders/{id}/entrees") //should be /entrees because we are returning entrees and should be in entree controller, new API URL is asking specifically for all entrees in THAT order by id
//    public ResponseEntity<ArrayList<Entree>> getListOfEntrees() {
//        ArrayList<Entree> entrees = orderService.getListOfEntrees();
//        return new ResponseEntity<>(entrees, HttpStatus.OK);
//    } //TODO: change code to get entrees by order ID ^
//    //--------------------------------------------get list of appetizers------------------------------------------------------------------------------------
//    @GetMapping("/orders/{id}/appetizers") //convention of RESTFUL API you name them /MODELTYPE and you go from biggest to smallest; getting list of entrees vs !!getting all the entrees IN THE ORDER!!
//    public ResponseEntity<ArrayList<Appetizer>> getListOfAppetizers() {
//        ArrayList<Appetizer> appetizers = orderService.getListOfAppetizers();
//        return new ResponseEntity<>(appetizers, HttpStatus.OK);
//    } //TODO: change code to get appetizers by order ID ^
    //------------------------create order-----------------------------------------------------------------------------------------------------------
    @PostMapping("/orders/{id}/{id2}/{id3}")
    public Order createOrder(@RequestBody OrderRequestBody orderRequestBody, @PathVariable Integer id, @PathVariable Integer id2, @PathVariable Integer id3) {
        //you can only recieved one thing from the request body which is why all the ids cannot go in it
        return orderService.createOrder(orderRequestBody, id, id2, id3);
    }
    //------------------------update order(put)-----------------------------------------------------------------------------------------------------------
//    @PutMapping("/orders/{id}")
//    public Order changeObject(@RequestBody Order orderRequestBody, @PathVariable Integer id) {
//        return orderService.changeObject(orderRequestBody, id);
//    }
    //------------------------update field(patch)-----------------------------------------------------------------------------------------------------------
//    @PatchMapping("/orders/{id}")
//    public Order changeField(@RequestBody Order orderRequestBody, @PathVariable Integer id) {
//        return orderService.changeField(orderRequestBody, id);
//    }

    //if you are getting something by ID, it should be a PATH VARIABLE
//    @GetMapping("/orders")
//    public String getListOfAppsAndEntrees() {
//        return "getting apps and entrees";
//    }

//    @GetMapping("/orders")
//    public ArrayList<Entree> gettingEntrees(){
//        ArrayList<Entree> entrees = entreeService.getListOfEntrees();
//        return entrees;
//    }

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