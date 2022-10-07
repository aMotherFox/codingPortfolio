package com.my.FoodTruckApp.appetizer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AppetizerRepository {

    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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

    public void createAppetizersOrder(Integer orderId, List<Integer> appetizerIds) {

        String appSql = "INSERT INTO appetizer_ordered (order_id, appetizer_id) VALUES (?, ?)";
        jdbcTemplate.batchUpdate(
                appSql,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, orderId);
                        ps.setInt(2, appetizerIds.get(i));
                    }

                    @Override
                    public int getBatchSize() {
                        return appetizerIds.size();
                    }
                }
        );
    }

    public List<Appetizer> findAllByIds(List<Integer> appetizerIds) {
        String sql = "SELECT * FROM appetizer WHERE id IN (:ids)";

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("ids", appetizerIds);

        return namedParameterJdbcTemplate.query(sql, parameters, new BeanPropertyRowMapper<>(Appetizer.class));
    }

    public List<Appetizer> findAllAppetizersByOrderId(Integer orderId) {

        String sql = "SELECT appetizer.* " +
                " FROM appetizer" +
                " JOIN appetizer_ordered ON appetizer.id = appetizer_ordered.appetizer_id" +
                " WHERE appetizer_ordered.order_id = ?";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Appetizer.class), orderId);
    }

    public List<Appetizer> findAll() {
        String sql = "SELECT * FROM appetizer";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Appetizer.class));
    }

    public List<AppetizerOrdered> findAllAppetizerOrders() {
        String sql = "SELECT * FROM appetizer_ordered";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AppetizerOrdered.class));
    }

    public void deleteAllByOrderId(Integer orderId) {
        String sql = "DELETE FROM appetizer_ordered WHERE order_id = ?";

        jdbcTemplate.update(sql, orderId);
    }

}
