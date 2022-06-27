//import java.util.List;
import java.util.Scanner;

public class ReversingString {
    
    public static void main(String[] args) {
        System.out.println("----------------CREATE PROGRAM THAT REVERSES A STRING----------------");

        //new = instanciate
        // Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        // System.out.println("Please input a word: ");
        //String userInput = scanner.nextLine(); //where we input on terminal
    
        // String newReverseString = getStringsReverse(userInput);
        // System.out.println("The reversed string is: " + newReverseString);
        getStringsReverse(); //calling functions and passing in nothing
    }

    private static void getStringsReverse(){

        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        System.out.println("Please input a word: ");
        String userInput = scanner.nextLine();

        StringBuilder userInput2 = new StringBuilder();
        userInput2.append(userInput); //appending (assigning) userInput to userInput2
        userInput2.reverse();
        System.out.println("Your reverse word is: " + userInput2);
    }

    //private static String getStringsReverse(String userInput) {
        // List<String> newArray = userInput.split(""); //split returns the string as an array
        // List<String> reverseArray = newArray.reverse(); //reverse reverses the array
        // String joinArray = reverseArray.join(""); //join put the new array into a string
        //return userInput.split("").reverse().join("");
    //}

}


/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/