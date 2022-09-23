package com.my.FoodTruckApp.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/orders")
    public OrderDTO createOrder(@RequestBody NewOrderRequestBody newOrderRequestBody) {
        log.info("Creating an order with newOrderRequestBody: " + newOrderRequestBody);
        return orderService.createOrder(newOrderRequestBody);
    }

    @GetMapping("/orders/{id}")
    public String getOrderById(@PathVariable Integer id) {
        log.info("Finding an order with PathVariable Integer id: " + id);
        return orderService.getOrderById(id);
    }

}
