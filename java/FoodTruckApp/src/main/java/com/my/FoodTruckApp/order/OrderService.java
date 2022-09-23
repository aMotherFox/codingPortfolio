package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;
    private final OrderRepository orderRepository;

    public ArrayList<Order> getListOfOrders() {
        return orderRepository.getListOfOrders();
    }

    public OrderDTO createOrder(NewOrderRequestBody newOrderRequestBody) {
        Order newOrder = orderRepository.createOrder(newOrderRequestBody);

        entreeRepository.createEntreesOrder(newOrder.getId(), newOrderRequestBody.getEntreeIds());
        List<Entree> entrees = entreeRepository.findAllByIds(newOrderRequestBody.getEntreeIds());

        appetizerRepository.createAppetizersOrder(newOrder.getId(), newOrderRequestBody.getAppetizerIds());
        List<Appetizer> appetizers = appetizerRepository.findAllByIds(newOrderRequestBody.getAppetizerIds());

        return new OrderDTO(
                newOrder.getId(),
                newOrderRequestBody.getCustomerId(),
                entrees,
                appetizers
        );
    }
}



