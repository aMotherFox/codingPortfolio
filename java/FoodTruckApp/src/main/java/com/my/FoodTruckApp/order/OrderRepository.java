package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.entree.EntreeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OrderRepository {

    private final JdbcTemplate jdbcTemplate;
    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;

    public ArrayList<Order> getListOfOrders() {
        String sql = "SELECT * FROM \"order\" ";
        ArrayList<Order> orders = (ArrayList<Order>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
        return orders;
    }

    public Order createOrder(NewOrderRequestBody newOrderRequestBody) {

        String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
        Order newOrder = jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Order.class),
                newOrderRequestBody.getCustomerId()
        );
        return newOrder;
    }

    public EntreeOrdered createEntreeReciept(NewOrderRequestBody newOrderRequestBody) {

        String entreeSql = "INSERT INTO entree_ordered (order_id, entree_id) VALUES (?, ?) RETURNING *";
        EntreeOrdered newEntree = jdbcTemplate.queryForObject(
                entreeSql,
                new BeanPropertyRowMapper<>(EntreeOrdered.class),
                createOrder(newOrderRequestBody).getId(),
                newOrderRequestBody.getEntreeIds()
        );
        return newEntree;
    }

    //TODO: make method for each function being accomplished aka method for creating order, method for creating row in
    // entree_ordered, method for creating row in appetizer_ordered, etc
    // logic to be split up between here and service


}
