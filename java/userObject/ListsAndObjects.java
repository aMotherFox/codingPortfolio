package userObject;//import java.rmi.server.UnicastRemoteObject;
import userObject.UserObject;

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

4.) ****DONE Give total $ spent on employee salaries per year (total salaries)

5.) ****DONE Give total amount of people who like "red" (output is a number)

6.) ****DONE Give first (and only) person who's lucky number is 7 (output is an object)

Input for all of them: list of objects (list of users)

*/

//what is an object: an object is an instance of a class

public class ListsAndObjects {

    public static void main(String[] args) {

    System.out.println("-------------------------GETTING USER INFO------------------------------");

    UserObject user1 = new UserObject("Victoria", 26, 100000, "pink", 7); //instanciating UserModel class, using all args constructor, gives me a UserModel object
    System.out.println("user1: " + user1);
    // System.out.println("name: " + user1.getName());
    // System.out.println("age: " + user1.getAge());
    // System.out.println("salary: " + user1.getSalary());
    // System.out.println("favorite color: " + user1.getFavoriteColor());
    // System.out.println("lucky number: " + user1.getLuckyNumber());

    UserObject user2 = new UserObject("Emre", 28, 100000, "black", 3); //instanciating UserModel class, using all args constructor, gives me a UserModel object
    System.out.println("user2: " + user2);
    // System.out.println("name: " + user2.getName());
    // System.out.println("age: " + user2.getAge());
    // System.out.println("salary: " + user2.getSalary());
    // System.out.println("favorite color: " + user2.getFavoriteColor());
    // System.out.println("lucky number: " + user2.getLuckyNumber());

    UserObject user3 = new UserObject("Bucky", 3, 10000, "blue", 5); //instanciating UserModel class, using all args constructor, gives me a UserModel object
    System.out.println("user3: " + user3);
    // System.out.println("name: " + user3.getName());
    // System.out.println("age: " + user3.getAge());
    // System.out.println("salary: " + user3.getSalary());
    // System.out.println("favorite color: " + user3.getFavoriteColor());
    // System.out.println("lucky number: " + user3.getLuckyNumber());

    UserObject user4 = new UserObject("Rocky", 300, 1000, "purple", 4); //instanciating UserModel class, using all args constructor, gives me a UserModel object
    System.out.println("user4: " + user4);
    // System.out.println("name: " + user4.getName());
    // System.out.println("age: " + user4.getAge());
    // System.out.println("salary: " + user4.getSalary());
    // System.out.println("favorite color: " + user4.getFavoriteColor());
    // System.out.println("lucky number: " + user4.getLuckyNumber());

    UserObject user5 = new UserObject("Mika", 24, 100000, "red", 11); //instanciating UserModel class, using all args constructor, gives me a UserModel object
    System.out.println("user5: " + user5);
    // System.out.println("name: " + user5.getName());
    // System.out.println("age: " + user5.getAge());
    // System.out.println("salary: " + user5.getSalary());
    // System.out.println("favorite color: " + user5.getFavoriteColor());
    // System.out.println("lucky number: " + user5.getLuckyNumber());

    List<UserObject> users = List.of(user1, user2, user3, user4, user5);

    List<UserObject> ourTotalRetirees = retiringSoonMethod(users); //calling the method and passing in users, retunring and assigning to ourTotalRetirees
    System.out.println("Those retiring soon: " + ourTotalRetirees);


    List<UserObject> ourUnderageEmployees = notDrinkingMethod(users); //calling the method and passing in users, retunring and assigning to ourUnderageEmployees
    System.out.println("Those too young to drink: " + ourUnderageEmployees); 
    

    List<UserObject> ourUnderpaidEmployees = areUnderpaidMethod(users); //calling the method and passing in users, retunring and assigning to ourUnderpaidEmployees
    System.out.println("Those who are underpaid: " + ourUnderpaidEmployees);


    UserObject hasLuckySeven = hasLuckyNumberMethod(users);
    System.out.println("Those who's lucky number is 7': " + hasLuckySeven);
    

    List<UserObject> redEnjoyers = likesRedMethod(users);
    System.out.println("Those who's lucky number is 7': " + redEnjoyers);

    Integer ourTotalSalaries = getTotalSpetnOnSalariesMethod(users);
    System.out.println("The total of salaries is: " + ourTotalSalaries);


    //making a list of the users
    // System.out.println("-------------------------MAKING LIST OF USERS------------------------------");
    // //List<UserModel> users = List.of(user1, user2, user3, user4, user5);
    // //UserModel firstUser = users[0];
    // UserModel firstUser = users.get(0);
    // String firstUserName = firstUser.getName();
    // System.out.println("firstUserName: " + firstUserName);
    //users[0].getName();

    //RETIRING SOON
    // System.out.println("-------------------------RETIRING SOON------------------------------");
    // List<UserModel> retiringSoon = users.stream().filter(user -> user.getAge() >= 60).collect(Collectors.toList());
    // //System.out.println("retiringSoon: " + retiringSoon.toString());

    // retiringSoon.forEach(user -> { 
    //     System.out.println("retiringSoon: " + user.getName());
    // });

    
    //CANNOT DRINK
    // System.out.println("-------------------------CANNOT DRINK------------------------------");
    // List<UserModel> notDrinking = users.stream().filter(user -> user.getAge() <= 20).collect(Collectors.toList());
    // //System.out.println("notDrinking: " + notDrinking.toString());

    // notDrinking.forEach(user -> { 
    //     System.out.println("notDrinking: " + user.getName());
    // });

    

    //UNDERPAID
    // System.out.println("-------------------------UNDERPAID------------------------------");
    // List<UserModel> areUnderpaid = users.stream().filter(user -> user.getSalary() <= 30000).collect(Collectors.toList());
    // //System.out.println("areUnderpaid: " + areUnderpaid.toString());

    // areUnderpaid.forEach(user -> { 
    //     System.out.println("areUnderpaid: " + user.getName());
    // });


    //LUCKY NUMBER
    // System.out.println("-------------------------LUCKY NUMBER------------------------------");
    // List<UserModel> hasLuckyNumber = users.stream().filter(user -> user.getLuckyNumber() == 7).collect(Collectors.toList());
    // //System.out.println("hasLuckyNumber: " + hasLuckyNumber.toString());

    // hasLuckyNumber.forEach(user -> { 
    //     System.out.println("hasLuckyNumber: " + user.getName());
    // });




    //TOTAL SALARIES
    // System.out.println("-------------------------TOTAL SALARIES------------------------------");
    // List<UserModel> getTotalSpetnOnSalaries = users.stream().filter(user -> user.getSalary() >= 1).collect(Collectors.toList());
    // System.out.println("getTotalSpetnOnSalaries: " + getTotalSpetnOnSalaries.toString());

    // getTotalSpetnOnSalaries.forEach(user -> {

    // }); DID NOT FINISH



    //LIKES RED
    // System.out.println("-------------------------LIKES RED------------------------------");
    // List<UserModel> likesRed = users.stream().filter(user -> user.getFavoriteColor() == "red").collect(Collectors.toList());
    // //System.out.println("likesRed: " + likesRed.toString());

    // likesRed.forEach(user -> { 
    //     System.out.println("likesRed: " + user.getName());
    // });

        
    }

