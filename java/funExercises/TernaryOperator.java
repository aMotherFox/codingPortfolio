import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        System.out.println("----------------FIND BIGGEST NUMBER OF 2 USING TERNARY----------------");
        //ask user for 2 inputs
        //do not use if statement

        gettingTernaryOperator();
    }

    private static void gettingTernaryOperator(){
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        System.out.println("Please input a number: ");
        Integer userInput = scanner.nextInt();

        System.out.println("Please input a different number: ");
        Integer userInput2 = scanner.nextInt();

        System.out.println("You first number is: " + userInput + " , and your second number is: " + userInput2);
        Integer largestNumber = userInput > userInput2 ? userInput : userInput2;

        System.out.println("The larger number is: " + largestNumber);
    }
    
}


/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/