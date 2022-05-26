import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// everything in Java MUST be inside a class and method
// "public" is an access modifier used for classes, attributes, methods, and constructors maing them accessible by any other class
// javac MathNum.java 
// java (class name without .class)

public class MathNum{

    //understand what all these words in the java method mean
    //figure out how to create and system.out all the main data types; string, number, boolean, null, undefined, array, objects
    //largest and smallest
    //add, subtract, multiple, divide

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 5, 1, 10, 8, 7, 34, 20, 0, -5, 2);
        //array of integers
        System.out.println("Args: %s".formatted(args.toString()));

        System.out.println("Args: %s".formatted(numbers));

        Integer largest = Integer.MIN_VALUE; 
        Integer smallest = Integer.MAX_VALUE;
        for (Integer number : numbers){
            if(number>largest){ //number is taking each element in the array
                largest=number;
            }else if(number<smallest){
                smallest=number;
            }
        }

        System.out.println("Largest number in an array: %s".formatted(largest));
        System.out.println("Smallest number in an array: %s".formatted(smallest));

         //Lucas example
        Integer minNumber = Collections.min(numbers);
        Integer maxNumber = Collections.max(numbers);
        System.out.println("Min num: %s".formatted(minNumber));
        System.out.println("Max num: %s".formatted(maxNumber));
        //Lucas example

        Integer firstNumber = numbers[0];
        Integer sum = 0;
        Integer subtraction = 0;
        Integer multiply = 0;
        Integer divide = 0;

        for (Integer number : numbers) {
            sum = sum + number;
        }

    }



}