package com.my.FoodTruckApp;
import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.entree.Entree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor//annotation does the all args constructor
@NoArgsConstructor//annotation does the no args constructor
@Data //has all the getters, setters, and toString built in
public class Order {
    private Integer id;
    private Appetizer orderedAppetizer;
    private Entree orderedEntree;
    //TODO: make app and entree to lists
}
