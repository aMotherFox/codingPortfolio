import java.util.Scanner;

public class InterestRateCalculator {
    public static void main(String[] args) {
        System.out.println("----------------PROGRAM TO FIGURE OUT TOTAL INTEREST ON $ PRINCIPAL AMOUNT----------------");
        // interest calculator: (total interest = principalInterest rate percentageYears)
        //3 inputs: loan principal amount, interest rate percentage, years for the loan

        gettingInterestRate();
    }

    private static void gettingInterestRate(){
        Scanner scanner = new Scanner(System.in); //instanciating a Scanner object

        System.out.println("Please input the principle: ");
        Double userPrincipal = scanner.nextDouble();

        System.out.println("Please input the interest rate: ");
        Double userInterestRate = scanner.nextDouble();

        System.out.println("Please input the years of the loan: ");
        Double userYearDuration = scanner.nextDouble();

        System.out.println("Your principle is: " + userPrincipal + ", your interest rate is: " + userInterestRate + ", your duration is: " + userYearDuration + " years");
        
        // simple interest = (principal x rate x years)/100

        Double totalInterest = (userPrincipal * userInterestRate * userYearDuration) / 100;
        System.out.println("Your total interest is: " + totalInterest);
    }
}

/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/