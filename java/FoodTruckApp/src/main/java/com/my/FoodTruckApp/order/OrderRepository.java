package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.order.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.EntreeRepository;
import com.my.FoodTruckApp.entree.EntreeService;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OrderRepository {

    private final JdbcTemplate jdbcTemplate;
    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;

    public ArrayList<Order> getListOfOrders() {
        String sql = "SELECT * FROM new_order ";
        ArrayList<Order> orders = (ArrayList<Order>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
        return orders;
    }

    public Order createOrder(NewOrderRequestBody newOrderRequestBody) {
        String sql = "INSERT INTO new_order (customer_id) VALUES (?, ?, ?) RETURNING *";
//        String orderedAppsSql = "SELECT appetizer.name, new_order.id FROM appetizer" +
//                "JOIN appetizer_ordered ON appetizer.id = appetizer_ordered.appetizer_id" +
//                "JOIN new_order ON new_order.id = appetizer_ordered.order_id" +
//                "WHERE new_order.id = 1";
//        String orderedEntreeSql = "SELECT entree.name, new_order.id FROM entree" +
//                "JOIN entree_ordered ON entree.id = entree_ordered.entree_id" +
//                "JOIN new_order ON new_order.id = entree.order_id" +
//                "WHERE new_order.id = 1";
        Order newOrder = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Order.class),
        newOrderRequestBody.getCustomerId(), newOrderRequestBody.getEntreeIds(),
                newOrderRequestBody.getAppetizerIds());
        return newOrder;
    }

//    Order newOrder = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Order.class),
//            newOrderRequestBody.getCustomerId(), newOrderRequestBody.getEntreeIds(entreeRepository.getEntreeById()),
//            newOrderRequestBody.getAppetizerIds(appetizerRepository.getAppById());
//        return newOrder;


//    Appetizer appetizer1 = new Appetizer(1, "hardcoded fries", 4);
//    Appetizer appetizer2 = new Appetizer(2, "hardcoded onion rings", 6);
//    ArrayList<Appetizer> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));
//    //----------------------------------------------------------------------------------------------------------------------------------------
//    Entree entree1 = new Entree(1, "hardcoded burger", 14);
//    Entree entree2 = new Entree(2, "hardcoded spaghetti", 16);
//    ArrayList<Entree> entrees = new ArrayList<>(Arrays.asList(entree1, entree2));
//    //----------------------------------------------------------------------------------------------------------------------------------------
//    Order order1 = new Order(1, appetizers, entrees);
//    Order order2 = new Order(2, appetizers, entrees);
//    ArrayList<Order> orders = new ArrayList<>(Arrays.asList(order1, order2));
//
////    public ArrayList<Appetizer> getAllAppetizers() { return appetizers;}
////    public ArrayList<Entree> getAllEntrees() { return entrees;}
//    public ArrayList<Order> getAllOrders() {
//        return orders;
//    }
}

//we are getting an object THROUGH the ID{id} of the appetizer and entree
//return ust be object, input must be integer