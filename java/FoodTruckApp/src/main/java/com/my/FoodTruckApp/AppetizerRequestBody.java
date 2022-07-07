package com.my.FoodTruckApp;
import lombok.*;

//GENERATE IS A FEATURE OF INTELLIJ

@AllArgsConstructor//annotation does the all args constructor
@NoArgsConstructor//annotation does the no args constructor
@Data //has all the getters, setters, and toString built in

public class AppetizerRequestBody {
    private String appSize;
    private String appFlavor;
    private String appPairedMeal;
    private Integer appPrice;
}
