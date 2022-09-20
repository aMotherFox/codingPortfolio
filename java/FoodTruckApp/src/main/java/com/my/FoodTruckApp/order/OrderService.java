package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeRepository;
import com.my.FoodTruckApp.entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        return orders;
    }

    public OrderDTO createOrder(NewOrderRequestBody newOrderRequestBody) {
        return createOrderDTO(newOrderRequestBody);
    }

    public List<Entree> createEntreeReciept(NewOrderRequestBody newOrderRequestBody) {

        List<Integer> entreeIdList = newOrderRequestBody.getEntreeIds();
        List<Entree> listOfOrderedEntrees = new ArrayList<>();
        entreeIdList.forEach(entreeId -> {
            Entree newEntree = entreeRepository.getEntreeById(entreeId);
            listOfOrderedEntrees.add(newEntree);
//            orderRepository.createEntreeReciept(newOrderRequestBody);
        });
        return listOfOrderedEntrees;
    }

    public List<Appetizer> createAppReciept(NewOrderRequestBody newOrderRequestBody) {

        List<Integer> appetizerIdList = newOrderRequestBody.getAppetizerIds();
        List<Appetizer> listOfOrderedAppetizers = new ArrayList<>();
        appetizerIdList.forEach(appetizer -> {
            Appetizer newAppetizer = appetizerRepository.getAppById(appetizer);
            listOfOrderedAppetizers.add(newAppetizer);
//            String appSql = "INSERT INTO appetizer_ordered (order_id, appetizer_id) VALUES (?, ?) RETURNING *";
//            jdbcTemplate.queryForObject(
//                    appSql,
//                    new BeanPropertyRowMapper<>(AppetizerOrdered.class),
//                    newOrder.getId(),
//                    newAppetizer.getId()
//            );
        });
        return listOfOrderedAppetizers;
    }

    public OrderDTO createOrderDTO(NewOrderRequestBody newOrderRequestBody) {
        return new OrderDTO(
                newOrderRequestBody.getOrderId(),
                newOrderRequestBody.getCustomerId(),
                createEntreeReciept(newOrderRequestBody),
                createAppReciept(newOrderRequestBody)
        );
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


