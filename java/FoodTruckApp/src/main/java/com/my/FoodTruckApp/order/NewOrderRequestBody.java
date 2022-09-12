package com.my.FoodTruckApp.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewOrderRequestBody {
    private Integer customerId; //the ID of what customer has placed the order
    private ArrayList<Integer> entreeIds;
    private ArrayList<Integer> appetizerIds;
}
