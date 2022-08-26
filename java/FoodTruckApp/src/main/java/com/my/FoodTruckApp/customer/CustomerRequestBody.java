package com.my.FoodTruckApp.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerRequestBody {
    private Integer customerId;
    private String customerFirstName;
    private String customerLastName;
}
