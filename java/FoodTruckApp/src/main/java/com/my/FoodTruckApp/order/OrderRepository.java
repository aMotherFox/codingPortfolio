package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.entree.EntreeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    public OrderDTO createOrder(NewOrderRequestBody newOrderRequestBody) {

        String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
        Order newOrder = jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Order.class),
                newOrderRequestBody.getCustomerId()
        );

        List<Integer> entreeIdList = newOrderRequestBody.getEntreeIds();
        List<Entree> listOfOrderedEntrees = new ArrayList<>();
        entreeIdList.forEach(entreeId -> {
            Entree newEntree = entreeRepository.getEntreeById(entreeId);
            listOfOrderedEntrees.add(newEntree);
            String entreeSql = "INSERT INTO entree_ordered (order_id, entree_id) VALUES (?, ?) RETURNING *";
            jdbcTemplate.queryForObject(
                    entreeSql,
                    new BeanPropertyRowMapper<>(EntreeOrdered.class),
                    newOrder.getId(),
                    newEntree.getId()
            );
        });

        List<Integer> appetizerIdList = newOrderRequestBody.getAppetizerIds();
        List<Appetizer> listOfOrderedAppetizers = new ArrayList<>();
        appetizerIdList.forEach(appetizer -> {
            Appetizer newAppetizer = appetizerRepository.getAppById(appetizer);
            listOfOrderedAppetizers.add(newAppetizer);
            String appSql = "INSERT INTO appetizer_ordered (order_id, appetizer_id) VALUES (?, ?) RETURNING *";
            jdbcTemplate.queryForObject(
                    appSql,
                    new BeanPropertyRowMapper<>(AppetizerOrdered.class),
                    newOrder.getId(),
                    newAppetizer.getId()
            );
        });
        return new OrderDTO(
                newOrder.getId(),
                newOrderRequestBody.getCustomerId(),
                listOfOrderedEntrees,
                listOfOrderedAppetizers
        );
    }


}
