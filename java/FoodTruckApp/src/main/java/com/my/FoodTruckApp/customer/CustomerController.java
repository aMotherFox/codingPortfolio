package com.my.FoodTruckApp.customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    public String createNewCustomer(){
        System.out.println("creating a new customer");
        customerService.createNewCustomer();
        return "making a new customer";
    }

    //-------------- TESTING by ID -----------------------
//    @GetMapping("/customers-test/{id}")
//    public Optional<Customer> findCustomerById(@PathVariable Integer id) {
//        System.out.println("Inside the test for ID");
//        return customerService.findCustomerById(id) ;
//    }
//    @PostMapping("/customers")
//    public void createNewCustomer() {
//        System.out.println("creating a new customer");
////        log.info("Creating a new customer");
//        customerRepository.createNewCustomer();
//    }
}
