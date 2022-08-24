package com.my.FoodTruckApp.customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j //makes use of loggers possible
public class CustomerController {

    private final CustomerService customerService;  //getting an instance of the service, THIS IS THE DEPENDENCY INJECTION

    private final CustomerRepository customerRepository; //getting an instance of the service, THIS IS THE DEPENDENCY INJECTION

    //----------------- get list of customers -------------------------
    @GetMapping("/customer-list")
    public ResponseEntity<ArrayList<Customer>> listOfCustomers() {
        ArrayList<Customer> customers = (ArrayList<Customer>) customerService.listOfCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
    //-------------- get customer by ID -----------------------
    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }
    //-------------- create new customer -----------------------
    @PostMapping("/customers")
    public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
        System.out.println("creating a new customer");
        return customerService.createNewCustomer(customerRequestBody); //customerRequestBody is the raw JSON we input on PostMan
    }

    //-------------- get all customers -----------------------
    @GetMapping("/customers")
    public Customer gettingAllCustomers() {
        System.out.println("customer controller gettingallcustomers");
        return customerService.gettingAllCustomers();
    }
}
