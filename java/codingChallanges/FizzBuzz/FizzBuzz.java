package codingChallanges.FizzBuzz;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    
   public static void main(String[] args) {

    // System.out.println("hello from inside fizzbuzz");

    List<Integer> fizzBuzzNumbers = IntStream.rangeClosed(1, 100).boxed().toList();
    System.out.println("fizzBuzzNumbers: " + fizzBuzzNumbers);
  
    List<String> finalResult = fizzBuzz1(fizzBuzzNumbers);
    System.out.println("finalResult: " + finalResult);

    fizzBuzz2(fizzBuzzNumbers);
    
   }

   public static List<String> fizzBuzz1(List<Integer> numbers) {
    System.out.println("----- fizz buzz 1! ------");

       List<String> result = numbers.stream().map(number -> {
            if (number % 15 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) { 
                return "Fizz";
            } else if (number % 5 == 0) { 
                return "Buzz";
            } else {
                return number.toString();
            }
        }).collect(Collectors.toList());
       
        return result;

    } 

    public static void fizzBuzz2(List<Integer> numbers) {
        System.out.println("----- fizz buzz 2! ------");

        numbers.forEach(number -> {
             if (number % 15 == 0) {
                 System.out.println("FizzBuzz");
             } else if (number % 3 == 0) { 
                 System.out.println("FIZZ");
             } else if (number % 5 == 0) { 
                 System.out.println("BUZZ");
             } else {
                 System.out.println(number);
             }
         });
 
     } 
}