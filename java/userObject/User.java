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

    System.out.println("Let's see the users");

    UserModel user1 = new UserModel("Victoria", 26, 100000, "pink", 7); 
    System.out.println("user1: ", user1);
    
}
