import java.util.ArrayList;
import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("----------------SHOW 25 FIRST FIBONACCI NUMBERS----------------");
        //create arrayList with 2 integers; 0 and 1
        //create program that adds the next 23 fibonacci numbers to that arrayList
        //sysout updated list size (25) and the actual list

        gettingFibonacciNumbers();
    }

    private static void gettingFibonacciNumbers(){
        // ArrayList<Integer> numberList = new ArrayList<Integer>();
        // Integer endNumber = 25;
        // Integer firstNum = 0;
        // Integer secondNum = 1;

        // for(Integer i = 1; 1 <= endNumber; i++){
        //     numberList.add(firstNum);
        //     Integer newNum = firstNum + secondNum;
        //     firstNum = secondNum;
        //     secondNum = newNum;
        // }
        // Integer size = numberList.size();
        
        // System.out.println("Fibonacci up to 25: " + numberList);
        // System.out.println("List length: " + size);
        int i = 1, n = 25, firstNum = 0, secondNum = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
        // System.out.print(firstNum + ", ");

        Integer newNum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = newNum;

        i++;

        //List<Integer> numberList = Arrays.stream(firstNum).boxed()collect(Collectors.toList());
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(firstNum); //making each it's own array TODO: MAKE INTO ONE ARRAY SO I CAN .SIZE
        System.out.print(numberList);
        }
  
    }
}
