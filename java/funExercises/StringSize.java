package funExercises;

import java.util.Scanner;

// must ask for user input

public class StringSize {

    public static void main(String[] args) {
        System.out.println("--------------FIND THE NUMBER OF CHARACTERS IN A STRING---------------");

        //new = instanciate
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        System.out.println("Please input a word: ");
        String userInput = scanner.nextLine(); //where we input on terminal

        //Integer characterCount = 0;

        Integer characterTotal = getCharacterLength(userInput); //calling function and passing in userInput, assigning function return to characterTotal
        System.out.println("The number of characters is: " + characterTotal);
        
    }

    private static Integer getCharacterLength(String userInput) {
        Integer stringLength = userInput.length();
        return stringLength;
    }
    
}


/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/