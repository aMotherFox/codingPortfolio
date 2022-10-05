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

//        List<Entree> entrees = entreeRepository.findAllEntreesByOrderId(order.getId());
//        List<Appetizer> appetizers = appetizerRepository.findAllAppetizersByOrderId(order.getId());
        //find all entrees
        //put into list

        List<Entree> entrees = entreeRepository.getListOfEntrees();
        System.out.println("entrees: " + entrees);
        //must check each entree
        //find on entree_ordered table
        //entree's id = entree_id
        //find coressponding order_id
        //separate by order_id
        //return these orders
        //put into new lists by order_id
        entrees.stream().map(entree -> {
            entreeRepository.findEntreesThroughEntreeOrderedTable(entree.getId());
        });

//        List<Appetizer> appetizers = appetizerRepository.getListOfAppetizers();
//        System.out.println("appetizers: " + appetizers);

        return orders.stream().map(order -> { // N + 1 issue, could be ANY number of orders
//            List<Entree> entrees = entreeRepository.findAllEntreesByOrderId(order.getId());
//            List<Appetizer> appetizers = appetizerRepository.findAllAppetizersByOrderId(order.getId());
            //BATCH queries - set parameters that could easily be swapped
            //finding all entrees/apps by orderId should be BATCH
            //WATCH OUT FOR SQL STATMENTS IN OPEN ENDED LOOPS!! N + 1 ISSUE
            //list of all entrees; map from entree_ordered table to find the id of the order it belongs to
            //insert into order that way
            //get lists first and then map through list and assign to correct order

            return new OrderDTO(
                    order.getId(),
                    order.getCustomerId(),
                    entrees,
                    null
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



