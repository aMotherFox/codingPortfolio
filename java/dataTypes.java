import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



// everything in Java MUST be inside a class and method
// javac dataTypes.java 
// java (class name without .class)
// "public" is an access modifier used for classes, attributes, methods, and constructors maing them accessible by any other class

class DataTypes{

    //understand what all these words in the java method mean
    //figure out how to create and system.out all the main data types; string, number, boolean, null, undefined, array, objects

    public static void main(String[] args) {
        System.out.println("Args: %s".formatted(args.toString()));

        String dogName = "Bucky";
        System.out.println("dogName: %s".formatted(dogName));

        System.out.println("-----------------------STRING----------------------------------");

        Integer number = 25;
        System.out.println("number: %s".formatted(number));

        Number number2 = 22;
        System.out.println("number2: %s".formatted(number2));

        BigDecimal myBigDecimal = new BigDecimal(10.2324);
        System.out.println("myBigDecimal: %s".formatted(myBigDecimal));

        Float myFloatNumber = 99.99f;
        System.out.println("myFloatNumber: %s".formatted(myFloatNumber));

        Double myDoubleNumber = 88.8888;
        System.out.println("myDoubleNumber: %s".formatted(myDoubleNumber));

        System.out.println("-----------------------NUMBERS----------------------------------");

        Boolean isHappy = true;
        System.out.println("isHappy: %s".formatted(isHappy));

        System.out.println("-----------------------BOOLEAN----------------------------------");

        String myNull = null; //anything in java is nullable, you can assign null to anything*
        System.out.println("myNull: %s".formatted(myNull));
        Boolean myNullBoolean = null;
        System.out.println("myNullBoolean: %s".formatted(myNullBoolean));

        System.out.println("-----------------------NULL----------------------------------");

        ArrayList <String> myArrayList = new ArrayList<>(); //an array without a specific size
        myArrayList.add("Bucky");
        myArrayList.add("Rocky");
        myArrayList.add("Hank");
        Collections.addAll(myArrayList, "dogs", "cats", "pokemon");
        System.out.println("myArrayList: %s".formatted(myArrayList));

        String[] cars = {"Volvo", "BMW", "Honda"};
        System.out.println(cars[0]);

        List<String> myList = List.of("mango", "pineapple", "raspberry");
        System.out.println("myList: %s".formatted(myList));

        System.out.println("-----------------------LISTS AND ARRAYS----------------------------------");

        System.out.println("----STATIC FUNCTION----");
        tellMeAJoke();

        Integer result1 = addNumbers(1, 2);
        System.out.println("result1: %s".formatted(result1));
        Integer result2 = addNumbers(500, 27);
        System.out.println("result2: %s".formatted(result2));


    }
    //STATIC FUNCTION
    public static void tellMeAJoke() {
        System.out.println("-----------------------METHOD----------------------------------");
        System.out.println("Sniffing Feet");
    }

    public static Integer addNumbers(Integer firstNumber, Integer secondNumber) {
        Integer result = firstNumber + secondNumber;
        return result;
    }

}


/*
public: access specifier, means you can call this method from outside the class you currently are in aka accessed publically aka accessible by any class
^you will be able to call the method from a different file

static: access modifier(we can call this method directly using a class name without making an object of it), keyword that identifies class-related things
(makes method accessible without instansiating a class)

void: type of return (does not return any value)

main: just the name of the method/function, this name is fixed, will not work if you change it; it the entry point for a class so when you execute a class it is SPECIFICALLY looking for mina and will be the first thing to execute

strings args: used to pass the command line argument to the main method (arugments that are specified after the name of the program in the system's command line)
works just like function where you pass things out, args is the name of the varible, string[] is the data type of the method

method is a function inside a class
*/


//BOOLEAN


//NUMBER
//byte = -128 to 127, short = -32,768 to 32,767, long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//numbers vs integers; integers do not allow decimals


//STRING
//char is just a single letter


//NULL
//void is a type, null is a value in java (void = empty, null = nothing)
//null can be assigned to an object, but not stand alone
//The compiler is unable to unbox null objects. It throws a NullPointerException.



// UNDEFINED
//does not exist in java?? null object is used instead

// ARRAY
//in java, arrays are objects
