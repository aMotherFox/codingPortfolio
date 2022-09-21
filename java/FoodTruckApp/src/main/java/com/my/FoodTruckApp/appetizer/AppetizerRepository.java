package com.my.FoodTruckApp.appetizer;

import com.my.FoodTruckApp.order.AppetizerOrdered;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AppetizerRepository {

    private final JdbcTemplate jdbcTemplate;

    public ArrayList<Appetizer> getListOfAppetizers() {
        String sql = "SELECT * FROM appetizer";
        ArrayList<Appetizer> appetizers = (ArrayList<Appetizer>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Appetizer.class));
        return appetizers;
    }

    public Appetizer createAppetizer(AppetizerRequestBody appRequestBody) {
        String sql = "INSERT INTO appetizer(name, price) VALUES(?, ?) RETURNING *";
        Appetizer newAppetizer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Appetizer.class),
                appRequestBody.getName(), appRequestBody.getPrice());
        return newAppetizer;
    }

    public Appetizer getAppById(Integer id) {
        String sql = "SELECT * FROM appetizer WHERE id = ?";
        try {
            Appetizer appById = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Appetizer.class), id);
            return appById;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("No appetizer with id of: " + id);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No appetizer with id of: " + id);
        }
    }

    public void deleteAppetizerById(Integer id) {
        String sqlFind = "SELECT * FROM appetizer WHERE id = ?";
        String sqlDelete = "DELETE FROM appetizer WHERE id = ?";
        try {
            jdbcTemplate.queryForObject(sqlFind, new BeanPropertyRowMapper<>(Appetizer.class), id);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("No appetizer with id: " + id + " was found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No appetizer with id: " + id + " was found");
        }
        jdbcTemplate.update(sqlDelete, id);
    }

    public AppetizerOrdered createAppetizerOrdered(Integer orderId, Integer appetizerId) {
        log.info("Created a appetizer_ordered row with appetizerId: " + appetizerId + ", and orderId: " + orderId);
        String appSql = "INSERT INTO appetizer_ordered (order_id, appetizer_id) VALUES (?, ?) RETURNING *";
        return jdbcTemplate.queryForObject(appSql, new BeanPropertyRowMapper<>(AppetizerOrdered.class), orderId, appetizerId);
    }

}
