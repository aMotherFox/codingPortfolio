package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.entree.Entree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private Integer id;
    private List<Entree> entreeOrders;
    private List<Appetizer> appetizerOrders;

//    public OrderDTO(Order order, OrderRepository orderRepository) {
//        this.id = order.getId();
//        this.customerId = order.getCustomerId();
//        this.entreeOrders = entreeOrdered.getEntreeId();
//        this.appetizerOrders = appetizerOrdered.getAppetizerId();
//    }
}
