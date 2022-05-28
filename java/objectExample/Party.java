import java.util.List;

public class Party {
    
    public static void main(String[] args) {
        System.out.println("LETS PARTY");

        //to get an INSTANCE of a class, you must INSTANCIATE it
        //must instanciate the class  to get an instance (object) of it
        //new, constructor (guest)
        //Guest is the datatype
        System.out.println("--------DEFAULT CONSTRUCTOR----------");
        Guest guest1 = new Guest(); //instanciating our constructor
        guest1.firstName = "Lucas";
        guest1.lastName = "Costa";
        guest1.age = 28;
        System.out.println("guest1: " + guest1);
        System.out.println("This is my guest1 first name: " + guest1.firstName);
        System.out.println("This is my guest1 last name: " + guest1.lastName);
        System.out.println("Age: " + guest1.age);
        guest1.eat("hamburger"); //calling and executing

        System.out.println("--------DEFAULT CONSTRUCTOR----------");
        Guest guest2 = new Guest(); //instanciating new guest with constructor of GUEST
        guest2.firstName = "Sasha";
        guest2.lastName = "Larson";
        System.out.println("guest2: " + guest2);
        System.out.println("guest2 first name: " +  guest2.firstName);
        System.out.println("guest2 last name: " +  guest2.lastName);
        System.out.println("guest2 age: " +  guest2.age);
        guest2.eat("Acai");

        System.out.println("--------ALL ARGS CONSTRUCTOR----------");
        Guest guest3 = new Guest("Victoria", "Portela", 26); //passing into args constructor on Guest.java
        System.out.println("guest3 first name: " +  guest3.firstName);
        System.out.println("guest3 last name: " +  guest3.lastName);
        System.out.println("guest3 age: " +  guest3.age);
        guest3.eat("nothing... because she has homework to do");

        System.out.println("--------LIST OF GUESTS----------");
        List<Guest> guests = List.of(guest1, guest2, guest3);
        guests.forEach(guest -> {
            System.out.println("the following guest has just walked in..." + guest.firstName + " " + guest.lastName );
        });

    }

}


// java object !== object oriented programming OOP

//FOR MONDAY: add at least another 5 fields to Guests and at least 3 more methods
//Create at least 10 instances of the objects and changing the values and doing lots of sysouts