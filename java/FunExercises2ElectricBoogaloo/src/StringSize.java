import java.util.Scanner;

public class StringSize {
    public static void main(String[] args) {
        System.out.println("--------NUMBER OF CHARACTERS IN A STRING-----------");

        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object
        System.out.println("Please input a word: ");
        String userInputStringSize = scanner.nextLine(); //where we input on terminal

        Integer characterTotal = getCharacterLength(userInputStringSize); //calling function and passing in userInputStringSize, assigning function return to characterTotal
        System.out.println("The number of character: " + characterTotal);
    }

    private static Integer getCharacterLength(String userInputStringSize) {
        Integer stringLength = userInputStringSize.length();
        return stringLength;
    }
}

/*
Each exercise should be done on its own folder/class
Feel free to add as many classes as you want per exercise
All code/work should be done in at least 1 additional private method, called from the main function
sysout the description of each exercise

Description: find the number of characters in a string
Ask for user input
Sysout how many characters there are in that word
 */