package com.my.FoodTruckApp.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewOrderRequestBody {
    private Integer customerId;
    private List<Integer> entreeIds;
    private List<Integer> appetizerIds;
}
