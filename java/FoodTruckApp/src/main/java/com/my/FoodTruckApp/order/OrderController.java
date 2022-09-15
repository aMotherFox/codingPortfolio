package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final EntreeService entreeService;
    private final AppetizerService appetizerService;
    private final OrderService orderService;

    //------------------------get list of orders-----------------------------------------------------------------------------------------------------------
    @GetMapping("/orders")
    public ArrayList<Order> getListOfOrders() {
        return orderService.getListOfOrders();
    }
    //------------------------get order by ID-----------------------------------------------------------------------------------------------------------
//    @GetMapping("/orders/{id}")
//    public Order getOrderById(@PathVariable Integer id) {
//        return orderService.getOrderById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//    }
//    //------------------------create order-----------------------------------------------------------------------------------------------------------
    @PostMapping("/orders")
    public Order createOrder(@RequestBody NewOrderRequestBody newOrderRequestBody) {
        return orderService.createOrder(newOrderRequestBody);
    }

    //DTO makes it so only certain columns from database are returned
    //i.e. database as name, username, email, phone number columns, you want to only return name & username for security reasons
    //DTO connects with the network layer, not the database layer
    //DTO to entity converter is in CONTROLLER level

}
