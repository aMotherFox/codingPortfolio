package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;
    private final OrderRepository orderRepository;

    public String getAllOrders() {
        List<Order> orders = orderRepository.getAllOrders();
        System.out.println("Orders LIST in service: " + orders);
        //we want to return a list of ALL the orders
        //must return as list of OrderDTO
        //CANNOT just get a list of every entree and every appetizer
        //find all orders
        //ITERATE through list of orders
        //for each iteration:
        //find order ID
        //find customer ID
        //find all entrees
        //find all appetizer
        //return OrderDTO
        //next iteration

        entreeRepository.getEntreesFromAllOrders();

        return "get all orders SERVICE";
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

    public OrderDTO getOrderById(Integer orderId) {
        Order orderById = orderRepository.getOrderById(orderId);

        List<Entree> entrees = entreeRepository.findAllEntreesByOrderId(orderId);
        log.info("Our entrees from the order by id: " + orderId + " entrees: " + entrees);
        List<Appetizer> appetizers = appetizerRepository.findAllAppetizersByOrderId(orderId);
        log.info("Our appetizers from the order by id: " + orderId + " appetizers: " + appetizers);

        return new OrderDTO(
                orderById.getId(),
                orderById.getCustomerId(),
                entrees,
                appetizers
        );
    }

}



