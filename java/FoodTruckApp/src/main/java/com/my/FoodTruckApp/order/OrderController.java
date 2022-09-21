package com.my.FoodTruckApp.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {

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
    public OrderDTO createOrder(@RequestBody NewOrderRequestBody newOrderRequestBody) {
        log.info("Creating an order with newOrderRequestBody: " + newOrderRequestBody);
        return orderService.createOrder(newOrderRequestBody);
    }

    //DTO makes it so only certain columns from database are returned
    //i.e. database as name, username, email, phone number columns, you want to only return name & username for security reasons
    //DTO connects with the network layer, not the database layer
    //DTO to entity converter is in CONTROLLER level

    //DTO = data transfer object
    //order is a class (PROPER DEFINITION)
    //class is the empty template for an object
    //object is an instance of a class
    //model another word for class, models have FIELDS
    //every class that you want to instanciate should be a model
    //entity is a model, specifically usually a model that is representation of a table
    //will not always be completely identical to the table (i.e firstName in java vs first_name in database)
    //pojo = Plain Old Java Object
    //pojo is a model
    //used to have to do mapping yourself
    //pojo was a step to instanciate objects you had to map yourself
    //pojo isn't used very much, now we use DTO
    //DTOs used mostly for creating a model that is not an entity;
    //when you have an entity tht doesn't have all the fields you want,

}
