package com.my.FoodTruckApp;

//use annotations to connect files to main app; cannot be standalone app
//will connect to spring
//CANNOT HAVE MULTIPLE MAINS!! this file will not have a main
//will press play button from main file/app and this file should run

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//extends SpringBootServletInitializer??
public class FoodTruckJBDC extends SpringBootServletInitializer implements CommandLineRunner {

    Connection connection = DriverManager.getConnection("jdbc:postgres//localhost:8080/food_truck");
    String url = "jdbc:postgresql://localhost/food_truck";
    String user = "";
    String password = "";
    @Autowired
    JdbcTemplate jdbcTemplate;

    public FoodTruckJBDC() throws SQLException {
    }

    @Override
    public void run(String... args) throws Exception {
        String sqlCode = "INSERT INTO customer VALUES ('Kat', 'Garcia')";

        Integer rows = jdbcTemplate.update(sqlCode);
        if(rows > 0){
            System.out.println("new row inserted");
        }
    }

    public void testTable() throws Exception {
        String newTable = "CREATE TABLE testing (id INTEGER NOT NULL);";
    }






}
