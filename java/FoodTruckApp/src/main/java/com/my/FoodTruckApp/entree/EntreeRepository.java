package com.my.FoodTruckApp.entree;

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
public class EntreeRepository {

    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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

    public void createEntreesOrder(Integer orderId, List<Integer> entreeIds) {

        String entreeSql = "INSERT INTO entree_ordered (order_id, entree_id) VALUES (?, ?)";
        jdbcTemplate.batchUpdate(
                entreeSql,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, orderId);
                        ps.setInt(2, entreeIds.get(i));
                    }

                    @Override
                    public int getBatchSize() {
                        return entreeIds.size();
                    }
                }
        );
    }

    public List<Entree> findAllByIds(List<Integer> entreeIds) {
        if (entreeIds.isEmpty()) {
            return List.of();
        }

        String sql = "SELECT * FROM entree WHERE id IN (:ids)";

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("ids", entreeIds);

        return namedParameterJdbcTemplate.query(sql, parameters, new BeanPropertyRowMapper<>(Entree.class));
    }

    public List<Entree> findAllEntreesByOrderId(Integer orderId) {

        String sql = "SELECT entree.* " +
                " FROM entree" +
                " JOIN entree_ordered ON entree.id = entree_ordered.entree_id" +
                " WHERE entree_ordered.order_id = ?";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Entree.class), orderId);

    }

    public List<Entree> findAll() {
        String sql = "SELECT * FROM entree";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Entree.class));
    }

    public List<EntreeOrdered> findAllEntreeOrders() {
        String sql = "SELECT * FROM entree_ordered";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(EntreeOrdered.class));
    }

    public List<EntreeAndOrderId> findAllByOrderIds(List<Integer> orderIds) {
        log.info("Finding ALL entrees by orderIds: " + orderIds);
        String sql = "SELECT entree.*, entree_ordered.order_id " +
                "FROM entree_ordered " +
                "JOIN entree on entree.id = entree_ordered.entree_id " +
                "WHERE order_id IN (:orderIds) ";

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("orderIds", orderIds);

        List<EntreeAndOrderId> entreeAndOrderIds = namedParameterJdbcTemplate.query(
                sql,
                parameters,
                new BeanPropertyRowMapper<>(EntreeAndOrderId.class)
        );
        log.info("Found all of the following entrees with order ids: " + entreeAndOrderIds);
        return entreeAndOrderIds;
    }

    public void deleteAllByOrderId(Integer orderId) {
        String sql = "DELETE FROM entree_ordered WHERE order_id = ?";

        jdbcTemplate.update(sql, orderId);
    }
    
}


