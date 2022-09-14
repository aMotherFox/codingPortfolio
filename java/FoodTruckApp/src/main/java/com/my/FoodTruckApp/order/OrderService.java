package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.EntreeRepository;
import com.my.FoodTruckApp.entree.EntreeService;
import com.my.FoodTruckApp.order.NewOrderRequestBody;
import com.my.FoodTruckApp.order.Order;
import com.my.FoodTruckApp.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final EntreeService entreeService;
    private final AppetizerService appetizerService;
    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;
    private final OrderRepository orderRepository;

    public ArrayList<Order> getListOfOrders() {
        ArrayList<Order> orders = orderRepository.getListOfOrders();
        System.out.println("There are the orders: " + orders);
        return orders;
    }

    public String createOrder(NewOrderRequestBody newOrderRequestBody) {
        System.out.println("inside create new order SERVICE");
        orderRepository.createOrder(newOrderRequestBody);
        return "service";
    }
    //--------------------------------------------get order by ID------------------------------------------------------------------------------------
//    public Optional<Order>  getOrderById(@PathVariable Integer id) {
//        ArrayList<Order> orders = orderRepository.getAllOrders(); //should have created an order repository method so you can call it instead of re-iterating it
//        System.out.println("order by id: " + id);
//        Optional<Order> orderById = orders.stream().filter(order -> order.getId() == id).findFirst();
//        return  orderById;
//    }
//    //--------------------------------------------create new order and add to list------------------------------------------------------------------------------------
//    public Order createOrder(NewOrderRequestBody newOrderRequestBody) {
//        ArrayList<Order> orders = orderRepository.getAllOrders();
//        System.out.println("Creating a new order using the request body: " + newOrderRequestBody);
//        Integer orderId = orders.get(orders.size() - 1).getId() + 1;
//
//        newOrderRequestBody.getAppetizerIds();
//        newOrderRequestBody.getEntreeIds();
//
//
//
////        Optional<Appetizer> appetizer = appetizerService.getAppById();
////        Optional<Entree> entree = entreeService.getEntreeById();
////        Optional<Entree> entree2 = entreeService.getEntreeById();
//
////        if (entree.isPresent() && appetizer.isPresent()) {
////            Appetizer foundAppByRequestBodyId = appetizer.get();
////            Entree foundEntreeByRequestBodyId = entree.get();
////            Entree foundEntreeByRequestBodyId2 = entree2.get();
////            ArrayList<Appetizer> foundAppById = new ArrayList<>(Arrays.asList(foundAppByRequestBodyId));
////            ArrayList<Entree> foundEntreeById = new ArrayList<>(Arrays.asList(foundEntreeByRequestBodyId, foundEntreeByRequestBodyId2));
////
////            Order order = new Order(
////                orderId,
////                foundAppById,
////                foundEntreeById
////            );
////            orders.add(order);
////            return order;
//        return null;
//        }
////        throw new ResponseStatusException(HttpStatus.NOT_FOUND);


    //--------------------------------------------call JDBC repository------------------------------------------------------------------------------------
//    public Order callingJdbc() {
//        String jdbcFile = JdbcRepository;
//        return
//    }
//    public String returningJdbc() {
//        String jdbcText = JdbcRepository.returningJdbc();
//        System.out.println("JDBC repo + Order Service: " + jdbcText);
//        return jdbcText;
//    }
}

//creating an order; need id, app, and entree


