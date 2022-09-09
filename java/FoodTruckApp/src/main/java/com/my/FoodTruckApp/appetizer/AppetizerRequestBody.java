package com.my.FoodTruckApp.appetizer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppetizerRequestBody {
    private String name;
    private Integer price;
}
