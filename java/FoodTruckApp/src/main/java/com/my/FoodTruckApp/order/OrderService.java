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

    public String getOrderById(Integer id) {
        Order orderByid = orderRepository.getOrderById(id);
        System.out.println("orderByid" + orderByid);

//        entreeRepository.getEntreeById(id); DOES NOT WORK BC IT IS ORDER ID, NOT ENTREE ID
        //find out what order we have
        //the id of the order is = to the order_id on entree_ordered and appetizer_ordered
        //find entree
        
        //if id = order_id, return entree_id
        //find entree by id (which is the entree_id)
        //return that entree
        //do it in a list

        entreeRepository.findEntreeThroughEntreeOrdered(id);

        return "Getting order by id IN SERVICE";
    }
}



