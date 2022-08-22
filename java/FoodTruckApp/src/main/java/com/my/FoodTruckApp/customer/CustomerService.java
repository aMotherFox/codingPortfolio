package com.my.FoodTruckApp.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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

    // HARDCODED VERSION!!! v
//    public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
//        String sql = "INSERT INTO customer(id, first_name,last_name) VALUES(DEFAULT, 'Bently','Pruitt')";
//        System.out.println("--------------------INSIDE CREATENEWCUSTOMER" + sql);
//        Integer rows = jdbcTemplate.update(sql);
//        if(rows > 0){
//            System.out.println("A new row has been inserted!!! (HARDCODED)");
//        }
//        return sql;
//    }
    //

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
}
