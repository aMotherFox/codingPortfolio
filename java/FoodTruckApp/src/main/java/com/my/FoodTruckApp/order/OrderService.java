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
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;
    private final OrderRepository orderRepository;

    public ArrayList<Order> getListOfOrders() {
        ArrayList<Order> orders = orderRepository.getListOfOrders();
        return orders;
    }

    public OrderDTO createOrder(NewOrderRequestBody newOrderRequestBody) {
        Order newOrder = orderRepository.createOrder(newOrderRequestBody);

        List<Entree> entrees = newOrderRequestBody.getEntreeIds().stream().map(entreeID -> {
            entreeRepository.createEntreeOrdered(newOrder.getId(), entreeID);
            return entreeRepository.getEntreeById(entreeID);
        }).collect(Collectors.toList());

        List<Appetizer> appetizers = newOrderRequestBody.getAppetizerIds().stream().map(appetizerID -> {
            appetizerRepository.createAppetizerOrdered(newOrder.getId(), appetizerID);
            return appetizerRepository.getAppById(appetizerID);
        }).collect(Collectors.toList());

        return new OrderDTO(
                newOrder.getId(),
                newOrderRequestBody.getCustomerId(),
                entrees,
                appetizers
        );
    }
}



