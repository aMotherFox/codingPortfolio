package com.my.FoodTruckApp.order;

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
        log.info("Successfully created order: " + newOrder);
        return newOrder;
    }
}



