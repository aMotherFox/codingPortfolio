package com.my.FoodTruckApp;

//use annotations to connect files to main app; cannot be standalone app
//will connect to spring
//CANNOT HAVE MULTIPLE MAINS!! this file will not have a main
//will press play button from main file/app and this file should run

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//extends SpringBootServletInitializer??
//public class FoodTruckJBDC extends SpringBootServletInitializer implements CommandLineRunner {
//
//    Connection connection = DriverManager.getConnection("jdbc:postgres//localhost:8080/food_truck");
//    //method returns connection to the URL
//    //SQLException will be thrown if cannot run
//    String url = "jdbc:postgresql://localhost/food_truck";
//    String user = "";
//    String password = "";
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//    // ^essentially inserts data into the sql API
//    //like typing code into the terminal?
//
//    public FoodTruckJBDC() throws SQLException {
//    }
//
//    @Override
//    public void run(String... args) throws SQLException {
//        String sqlCode = "INSERT INTO customer VALUES ('Kat', 'Garcia')";
//
//        Integer rows = jdbcTemplate.update(sqlCode);
//        if(rows > 0){
//            System.out.println("new row inserted");
//        }
//    }
//
//    public void testTable() throws SQLException {
//        String newTable = "CREATE TABLE testing (id INTEGER NOT NULL);";
//    }
//}
@Repository
public class JdbcRepository extends OrderRepository {

    Connection connection = DriverManager.getConnection("jdbc:postgres//localhost:8080/food_truck");
    //method returns connection to the URL
    //SQLException will be thrown if cannot run
    String url = "jdbc:postgresql://localhost/food_truck";
    String user = "";
    String password = "";
    @Autowired
    JdbcTemplate jdbcTemplate;
     //^essentially inserts data into the sql API
    //like typing code into the terminal?

    public JdbcRepository() throws SQLException {
        System.out.println("Inside the JDBC");
    }
    // ^essentially inserts data into the sql API
    //like typing code into the terminal?


//    public static void createTable() {
//        Connection c = null;
//        Statement stmt = null;
//        String CreateSql = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            c = DriverManager.getConnection(
//                    "jdbc:postgresql://localhost:8080/food_truck",
//                    "", "");
//            System.out.println("Database Connected ..");
//            stmt = c.createStatement();
//            CreateSql = "Create Table Test(id int primary key, name varchar) ";
//            stmt.executeUpdate(CreateSql);
//            stmt.close();
//            c.close();
//        }
//        catch (Exception e)
//        {
//            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//            System.exit(0);
//        }
//
//        System.out.println("Table Created successfully");
//    }
}