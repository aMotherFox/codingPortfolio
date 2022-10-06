package com.my.FoodTruckApp.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orders")
    public List<OrderDTO> findAllOrders() {
        log.info("Finding all orders");
        return orderService.findAllOrder();
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
