JAVA OBJECTS:

YOU CAN HAVE MULTIPLE OBJECTS IN ONE CLASS
Objects are a member/instance of a class; ojects have ids, states, and behaviors
State of an object is store in fields (variables), while methods/functions display the object's behavior
State: stored fields in an object (i.e. you have a basket of 5 fruits)
Behavior: an object's behavior is exposed when methods execute (i.e. 'eating' is a behavior that will change your basket to 4 fruits)

Object oriented programming is taking real objects and putting it into code:
You can bind/encapsulate 
    - ANIMAL is a class, DOG is it's object
        * id
        * states: breed, size, color
        * behavior: bark, eat, wag tail

public class Animal {
    public static void main(String[] args) {
        dog state = new dog();
        state.breed = "German Shepherd";
        state.size = "large";
        state.color = "brown";

        System.out.println("Breed: " + state.breed + "Size: " + state.size + "Color: " + state.color);
    }
}


THREE STEPS TO CREATING A JAVA OBJECT:
    -Declaration of object (naming object)
    -Instantiation of object (allocated memory space for the object in the code)
    -Initialization of object (process of assigning intial values to the object)
An object is created using the keyword 'new'




CONSTRUCTORS:
Object Oriented Programming NEEDS constructors
in Java, a constructor is a SPECIAL METHOD used to instanciate objects. The constructor is called when an object of a class is created
    * can be used to set intial values for object attributes
Constructors are similar to void in that they cannot return; must match name of the class or will not work



SETTERS AND GETTERS: 
For each instance variable, a getter method returns its value while a setter method sets/updates its value
Getters and Setters allow you to control how important variables are accessed and updated in your code

public class Vehicle {
  private String color;

  // Getter
  public String getColor() {
    return color;
  }

  // Setter
  public void setColor(String c) {
    this.color = c;
  }
}

Once the getter and setter have been defined, we use it in our main

public static void main(String[] args) {
  Vehicle v1 = new Vehicle();
  v1.setColor("Red");
  System.out.println(v1.getColor());
}

// Outputs "Red"