    //making private methods outside of the main
    private static List<UserObject> retiringSoonMethod(List<UserObject> users) {
        System.out.println("-------------------------RETIRING SOON METHOD------------------------------");
        List<UserObject> retiringSoon = users.stream().filter(user -> user.getAge() >= 60).collect(Collectors.toList());
        return retiringSoon;
    }


    private static List<UserObject> notDrinkingMethod(List<UserObject> users) {
        System.out.println("-------------------------CANNOT DRINK METHOD------------------------------");
        List<UserObject> notDrinking = users.stream().filter(user -> user.getAge() <= 20).collect(Collectors.toList());
        return notDrinking;
    }

    private static List<UserObject> areUnderpaidMethod(List<UserObject> users) {
        System.out.println("-------------------------UNDERPAID METHOD------------------------------");
        List<UserObject> areUnderpaid = users.stream().filter(user -> user.getSalary() <= 30000).collect(Collectors.toList());
        return areUnderpaid;
    }

    private static UserObject hasLuckyNumberMethod(List<UserObject> users) {
        System.out.println("-------------------------LUCKY NUMBER METHOD------------------------------");
        UserObject hasLuckyNumber = users.stream().filter(user -> user.getLuckyNumber() == 7).findAny().orElse(null);
        return hasLuckyNumber;
    }

    private static List<UserObject> likesRedMethod(List<UserObject> users) {
        System.out.println("-------------------------LIKES RED METHOD------------------------------");
        List<UserObject> likesRed = users.stream().filter(user -> user.getFavoriteColor() == "red").collect(Collectors.toList());
        return likesRed;
    }

    private static Integer getTotalSpetnOnSalariesMethod(List<UserObject> users) {
        System.out.println("-------------------------TOTAL SALARIES METHOD------------------------------");
        Integer totalSalaries = 0;
        for(UserObject user : users) {
            totalSalaries = totalSalaries + user.getSalary();
        }
        return totalSalaries;
    } // TODO: put these methods in another user class; USER SERVICE CLASS


    
}

//anytime you use . in java/js it means you're accessing the properties/fields OR you're getting the methods
//every function/methods you call with ()
//if you had a property with name car and had a method in the same class also called car, if you do object.car, it returns the property, but if you use object(car) it calls the methods
//variables/parameters are nothing other than ways to visually split up the code

//collectors
/*



*/