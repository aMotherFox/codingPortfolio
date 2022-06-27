public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        System.out.println("----------------SUM OF ALL NUMBERS----------------");
        //list of numbers 1-100
        //sum of all even numbers, sum of all off numbers
        
        gettingSumOfNumbers();
    }

    private static void gettingSumOfNumbers(){

        Integer evenSum = 0;
        for(Integer i = 1; i <= 100; i++){
            if(i % 2 == 0) {
                evenSum += i; 
            }
        }

        Integer oddSum = 0;
        for(Integer i = 1; i <= 100; i++){
            if(i % 2 != 0) {
                oddSum += i; 
            }
        }
        System.out.println("All the even numbers sum: " + evenSum);
        System.out.println("All the odd numbers sum: " + oddSum);
    }   
}

/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/