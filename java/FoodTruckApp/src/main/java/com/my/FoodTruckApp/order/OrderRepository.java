package com.my.FoodTruckApp.order;

import com.my.FoodTruckApp.appetizer.Appetizer;
import com.my.FoodTruckApp.entree.Entree;
import com.my.FoodTruckApp.order.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.my.FoodTruckApp.appetizer.AppetizerRepository;
import com.my.FoodTruckApp.appetizer.AppetizerService;
import com.my.FoodTruckApp.entree.EntreeRepository;
import com.my.FoodTruckApp.entree.EntreeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OrderRepository {

    private final JdbcTemplate jdbcTemplate;
    private final EntreeRepository entreeRepository;
    private final AppetizerRepository appetizerRepository;

    public ArrayList<Order> getListOfOrders() {
        String sql = "SELECT * FROM \"order\" ";
        ArrayList<Order> orders = (ArrayList<Order>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
        return orders;
    }

    public String createOrder(NewOrderRequestBody newOrderRequestBody) {

        //IF order created, we want to find the entrees
        //AKA if row is inserted, iterate through the entreeIds array
        //can tell row is inserted because it returns integer
        String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *"; //put back in  RETURNING * when done with String return
        System.out.println("the createOrder sql: " + sql);
        Order newOrder = jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Order.class),
                newOrderRequestBody.getCustomerId()
        );
        System.out.println("our new order: " + newOrder);
        //IF row is inserted, take entreeIds from requestBody, and iterate through that array
        //during our iteration, we can find entrees by id
        //EntreeRepo has method already
        List<Integer> entreeIdList = newOrderRequestBody.getEntreeIds();
        System.out.println("our list of entrees: " + entreeIdList);
        entreeIdList.forEach(entree -> {
            Entree newEntree = entreeRepository.getEntreeById(entree);
            System.out.println("our new order's entree: " + newEntree);
            //put entrees onto recipet (entrees_ordered table)
            //can tell what order by orderId and which entrees by entreeIds
            String entreeSql = "INSERT INTO entree_ordered (order_id, entree_id) VALUES (?, ?) RETURNING *";
            System.out.println("our new order's entree inserted into entree_ordered: " + entreeSql);
            EntreeOrdered orderedEntreeReciept = jdbcTemplate.queryForObject(
                    entreeSql,
                    new BeanPropertyRowMapper<>(EntreeOrdered.class),
                    newOrder.getId(),
                    newEntree.getId()
            );
            System.out.println("entree reciept: " + orderedEntreeReciept );
        });

        //find appetizers for the order
        //iterate through appetizerIds and find appetizers via those ids
        //using appetizer repo method
        //put appetizers onto recipet recipet (appetizer_ordered table)
        //can tell what order by orderId and which entrees by entreeIds

        return "repo";
    }


//    Appetizer appetizer1 = new Appetizer(1, "hardcoded fries", 4);
//    Appetizer appetizer2 = new Appetizer(2, "hardcoded onion rings", 6);
//    ArrayList<Appetizer> appetizers = new ArrayList<>(Arrays.asList(appetizer1, appetizer2));
//    //----------------------------------------------------------------------------------------------------------------------------------------
//    Entree entree1 = new Entree(1, "hardcoded burger", 14);
//    Entree entree2 = new Entree(2, "hardcoded spaghetti", 16);
//    ArrayList<Entree> entrees = new ArrayList<>(Arrays.asList(entree1, entree2));
//    //----------------------------------------------------------------------------------------------------------------------------------------
//    Order order1 = new Order(1, appetizers, entrees);
//    Order order2 = new Order(2, appetizers, entrees);
//    ArrayList<Order> orders = new ArrayList<>(Arrays.asList(order1, order2));
//
////    public ArrayList<Appetizer> getAllAppetizers() { return appetizers;}
////    public ArrayList<Entree> getAllEntrees() { return entrees;}
//    public ArrayList<Order> getAllOrders() {
//        return orders;
//    }
}
