package com.my.FoodTruckApp.appetizer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppetizerRequestBody {
    private Integer appId;
    private String appName;
    private Integer appPrice;
}
