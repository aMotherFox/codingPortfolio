package com.my.FoodTruckApp;
//import lombok.*;

//GENERATE IS A FEATURE OF INTELLIJ

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//annotation does the all args constructor
@NoArgsConstructor//annotation does the no args constructor
@Data //has all the getters, setters, and toString built in

public class AppetizerModel {
    private Integer id;
    private String size;
    private String flavor;
    private String pairedMeal;
    private Integer price;
}
