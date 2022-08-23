package com.my.FoodTruckApp.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

//@Service
@Repository
public class CustomerRepository {

    @Autowired //sloppy way to make this usable to spring across files, no longer have to manually instanciate
    JdbcTemplate jdbcTemplate; //connects to the DB and executes SQL queries

    private final Customer customer1 = new Customer(1,"Mark", "Garcia");
    private final Customer customer2 = new Customer(1,"Dawn", "Nyan");
    ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(customer1, customer2));
    //must hardcode customers to establish arraylist but should only be pulling customers from DB??

    public  ArrayList<Customer> getAllCustomers(){
        return customers;
    }

//    ArrayList<Customer> jdbcCustomers = new ArrayList<>();
//    public ArrayList<Customer> gettingAllCustomers() {
//
//    }


    // Trying to get arraylist from DB, cannot check until postgresql is fixed
//    public ArrayList<Customer> findAllCustomersInDb() {
//        String sql = "SELECT * FROM customer";
//        ArrayList<Customer> customers = (ArrayList<Customer>) jdbcTemplate.query(
//                sql,
//                new BeanPropertyRowMapper(Customer.class) //RowMapper converts row into a new instance of the targeted class
//        );
//        return customers;
//    }

//    public Customer findCustomerById() {
//        System.out.println("-----INSIDE THE REPO-------");
//        String sql = "SELECT * FROM customer WHERE id = 1";
//        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class));
//    }


//    ArrayList<String> customers = new ArrayList<String>();
//    try (Connection connection = DBConnection.openConnetion()) {
//        String sql = "SELECT * FROM customer";
//        try (PreparedStatement statement = connection.prepareStatement((sql);
//             ResultSet resultSet = statement.executeQuery()) {
//            while (true) {
//                try {
//                    if (!resultSet.next()) break;
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//                try {
//                    customers.add(resultSet.getString("customer"));
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }

//    ArrayList<String> customers = jdbcTemplate.queryForObject(
//            "SELECT * FROM customer"
//    );

//    public ArrayList<String> getAllCustomers() {
//        return customers;
//    }
//    JdbcTemplate jdbcTemplate = new JdbcTemplate(); //INSTANCIATED the template manually

//    public void createNewCustomer() {
//        String sql = "INSERT INTO customer VALUES (DEFAULT 'Bucky', 'Boy')";
//        Integer rows = jdbcTemplate.update(sql);
//        if(rows > 0) {
//            System.out.println("A NEW ROW HAS BEEN INSERTED");
//        } // TODO: method should not be in repo, move to service
//    }
}
