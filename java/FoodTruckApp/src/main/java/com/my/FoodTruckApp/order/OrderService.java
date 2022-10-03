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

    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderRepository.getAllOrders();

        List<Entree> entrees = entreeRepository.findAllEntreesByOrderId(order.getId());
        List<Appetizer> appetizers = appetizerRepository.findAllAppetizersByOrderId(order.getId());

        return orders.stream().map(order -> { // N + 1 issue, could be ANY number of orders
//            List<Entree> entrees = entreeRepository.findAllEntreesByOrderId(order.getId());
//            List<Appetizer> appetizers = appetizerRepository.findAllAppetizersByOrderId(order.getId());
            //WE DO NOT WANT THE ENTREES AND APPS IN THE ITERATION
            //get ALL entrees and apps
            //we can find the entrees by entree_ordered table
            //order_id in entree_ordered table = order's id
            //once we find the entrees, THEN we assign it to THAT order

            return new OrderDTO(
                    order.getId(),
                    order.getCustomerId(),
                    entrees,
                    appetizers
            );
        }).toList(); //on the return of the map, not the return of the DTO
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



