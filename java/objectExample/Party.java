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
        guest1.isHungry = true;
        System.out.println("guest1: " + guest1);
        System.out.println("This is my guest1 first name: " + guest1.firstName);
        System.out.println("This is my guest1 last name: " + guest1.lastName);
        System.out.println("Age: " + guest1.age);
        System.out.println("Is guest1 hungry: " + guest1.isHungry);
        guest1.eat("hamburger"); //calling and executing
        guest1.hobby("salsa dance");

        System.out.println("--------DEFAULT CONSTRUCTOR----------");
        Guest guest2 = new Guest(); //instanciating new guest with constructor of GUEST
        guest2.firstName = "Sasha";
        guest2.lastName = "Larson";
        guest2.age = 28;
        guest2.isHungry = true;
        System.out.println("guest2: " + guest2);
        System.out.println("guest2 first name: " +  guest2.firstName);
        System.out.println("guest2 last name: " +  guest2.lastName);
        System.out.println("guest2 age: " +  guest2.age);
        System.out.println("Is guest2 hungry: " + guest2.isHungry);
        guest2.eat("Acai");
        guest2.hobby("write and draw");

        System.out.println("--------ALL ARGS CONSTRUCTOR----------");
        Guest guest3 = new Guest("Victoria", "Portela", 26, true); //passing into args constructor on Guest.java
        System.out.println("guest3 first name: " +  guest3.firstName);
        System.out.println("guest3 last name: " +  guest3.lastName);
        System.out.println("guest3 age: " +  guest3.age);
        System.out.println("Is guest3 hungry: " + guest3.isHungry);
        guest3.eat("nothing... because she has homework to do");
        guest3.hobby("code");

        Guest guest4 = new Guest("Bucky", "Barnes", 3, true); //passing into args constructor on Guest.java
        System.out.println("guest4 first name: " +  guest4.firstName);
        System.out.println("guest4 last name: " +  guest4.lastName);
        System.out.println("guest4 age: " +  guest4.age);
        System.out.println("Is guest4 hungry: " + guest4.isHungry);
        guest4.eat("everything");
        guest4.hobby("play frisbee");

        Guest guest5 = new Guest("Felix", "Dandy", 31, false); //passing into args constructor on Guest.java
        System.out.println("guest5 first name: " +  guest5.firstName);
        System.out.println("guest5 last name: " +  guest5.lastName);
        System.out.println("guest5 age: " +  guest5.age);
        System.out.println("Is guest5 hungry: " + guest5.isHungry);
        guest5.eat("chicken wings");
        guest5.hobby("take photos");


        System.out.println("--------DEFAULT CONSTRUCTOR----------");
        Guest guest6 = new Guest(); //instanciating new guest with constructor of GUEST
        guest6.firstName = "Rocky";
        guest6.lastName = "Balboa";
        guest6.age = 7;
        guest6.isHungry = true;
        System.out.println("guest6: " + guest6);
        System.out.println("guest6 first name: " +  guest6.firstName);
        System.out.println("guest6 last name: " +  guest6.lastName);
        System.out.println("guest6 age: " +  guest6.age);
        System.out.println("Is guest6 hungry: " + guest6.isHungry);
        guest6.eat("hot dogs");
        guest6.hobby("hate Bucky");

        Guest guest7 = new Guest(); //instanciating new guest with constructor of GUEST
        guest7.firstName = "Hank";
        guest7.lastName = "Tank";
        guest7.age = 10;
        guest7.isHungry = true;
        System.out.println("guest7: " + guest7);
        System.out.println("guest7 first name: " +  guest7.firstName);
        System.out.println("guest7 last name: " +  guest7.lastName);
        System.out.println("guest7 age: " +  guest7.age);
        System.out.println("Is guest7 hungry: " + guest7.isHungry);
        guest7.eat("hot dogs");
        guest7.hobby("hate Rocky");


        System.out.println("--------LIST OF GUESTS----------");
        List<Guest> guests = List.of(guest1, guest2, guest3, guest4, guest5, guest6, guest7);
        guests.forEach(guest -> {
            System.out.println("the following guest has just walked in..." + guest.firstName + " " + guest.lastName );
        });

    }

}


// java object !== object oriented programming OOP

//FOR MONDAY: add at least another 5 fields to Guests and at least 3 more methods
//Create at least 10 instances of the objects and changing the values and doing lots of sysouts