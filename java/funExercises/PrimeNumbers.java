public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println("----------------ARRAY OF PRIME NUMBERS AND NON-PRIME NUMBERS----------------");
        //list of numbers 1-100
        //sysout all prime numbers
        //REMOVE prime numbers from array
        //sysout remaining numbers
        
        gettingAndRemovingPrimeNumbers();
    }
    private static void gettingAndRemovingPrimeNumbers(){
        Integer i = 0; //increment
        Integer num = 0;
        String primeNumbers = " ";
        String notPrimeNumbers = " ";
        for (i = 1; i <= 100; i++){ //i++ increments number after the expression is evaluated
          int counter=0;
          for(num =i; num>=1; num--){
             if(i%num==0){
                counter = counter + 1;
            }
          }
            if (counter ==2){
         //appending prime number to string
            primeNumbers = primeNumbers + i + " ";
            } else {
                notPrimeNumbers = notPrimeNumbers + i + " ";
            }
        }
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
       System.out.println("Nonprime numbers from 1 to 100 are :");
       System.out.println(notPrimeNumbers);
    }
    
}

/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/