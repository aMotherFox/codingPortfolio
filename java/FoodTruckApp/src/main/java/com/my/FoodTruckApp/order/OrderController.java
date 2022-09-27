package com.my.FoodTruckApp.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orders")
    public String getAllOrders() {
        orderService.getAllOrders();
        return "get all orders CONTROLLER";
    }

    @PostMapping("/orders")
    public OrderDTO createOrder(@RequestBody NewOrderRequestBody newOrderRequestBody) {
        log.info("Creating an order with newOrderRequestBody: " + newOrderRequestBody);
        return orderService.createOrder(newOrderRequestBody);
    }

    @GetMapping("/orders/{orderId}")
    public OrderDTO getOrderById(@PathVariable Integer orderId) {
        log.info("Finding an order with PathVariable Integer id: " + orderId);
        return orderService.getOrderById(orderId);
    }

}
