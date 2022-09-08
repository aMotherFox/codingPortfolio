package com.my.FoodTruckApp.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;


    public Customer createNewCustomer(CustomerRequestBody customerRequestBody) {
        return customerRepository.createNewCustomer(customerRequestBody);
    }

    public Customer gettingCustomersById(Integer id) {
        return customerRepository.gettingCustomersById(id);
    }

    public List<Customer> gettingListOfCustomers() {
        return customerRepository.gettingListOfCustomers();
    }

    public void deleteCustomerById(Integer id) {
        customerRepository.deleteCustomerById(id);
    }
}
