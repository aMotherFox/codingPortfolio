package codingChallanges;
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
     List<Integer> numbers2 = List.of(1,2,3);
        
        // System.out.println(numbers2); <----- wont print a number from ^^^^ line 52
        //its because you instantiated an object, so when you sout an object it will give you the location
        //of that object on your computer, it wont actually print out the field. 
        //but if you try to sout numbers2[index] 
        System.out.println("numbers2: %s".formatted(numbers2));

        Integer firstNumber = numbers2.get(0); //<------- this is how you get the first index of the array when you have a List<Integer> !!!!!!!!!!
        Integer sum = 0;
        Integer subtraction = 0;
        Integer multiplication = 0;
        Integer division = 0;

        for (Integer number : numbers2) { 
            sum = sum + number;

            if (firstNumber == number) {
                subtraction = number;
                multiplication = number;
                division = number;
            } else {
                subtraction = subtraction - number;
                multiplication = multiplication * number;
                division = division / number;
            }
        }
        System.out.println("sum " + sum);
        System.out.println("subtraction " + subtraction);
        System.out.println("multiplication " + multiplication);
        System.out.println("division " + division);

        

    }



}