package com.my.FoodTruckApp.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppetizerOrdered {
    private Integer orderId;
    private Integer appetizerId;
}
