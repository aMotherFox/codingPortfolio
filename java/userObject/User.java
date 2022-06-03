import java.util.List;
import java.util.stream.Collectors;

/*
Create 5 different user objects
- each with at least 5 different fields
- 1 field must be age
- 1 field must be salary
- 1 field must be favoriteColor
- 1 field must be luckyNumber (at least one person has 7)

Create a function for each of the following problems:
(each function must be called once per usual)

1.) ****DONE Give a list of all the users (entire object) who are about to retire (older than 59)

2.) ****DONE Give a list of all the users who are not allowed to drink (younger than 21)

3.) ****DONE Give a list of users that are underpaid (makes less than 30,000)

4.) Give total $ spent on employee salaries per year (total salaries)

5.) ****DONE Give total amount of people who like "red" (output is a number)

6.) ****DONE Give first (and only) person who's lucky number is 7 (output is an object)

Input for all of them: list of objects (list of users)

*/

//what is an object: an object is an instance of a class

public class User {

    public static void main(String[] args) {

    System.out.println("Let's see the users");

    UserModel user1 = new UserModel("Victoria", 26, 100000, "pink", 7); //instanciating UserModel class, using all args constructor, gives me a UserModel object
    System.out.println("name: " + user1.getName());
    System.out.println("age: " + user1.getAge());
    System.out.println("salary: " + user1.getSalary());
    System.out.println("favorite color: " + user1.getFavoriteColor());
    System.out.println("lucky number: " + user1.getLuckyNumber());

    UserModel user2 = new UserModel("Emre", 28, 100000, "black", 3); 
    System.out.println("user2: " + user2);
    System.out.println("name: " + user2.getName());
    System.out.println("age: " + user2.getAge());
    System.out.println("salary: " + user2.getSalary());
    System.out.println("favorite color: " + user2.getFavoriteColor());
    System.out.println("lucky number: " + user2.getLuckyNumber());

    UserModel user3 = new UserModel("Bucky", 3, 10000, "blue", 5); 
    System.out.println("user3: " + user3);
    System.out.println("name: " + user3.getName());
    System.out.println("age: " + user3.getAge());
    System.out.println("salary: " + user3.getSalary());
    System.out.println("favorite color: " + user3.getFavoriteColor());
    System.out.println("lucky number: " + user3.getLuckyNumber());
    
    UserModel user4 = new UserModel("Rocky", 300, 1000, "purple", 4); 
    System.out.println("user4: " + user4);
    System.out.println("name: " + user4.getName());
    System.out.println("age: " + user4.getAge());
    System.out.println("salary: " + user4.getSalary());
    System.out.println("favorite color: " + user4.getFavoriteColor());
    System.out.println("lucky number: " + user4.getLuckyNumber());

    UserModel user5 = new UserModel("Mika", 24, 100000, "red", 11); 
    System.out.println("user5: " + user5);
    System.out.println("name: " + user5.getName());
    System.out.println("age: " + user5.getAge());
    System.out.println("salary: " + user5.getSalary());
    System.out.println("favorite color: " + user5.getFavoriteColor());
    System.out.println("lucky number: " + user5.getLuckyNumber());



    //making a list of the users
    List<UserModel> users = List.of(user1, user2, user3, user4, user5);
    //UserModel firstUser = users[0];
    UserModel firstUser = users.get(0);
    String firstUserName = firstUser.getName();
    System.out.println("firstUserName: " + firstUserName);
    //users[0].getName();

    //RETIRING SOON
    List<UserModel> retiringSoon = users.stream().filter(user -> user.getAge() >= 60).collect(Collectors.toList());
    System.out.println("retiringSoon: " + retiringSoon.toString());

    retiringSoon.forEach(user -> { 
        System.out.println("user: " + user.getName());
    });

    
    //CANNOT DRINK
    List<UserModel> notDrinking = users.stream().filter(user -> user.getAge() <= 20).collect(Collectors.toList());
    System.out.println("notDrinking: " + notDrinking.toString());

    notDrinking.forEach(user -> { 
        System.out.println("user: " + user.getName());
    });

    

    //UNDERPAID
    List<UserModel> areUnderpaid = users.stream().filter(user -> user.getSalary() <= 30000).collect(Collectors.toList());
    System.out.println("areUnderpaid: " + areUnderpaid.toString());

    areUnderpaid.forEach(user -> { 
        System.out.println("user: " + user.getName());
    });


    //LUCKY NUMBER
    List<UserModel> hasLuckyNumber = users.stream().filter(user -> user.getLuckyNumber() == 7).collect(Collectors.toList());
    System.out.println("hasLuckyNumber: " + hasLuckyNumber.toString());

    hasLuckyNumber.forEach(user -> { 
        System.out.println("user: " + user.getName());
    });




    //TOTAL SALARIES
    List<UserModel> getTotalSpetnOnSalaries = users.stream().filter(user -> user.getSalary() >= 1).collect(Collectors.toList());
    System.out.println("getTotalSpetnOnSalaries: " + getTotalSpetnOnSalaries.toString());

    getTotalSpetnOnSalaries.forEach(user -> {

    });



    //LIKES RED
    List<UserModel> likesRed = users.stream().filter(user -> user.getFavoriteColor() == "red").collect(Collectors.toList());
    System.out.println("likesRed: " + likesRed.toString());

    likesRed.forEach(user -> { 
        System.out.println("user: " + user.getName());
    });

        
    }


    
}

//anytime you use . in java/js it means you're accessing the properties/fields OR you're getting the methods
//every function/methods you call with ()
//if you had a property with name car and had a method in the same class also called car, if you do object.car, it returns the property, but if you use object(car) it calls the methods
//variables/parameters are nothing other than ways to visually split up the code

//collectors
/*



*/