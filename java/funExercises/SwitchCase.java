import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {

        System.out.println("----------------CREATE PROGRAM THAT PERFORMS DIFFERENT ACTIONS DEPENDING ON INPUT----------------");
        //ask user for input (1, 2, or 3)
        //create switch statement that performs different actions depending on chosen input
        //1.) square root; ask user for number and sysout square root of number given
        //2.) date; sysout today's date
        //3.) tell a joke; create list of 10 jokes (strings) sysout random joke from the list
        //when user is done, ask for input again; select another input (3 options again) or stop the program

        switchingCases();
        //restartingOrEnding();
    }

    private static void switchingCases(){
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        System.out.println("Please pick 1, 2, or 3: ");
        Integer userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
            System.out.println("Pick a positive whole number: ");
            Integer userChoice1 = scanner.nextInt();
            //Math.sqrt returns the correctly rounded positive square root of a double value
            Double squareRoot = Math.sqrt(userChoice1); //function that takes in userChoice1 and applies sqrt method, assigns result to squareRoot
            System.out.println("The square root of: " + userChoice1 + " is: " + squareRoot);
            break; //stops the execution of more code
            case 2:
            System.out.println("Today's date is: ");
            //LocalDate
            LocalDate dateObj = LocalDate.now(); //LocalDate method returns current date from system clock in default time zone
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String date = dateObj.format(formatter); //format returns string with date formatted in given pattern yyyy-MM-dd
            System.out.println(date);
            break;
            case 3:
            ArrayList<String> jokeList = new ArrayList<String>();
            jokeList.add("Why can't PC gamers use Uber? Too many incompatible drivers.");
            jokeList.add("What does the gamer use to make bread? Nintendough");
            jokeList.add("What's the favorite console of the French? Wii");
            jokeList.add("What did the movie critic say about the Minecraft movie? It's a blockbuster");
            jokeList.add("Why is French Mario so good at predicting the future? He uses a L'ouiji board");
            jokeList.add("Why are garbage men the best gaming teammates? They're used to carrying trash");
            jokeList.add("Why can't you ask a Nintendo fan to help change the light bulb? Because they just keep playing with the switch");
            jokeList.add("I tried to go to a bar in Minecraft. They said they don't serve miners");
            jokeList.add("Why did the gamer get a headache at the art museum? Too many frames");
            jokeList.add("What's the difference between a slug and a gamer? When a slug gets salty it dies. When a gamer dies it gets salty.");

            Integer index = new Random().nextInt(jokeList.size());
            String value = jokeList.get(index);
            System.out.println(value);

            System.out.println("If you would like to restart, enter 1, if you would like to end game, enter 2 ");
            Integer endGameInput = scanner.nextInt();
                if (endGameInput == 1){
            switchingCases();
                } else {
            System.exit(1);
            }
        }

    }
    // private static void restartingOrEnding(){
    //     Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

    //    dd
    //     Integer endGameInput = scanner.nextInt();
    //     if (endGameInput == 1){
    //         switchingCases();
    //     } else {
    //         System.exit(1);
    //     }
    // } //does not let you keep looping??
}

/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/