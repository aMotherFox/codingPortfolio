import java.util.Scanner;

public class WordCasingConverter {

    //sysout word entirely lower case, entirely upper case, and only FIRST letter uppercase
    //toUpperCase
    //toLowerCase

    public static void main(String[] args) {
        // must ask for user input
        System.out.println("--------------CREATE PROGRAM THAT ALLOWS USER TO CHANGE THE CASE OF AN INPUTTED WORD---------------");

        //new = instanciate
       
        //String userInput = scanner.nextLine(); //where we input on terminal
        changingCasing();
    }

    private static void changingCasing(){
        
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object
        System.out.println("Please input a word: ");
        String userInput = scanner.nextLine();

        String uppercase = userInput.substring(0,1);
        String otherLetters = userInput.substring(1);
        //substring = method that returns part of a string, indexes are beginIndex (0) and endIndex(1)
        //if we don't specify endIndex, the method will return all characters from the beginIndex

        uppercase = uppercase.toUpperCase(); //need to specify first letter so we can case it separately

        System.out.println("All lowercase: " + userInput.toLowerCase());
        System.out.println("All uppercase: " + userInput.toUpperCase());
        System.out.println("Capitalized first letter: " + uppercase + otherLetters);

        //String firstCapital = userInput.substring(0,1).toUpperCase() + userInput.substring(1);
        // System.out.println(firstCapital);

    }


    // private static String changingCasing(String userInput) {
    //     String uppercase = userInput.substring(0,1);
    //     String otherLetters = userInput.substring(1);
    //     //substring = method that returns part of a string, indexes are beginIndex (0) and endIndex(1)
    //     //if we don't specify endIndex, the method will return all characters from the beginIndex
    //     //need to specify first letter so we can case it separately

    //     uppercase = uppercase.toUpperCase();  //method that converts string to uppercase letters

    //     //can only return one thing
    // }
    
}

/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/