//package com.my.FoodTruckApp;
//
////use annotations to connect files to main app; cannot be standalone app
////will connect to spring
////CANNOT HAVE MULTIPLE MAINS!! this file will not have a main
////will press play button from main file/app and this file should run
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//
//@Repository
//public class JdbcRepository {
//
//    Connection connection = DriverManager.getConnection("jdbc:postgres//localhost:8080/food_truck");
//    //method returns connection to the URL
//    //SQLException will be thrown if cannot run
////    String url = "jdbc:postgresql://localhost/food_truck";
////    String user = "";
////    String password = "";
////    @Autowired
////    JdbcTemplate jdbcTemplate;
//     //^essentially inserts data into the sql API
//    //like typing code into the terminal?
//
//    public JdbcRepository() throws SQLException {
//        System.out.println("Inside the JDBC");
//    }
//    // ^essentially inserts data into the sql API
//    //like typing code into the terminal?
//
//    public static String returningJdbc() {
//        return "CREATE TABLE testingJdbc";
//    }
//
//}