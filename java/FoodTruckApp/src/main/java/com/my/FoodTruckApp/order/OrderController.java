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

    @GetMapping("/orders")
    public ArrayList<Order> getListOfOrders() {
        return orderService.getListOfOrders();
    }

    //------------------------get order by ID-----------------------------------------------------------------------------------------------------------
//    @GetMapping("/orders/{id}")
//    public Order getOrderById(@PathVariable Integer id) {
//        return orderService.getOrderById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//    }
    @PostMapping("/orders")
    public OrderDTO createOrder(@RequestBody NewOrderRequestBody newOrderRequestBody) {
        log.info("Creating an order with newOrderRequestBody: " + newOrderRequestBody);
        return orderService.createOrder(newOrderRequestBody);
    }


}
