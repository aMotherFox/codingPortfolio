package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerOrdered;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeAndOrderId;
import com.my.FoodTruckApp.entree.EntreeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;
    private final OrderRepository orderRepository;

    public List<OrderDTO> findAllOrder() {
        List<Order> orders = orderRepository.findAllOrders();

        List<AppetizerOrdered> appetizerOrders = appetizerRepository.findAllAppetizerOrders();
        List<Appetizer> allAppetizers = appetizerRepository.findAll();

        List<Integer> orderIds = orders.stream().map(order -> order.getId()).toList();
        List<EntreeAndOrderId> entreeAndOrderIds = entreeRepository.findAllByOrderIds(orderIds);

        List<OrderDTO> orderDtos = orders.stream().map(order -> {

            List<AppetizerOrdered> appetizerOrdersForThisOrder = appetizerOrders.stream()
                    .filter(appetizerOrdered -> appetizerOrdered.getOrderId() == order.getId())
                    .toList();

            List<Appetizer> appetizers = appetizerOrdersForThisOrder.stream().map(appetizerOrder -> {
                Optional<Appetizer> appetizerForThisOrder = allAppetizers.stream()
                        .filter(appetizer -> appetizer.getId() == appetizerOrder.getAppetizerId())
                        .findFirst();
                return appetizerForThisOrder.get();
            }).toList();

            List<EntreeAndOrderId> entreeAndOrderIdsForTHISOrder = entreeAndOrderIds.stream()
                    .filter(entreeAndOrderId -> entreeAndOrderId.getOrderId() == order.getId())
                    .toList();

            List<Entree> entrees = entreeAndOrderIdsForTHISOrder.stream().map(entreeAndOrderId -> new Entree(
                    entreeAndOrderId.getId(),
                    entreeAndOrderId.getName(),
                    entreeAndOrderId.getPrice()
            )).toList();

            return new OrderDTO(
                    order.getId(),
                    order.getCustomerId(),
                    entrees,
                    appetizers
            );
        }).toList();

        return orderDtos;
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


    public void deleteOrderById(Integer orderId) {
        orderRepository.deleteOrderById(orderId);
    }
}



