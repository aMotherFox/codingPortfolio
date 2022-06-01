import java.util.List;

/*
Create 5 different user objects
- each with at least 5 different fields
- 1 field must be age
- 1 field must be salary
- 1 field must be favoriteColor
- 1 field must be luckyNumber (at least one person has 7)

Create a function for each of the following problems:
(each function must be called once per usual)

1.) Give a list of all the users (entire object) who are about to retire (older than 59)

2.) Give a list of all the users who are not allowed to drink (younger than 21)

3.) Give a list of users that are underpaid (makes less than 30,000)

4.) Give total $ spent on employee salaries per year (total salaries)

5.) Give total amount of people who like "red" (output is a number)

6.) Give first (and only) person who's lucky number is 7 (output is an object)

Input for all of them: list of objects (list of users)

*/



public class User {

    public static void main(String[] args) {

    System.out.println("Let's see the users");

    UserModel user1 = new UserModel("Victoria", 26, 100000, "pink", 7); 
    System.out.println("user1: " + user1);

    UserModel user2 = new UserModel("Emre", 28, 100000, "black", 3); 
    System.out.println("user2: " + user2);

    UserModel user3 = new UserModel("Bucky", 3, 10000, "blue", 5); 
    System.out.println("user3: " + user3);
    
    UserModel user4 = new UserModel("Rocky", 3, 1000, "purple", 4); 
    System.out.println("user4: " + user4);

    UserModel user5 = new UserModel("Mika", 24, 100000, "red", 11); 
    System.out.println("user5: " + user5);

    //List<UserModel> users = List.of(user1, user2, user3, user4, user5);
        
    }


    
}
