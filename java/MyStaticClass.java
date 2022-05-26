import java.util.List;

public class MyStaticClass {

    public static void printFavoriteColor() {
        System.out.println("My Favorite color is: Black");
    }

    public static void caluclateTotal(Integer subtotal, Integer tip, Double taxPercentage) {
        Integer preTax = subtotal + tip;
        Double postTax = preTax * taxPercentage;
        Double result = preTax + postTax;
        System.out.println("Result" + result);
    }

    public static Boolean areNamesSameLength(List<String> names) {
        //iterate and check each length
        //if any don't match length, is false
        Integer previousNameLength = names.get(0).length();
        for (String name : names){
            System.out.println("name: " + name);
            
            System.out.println("previousNameLength: " + previousNameLength);
            if (name.length() != previousNameLength){
                return false;
            }
        }
        
        return true;
    }

}

//if you execute without main class it won't do anything
//class needs main method/function
//one class per file
//main is only one that gets executed when you run file
// functions are resuable code

//when you execute java class it looks for main method

// you only need to compile from the main file 