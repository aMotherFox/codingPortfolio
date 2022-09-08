package com.my.FoodTruckApp.customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/customers")
    public Customer createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
        return customerService.createNewCustomer(customerRequestBody);
    }

    @GetMapping("/customers/{id}")
    public Customer gettingCustomersById(@PathVariable Integer id) {
        return customerService.gettingCustomersById(id);
    }

    @GetMapping("/customers")
    public List<Customer> gettingListOfCustomers() {
        return customerService.gettingListOfCustomers();
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomerById(@PathVariable Integer id) {
        customerService.deleteCustomerById(id);
    }
}
