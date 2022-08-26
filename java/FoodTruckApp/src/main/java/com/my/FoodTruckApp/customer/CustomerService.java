package com.my.FoodTruckApp.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service //annotation that tells spring THIS IS OUR SERVICE
@RequiredArgsConstructor //necessary for the dependency injection to the repository
public class CustomerService {

    private final JdbcTemplate jdbcTemplate;

    //-------------- create new customer -----------------------

    public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody) {
        String sql = "INSERT INTO customer(id, first_name,last_name) VALUES(DEFAULT, ?, ?)";
        // ALSO WORKS : String sql = "INSERT INTO customer(first_name,last_name) VALUES(?, ?)";
        Integer rows = jdbcTemplate.update(sql, customerRequestBody.getCustomerFirstName(), customerRequestBody.getCustomerLastName());
        //we are taking the string passed into the request body and converting it to an object field, in this case first and last name
        if(rows > 0) {
            System.out.println("A new customer has been inserted (REQUEST BODY)");
        }
        return "CREATING A CUSTOMER WORKED";
    }

    //-------------- get customers by id -----------------------
    public Customer gettingCustomersById(@PathVariable Integer id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        try {
            Customer customerById = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class), id);
            //queryForObject -> TRY
            System.out.println("customer by ID" + customerById);
            return customerById;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            System.out.println("incorrect id");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Customer> gettingListOfCustomers() {
        String sql = "SELECT * FROM CUSTOMER";
        List<Customer> customers = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));
        return customers;
    }

}
