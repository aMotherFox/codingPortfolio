package com.my.FoodTruckApp.order;
import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.entree.Entree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private Integer id;
    private Integer customerId;
    private ArrayList<Entree> entreeOrders;
    private ArrayList<Appetizer> appetizerOrders;
}
