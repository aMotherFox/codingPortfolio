package com.my.FoodTruckApp.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OrderRepository {

    private final JdbcTemplate jdbcTemplate;

//    public List<Order> getAllOrders() {
//        String sql = "SELECT * FROM \"order\" ";
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
//    }

    public List<Order> findAllOrders() {
        String sql = "SELECT * FROM \"order\"";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
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

    public Order getOrderById(Integer id) {
        String sql = "SELECT * FROM \"order\" WHERE id = ?";

        try {
            Order orderById = jdbcTemplate.queryForObject(
                    sql,
                    new BeanPropertyRowMapper<>(Order.class),
                    id
            );
            log.info("selecting order by id: " + id + "order: " + orderById);
            return orderById;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("No order with an id of: " + id);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No order with id of: " + id);
        }
    }


}



