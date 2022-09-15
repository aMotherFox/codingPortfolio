package com.my.FoodTruckApp.customer;

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
public class CustomerRepository {

    private final JdbcTemplate jdbcTemplate;

    public Customer createNewCustomer(CustomerRequestBody customerRequestBody) {
        String sql = "INSERT INTO customer(first_name,last_name) VALUES(?, ?) RETURNING *";
        Customer newCustomer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class),
                customerRequestBody.getCustomerFirstName(), customerRequestBody.getCustomerLastName());
        return newCustomer;
    } //NOTE FOR FUTURE REFERENCE: do not use this way to create/return new rows, use JPA

    public Customer gettingCustomersById(Integer id) {
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

    public void deleteCustomerById(Integer id) {
        String sqlDelete = "DELETE FROM customer WHERE id = ?";
        String sqlFind = "SELECT * FROM customer WHERE id = ?";
        try {
            jdbcTemplate.queryForObject(sqlFind, new BeanPropertyRowMapper<>(Customer.class), id);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("No customer with id: " + id + " was found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No customer with id: " + id + " was found");
        }
        jdbcTemplate.update(sqlDelete, id);
    }
}


//make a carry out bag for the order
    //OrderDTO field id to spit out created order's id
//put all ordered entrees into carry out bag
    //OrderDTO field entreeOrders to spit out list of entrees ordered (OBJECTS, NOT IDs)
//put all ordered apps into carry out bag
    //OrderDTO field appetizerOrders to spit out list of apps ordered (OBJECTS, NOT IDs)
//Give carry out bag to customer
    //return looks like:
    //{
    //    id: PK,
    //    entrees: List<Entree>
    //    appetizers: List<Appetizer>
    //}

//{
//        id: PK,
//        entrees: List<Entree>
//    appetizers: List<Appetizer>
//}
