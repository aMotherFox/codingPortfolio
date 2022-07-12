package com.my.FoodTruckApp.entree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//annotation does the all args constructor
@NoArgsConstructor//annotation does the no args constructor
@Data //has all the getters, setters, and toString built in
public class Entree {
    private Integer id;
    private String size;
    private String flavor;
    private String pairedMeal;
    private Integer price;
}
