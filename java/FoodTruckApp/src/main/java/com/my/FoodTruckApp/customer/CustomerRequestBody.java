package com.my.FoodTruckApp.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//annotation does the all args constructor
@NoArgsConstructor//annotation does the no args constructor
@Data //has all the getters, setters, and toString built in
public class CustomerRequestBody {
    private Integer customerId;
    private String customerFirstName;
    private String customerLastName;
}
