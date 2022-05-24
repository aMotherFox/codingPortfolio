// everything in Java MUST be inside a class
// javac dataTypes.java 
// java (class name without .class)

class DataTypes{

    //understand what all these words in the java method mean
    //figure out how to create and system.out all the main data types; string, number, boolean, null, undefined, array, objects

    public static void main(String[] args) {
        System.out.println("Hello World");
    }



}


/*
public: access specifier, means you can call this method from outside the class you currently are in aka accessed publically aka accessible by any class

static: access modifier(we can call this method directly using a class name without making an object of it), keyword that identifies class-related things

void: type of return (does not return any value)

main: just the name of the method/function, this name is fixed

strings args: used to pass the command line argument to the main method
*/


//BOOLEAN
class Main {
    public static void main(String[] args) {
          
      boolean Bucky = true;
      System.out.println(Bucky);    // prints true
    }
  }




//NUMBER
//byte = -128 to 127, short = -32,768 to 32,767, long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

  class Main2 {
    public static void main(String[] args) {
    	
    	byte num;
    	
    	num = 113;
    	System.out.println(num);
    }
}

class Main3 {
    public static void main(String[] args) {
    	
    	short num;
    	
    	num = 150;
    	System.out.println(num);
    }
}

class Main4 {
    public static void main(String[] args) {
    	
    	long num = -12332252626L; //error when removing L
    	System.out.println(num);
    }
}

//STRING
//char is just a single letter

class Main5 {
    public static void main(String[] args) {
    	
    	char dog = 'B';
    	System.out.println(dog);
    }
}

class Main6 {
    public static void main(String[] args) {
    	
    	String str = "Bucky";
    	System.out.println(str);
    }
}


//NULL
//void is a type, null is a value in java (void = empty, null = nothing)
//null can be assigned to an object, but not stand alone
//The compiler is unable to unbox null objects. It throws a NullPointerException.

class Cla {
    int prop;
    int mtthd() {
        return prop;
    }
}

class Main7 {

    public static void main(String[] args) {  
        Cla obj1 = new Cla();
        Cla obj2 = null;

        }  
    }


// UNDEFINED
//does not exist in java?? null object is used instead

// ARRAY
//in java, arrays are objects
