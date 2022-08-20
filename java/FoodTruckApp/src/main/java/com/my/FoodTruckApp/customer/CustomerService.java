package com.my.FoodTruckApp.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service //annotation that tells spring THIS IS OUR SERVICE
@RequiredArgsConstructor //necessary for the dependency injection to the repository
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final JdbcTemplate jdbcTemplate;


    //----------------- get list of customers -------------------------
    public List<Customer> listOfCustomers(){
        List<Customer> customers = customerRepository.getAllCustomers();
        System.out.println("this is ALL!! the Customers" +  customers);
        return customers;
    }

    //----------------- get customer by ID -------------------------
    public Optional<Customer> getCustomerById(@PathVariable Integer id) {
        ArrayList<Customer> customers = customerRepository.getAllCustomers();
        System.out.println("getting customers by their id: " + id);
        Optional<Customer> customerById = customers.stream().filter(customer -> customer.getId() == id).findFirst();
        return customerById;
    }
    //-------------- create new customer -----------------------

    // jdbcTemplate.execute() ??
    public String createNewCustomer(){
        String sql = "INSERT INTO customer(id, first_name,last_name) VALUES(DEFAULT, 'Bently','Pruitt')";
        System.out.println("--------------------INSIDE CREATENEWCUSTOMER" + sql);
        Integer rows = jdbcTemplate.update(sql); //update vs execute
        if(rows > 0){
            System.out.println("A new row has been inserted!!!");
        }
        return sql;
    }

    //-------------- create new customer -----------------------

//    public Optional<Customer> findCustomerById(@PathVariable Integer id) {
//        System.out.println("------------INSIDE FINDCUSTOMERBYID-----------");
//        Optional<Customer> customerById = Optional.ofNullable(customerRepository.findCustomerById());
//        return customerById;
//    }
}
