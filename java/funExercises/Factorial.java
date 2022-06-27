import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("----------------PROGRAM THAT COMPUTES FACTORAL VALUE OF INPUTED NUMBER----------------");

        factorialNumber();
    }

    private static void factorialNumber() {
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object
        System.out.println("Enter a positive whole nuber: ");
        Integer userInput = scanner.nextInt();
        Integer i=1, fact=1;
        while(i<=userInput){ //loop to calculate factoral
            fact = fact*i; //update factoal in each iteration
            i++;
        }
        System.out.println("The nunber's factoral is: " + fact);
    }
    
}

/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/