import java.util.List;

public class ClassesAndFunctions {
    public static void main(String[] args) {
        System.out.println("Hello from Main in Class And Functions");
        sayHello(); //calling method
        sayHelloTo("Emre"); //calling second and passing in here
        sayHelloTo("Victoria");
        String color = getColor();

        System.out.println("color: " + color);

        Integer emre = calculateTotal(20, 3); //calling method, passing in 20 and 3
        System.out.println("Total is: " + emre);
    
        Integer result = calculateTotal(10, 3);
        System.out.println("Total is: " + result);

        System.out.println("------calling MyStaticClass--------");
        MyStaticClass.printFavoriteColor();

        MyStaticClass.caluclateTotal(45, 5, .05);

        List<String> ourNames = List.of("Bucky", "Rocky", "Hanki");
        Boolean result2 = MyStaticClass.areNamesSameLength(ourNames);
        System.out.println("Is true? " + result2);

    }

    public static void sayHello() {
        System.out.println("Hello from sayHello!");
    }

    public static void sayHelloTo(String name) { //function definition
        System.out.println("Say hello to: " + name);
        
    }

    public static Integer calculateTotal(Integer subtotal, Integer tip) {
        Integer result = subtotal + tip;
        return result;
    }

    public static String getColor() {
        return "red";
    }
}


//work on grading scale IN METHODS/FUNCTIONS