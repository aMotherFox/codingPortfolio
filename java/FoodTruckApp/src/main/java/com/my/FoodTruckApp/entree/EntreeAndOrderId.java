package com.my.FoodTruckApp.entree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntreeAndOrderId {
    private Integer id;
    private String name;
    private Integer price;
    private Integer orderId;
}
