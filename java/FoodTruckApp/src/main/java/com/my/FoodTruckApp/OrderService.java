package com.my.FoodTruckApp;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeRepository;
import com.my.FoodTruckApp.entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Service //annotation that tells spring THIS IS OUR SERVICE
@RequiredArgsConstructor //necessary for the dependency injection to the repository
public class OrderService {

    private final EntreeService entreeService; //getting an instance of the service, THIS IS THE DEPENDENCY INJECTION
    private final AppetizerService appetizerService; //spring will look through the variables and see if they have a DEPENDENCY on this service
    private final EntreeRepository entreeRepository; //we only have to instantiate this once
    private final AppetizerRepository appetizerRepository; //these are picked up by the @RequiredArgsConstructor
    private final OrderRepository orderRepository;
    // -----------------------------------------------------------------------------------------------------------------------------

//    public String getListOfAppsAndEntrees() {
//        ArrayList<Entree> entrees = entreeService.getListOfEntrees();
//        ArrayList<Appetizer> appetizers = appetizerService.getListOfAppetizers();
//        System.out.println("These are the entrees: " + entrees);
//        System.out.println("These are the appetizers: " + appetizers);
//        return "entrees + appetizers";
//    }
//    public ArrayList<Entree> gettingEntrees() {
//        ArrayList<Entree> entrees = entreeRepository.getAllEntrees();
//        System.out.println("These are the entrees: " + entrees);
//        return entrees;
//    }
    public ArrayList<Order> getListOfOrders() {
        ArrayList<Order> orders = orderRepository.getAllOrders();
        System.out.println("There are the orders: " + orders);
        return orders;
    }
    //--------------------------------------------get order by ID------------------------------------------------------------------------------------
    public Optional<Order>  getOrderById(@PathVariable Integer id) {
        ArrayList<Order> orders = orderRepository.getAllOrders();
        System.out.println("order by id: " + id);
        Optional<Order> orderById = orders.stream().filter(order -> order.getId() == id).findFirst();
        return  orderById;
    }
    //--------------------------------------------get list of appetizers------------------------------------------------------------------------------------
//    public ArrayList<Appetizer> getListOfAppetizers() {
//        ArrayList<Appetizer> appetizers = orderRepository.getAllAppetizers();
//        System.out.println("These are the entrees: " + appetizers);
//        return appetizers;
//    }//TODO: change code to get appetizers by order ID ^
//    //--------------------------------------------get list of entrees------------------------------------------------------------------------------------
//    public ArrayList<Entree> getListOfEntrees() {
//        ArrayList<Entree> entrees = orderRepository.getAllEntrees();
//        System.out.println("These are the entrees: " + entrees);
//        return entrees;
//    }//TODO: change code to get entrees by order ID ^
    //--------------------------------------------create new order and add to list------------------------------------------------------------------------------------
    public Order createOrder(@RequestBody OrderRequestBody orderRequestBody, @PathVariable Integer id, @PathVariable Integer id2, @PathVariable Integer id3) {
        ArrayList<Order> orders = orderRepository.getAllOrders();
        System.out.println("Creating a new order using the request body: " + orderRequestBody);
        Integer orderId = orders.get(orders.size() - 1).getId() + 1;

        Optional<Appetizer> appetizer = appetizerService.getAppById(id);
        Optional<Entree> entree = entreeService.getEntreeById(id2);
        Optional<Entree> entree2 = entreeService.getEntreeById(id3);

        if (entree.isPresent() && appetizer.isPresent()) {
            Appetizer foundAppByRequestBodyId = appetizer.get();
            Entree foundEntreeByRequestBodyId = entree.get();
            Entree foundEntreeByRequestBodyId2 = entree2.get();
            ArrayList<Appetizer> foundAppById = new ArrayList<>(Arrays.asList(foundAppByRequestBodyId));
            ArrayList<Entree> foundEntreeById = new ArrayList<>(Arrays.asList(foundEntreeByRequestBodyId, foundEntreeByRequestBodyId2));

            Order order = new Order(
                orderId,
                foundAppById,
                foundEntreeById
            );
            orders.add(order);
            return order;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

//    ------------------------update order(put)-----------------------------------------------------------------------------------------------------------
//    public Order changeObject(@RequestBody Order orderRequestBody, @PathVariable Integer id) {
//        ArrayList<Order> orders = orderRepository.getAllOrders();
//        Optional<Order> optionalOrderById = orders.stream().filter(order -> order.getId().equals(id)).findFirst();
//
//        if (optionalOrderById.isPresent()) {
//            Order foundOrder = optionalOrderById.get();
//            foundOrder.setOrderedAppetizer(orderRequestBody.getOrderedAppetizer());
//            foundOrder.setOrderedEntree(orderRequestBody.getOrderedEntree());
//
//            if (orderRequestBody.getOrderedAppetizer() == null) {
//                System.out.println("appetizer is null");
//                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//            } if (orderRequestBody.getOrderedEntree() == null) {
//                System.out.println("entree is null");
//                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//            }
//            return foundOrder;
//        }
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//    }//if app && order isPresent true
//    ------------------------update field(patch)-----------------------------------------------------------------------------------------------------------
//    public Order changeField(@RequestBody Order orderRequestBody, @PathVariable Integer id) {
//        ArrayList<Order> orders = orderRepository.getAllOrders();
//        Optional<Order> optionalOrderById = orders.stream().filter(order -> order.getId().equals(id)).findFirst();
//
//        if (optionalOrderById.isPresent()) {
//            Order foundOrder = optionalOrderById.get();
//            if (orderRequestBody.getOrderedAppetizer() == null) {
//                System.out.println("app not changed" + foundOrder);
//                return foundOrder;
//            }
//            foundOrder.setOrderedAppetizer(orderRequestBody.getOrderedAppetizer());
//            System.out.println("app was changed" + foundOrder);
//
//            if (orderRequestBody.getOrderedEntree() == null) {
//                System.out.println("entree not changed" + foundOrder);
//                return foundOrder;
//            }
//            foundOrder.setOrderedEntree(orderRequestBody.getOrderedEntree());
//            System.out.println("entree was changed" + foundOrder);
//        }
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//    }

//creating an order; need id, app, and entree

}
