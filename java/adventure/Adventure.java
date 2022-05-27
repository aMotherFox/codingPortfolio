import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {

        //new = instanciate
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        System.out.print("what is your name?");
        String userInput = scanner.nextLine(); //asks for the user input
        System.out.println("Hello, " + userInput);

        System.out.print("Please pick either 1, 2, or 3");
        Integer userNumberPick = scanner.nextInt();
        System.out.println("User picked: " + userNumberPick);
        if (userNumberPick == 3) {
            System.out.println(">>>>you DIED");
            System.exit(1);
        }

        System.out.print("Are you hungry?");
        Boolean isHungry = scanner.nextBoolean();
        System.out.println("Hunger status:" + isHungry);
    }

    private static void something() {

    }
}

/*
RPG challenge
Requirements:
1.) User must pick at least 1;
    - string
    - number
    - boolean

2.) Program must use at least 1 list/array
    -i.e. combine all numbers, combine strings

3.)At least 10 stages

4.) AT LEAST 
    - 1 private static method
    - 2 public static methods FROM ANOTHER CLASS

5.) Have at least 2 ways the user can stop the program earlier than intended (System.exit)
*/