package com.my.FoodTruckApp.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;


    public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody) {
        return customerRepository.createNewCustomer(customerRequestBody);
    }

    public Customer gettingCustomersById(@PathVariable Integer id) {
        return customerRepository.gettingCustomersById(id);
    }

    public List<Customer> gettingListOfCustomers() {
        return customerRepository.gettingListOfCustomers();
    }

}
