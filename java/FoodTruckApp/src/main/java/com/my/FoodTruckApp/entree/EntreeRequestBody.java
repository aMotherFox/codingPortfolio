package com.my.FoodTruckApp.entree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//annotation does the all args constructor
@NoArgsConstructor//annotation does the no args constructor
@Data //has all the getters, setters, and toString built in
public class EntreeRequestBody {
    private String entreeSize;
    private String entreeFlavor;
    private String entreePairedMeal;
    private Integer entreePrice;
}
