package com.my.FoodTruckApp.entree;

import com.my.FoodTruckApp.order.EntreeOrdered;
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
public class EntreeRepository {

    private final JdbcTemplate jdbcTemplate;

    public ArrayList<Entree> getListOfEntrees() {
        String sql = "SELECT * FROM entree";
        ArrayList<Entree> entrees = (ArrayList<Entree>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Entree.class));
        return entrees;
    }

    public Entree createEntree(EntreeRequestBody entreeRequestBody) {
        String sql = "INSERT INTO entree(name, price) VALUES(?, ?) RETURNING *";
        Entree newEntree = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Entree.class),
                entreeRequestBody.getName(), entreeRequestBody.getPrice());
        return newEntree;
    }

    public Entree getEntreeById(Integer id) {
        String sql = "SELECT * FROM entree WHERE id = ?";
        try {
            Entree entreeById = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Entree.class), id);
            return entreeById;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("No entree with an id of: " + id);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No entree with id of: " + id);
        }
    }

    public void deleteEntreeById(Integer id) {
        String sqlFind = "SELECT * FROM entree WHERE id = ?";
        String sqlDelete = "DELETE FROM entree WHERE id = ?";
        try {
            jdbcTemplate.queryForObject(sqlFind, new BeanPropertyRowMapper<>(Entree.class), id);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("No entree with id: " + id + " was found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No entree with id: " + id + " was found");
        }
        jdbcTemplate.update(sqlDelete, id);
    }

    public EntreeOrdered createEntreeOrdered(Integer orderId, Integer entreeId) {
        log.info("Created a entree_ordered row with entreeId: " + entreeId + ", and orderId: " + orderId);
        String entreeSql = "INSERT INTO entree_ordered (order_id, entree_id) VALUES (?, ?) RETURNING *";
        return jdbcTemplate.queryForObject(entreeSql, new BeanPropertyRowMapper<>(EntreeOrdered.class), orderId, entreeId);
    }
}
