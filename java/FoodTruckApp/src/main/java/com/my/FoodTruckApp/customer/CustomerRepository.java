package com.my.FoodTruckApp.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class CustomerRepository {

    private final JdbcTemplate jdbcTemplate;

    public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody) {
        String sql = "INSERT INTO customer(first_name,last_name) VALUES(?, ?)";
        Integer rows = jdbcTemplate.update(sql, customerRequestBody.getCustomerFirstName(), customerRequestBody.getCustomerLastName());
        if(rows > 0) {
            log.info("A new customer has successfully been inserted");
        }
        return "CREATING A CUSTOMER WORKED";
    }

    public Customer gettingCustomersById(@PathVariable Integer id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        try {
            Customer customerById = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class), id);
            return customerById;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("No customer with id: " + id + " was found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No customer with id: " + id + " was found");
        }
    }

    public List<Customer> gettingListOfCustomers() {
        String sql = "SELECT * FROM CUSTOMER";
        List<Customer> customers = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));
        return customers;
    }
}
