package com.my.FoodTruckApp.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntreeOrdered {
    private Integer orderId;
    private Integer entreeId;
}
//when creating models named after a table, name it the same thing
