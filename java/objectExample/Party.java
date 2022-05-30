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
        guest1.favoriteColor = "red";
        guest1.plushies = true;
        System.out.println("guest1: " + guest1);
        System.out.println("This is my guest1 first name: " + guest1.firstName);
        System.out.println("This is my guest1 last name: " + guest1.lastName);
        System.out.println("Age: " + guest1.age);
        System.out.println("Is guest1 hungry: " + guest1.isHungry);
        System.out.println("favorite color: " + guest1.favoriteColor);
        //System.out.println("does guest1 have plushies: " + guest1.plushies);
        guest1.eat("hamburger"); //calling and executing
        guest1.hobby("salsa dance");
        guest1.pickle(5);


        System.out.println("--------DEFAULT CONSTRUCTOR----------");
        Guest guest2 = new Guest(); //instanciating new guest with constructor of GUEST
        guest2.firstName = "Sasha";
        guest2.lastName = "Larson";
        guest2.age = 28;
        guest2.isHungry = true;
        guest2.favoriteColor = "green";
        guest2.plushies = true;
        System.out.println("guest2: " + guest2);
        System.out.println("guest2 first name: " +  guest2.firstName);
        System.out.println("guest2 last name: " +  guest2.lastName);
        System.out.println("guest2 age: " +  guest2.age);
        System.out.println("Is guest2 hungry: " + guest2.isHungry);
        System.out.println("favorite color: " + guest2.favoriteColor);
        //System.out.println("does guest2 have plushies: " + guest2.plushies);
        guest2.eat("Acai");
        guest2.hobby("write and draw");
        guest2.pickle(5);

        System.out.println("--------ALL ARGS CONSTRUCTOR----------");
        Guest guest3 = new Guest("Victoria", "Portela", 26, true, "pink", true); //passing into args constructor on Guest.java
        System.out.println("guest3 first name: " +  guest3.firstName);
        System.out.println("guest3 last name: " +  guest3.lastName);
        System.out.println("guest3 age: " +  guest3.age);
        System.out.println("Is guest3 hungry: " + guest3.isHungry);
        System.out.println("favorite color: " + guest3.favoriteColor);
        //System.out.println("does guest3 have plushies: " + guest3.plushies);
        guest3.eat("nothing... because she has homework to do");
        guest3.hobby("code");
        guest3.pickle(5);

        Guest guest4 = new Guest("Bucky", "Barnes", 3, true, "blue", true); //passing into args constructor on Guest.java
        System.out.println("guest4 first name: " +  guest4.firstName);
        System.out.println("guest4 last name: " +  guest4.lastName);
        System.out.println("guest4 age: " +  guest4.age);
        System.out.println("Is guest4 hungry: " + guest4.isHungry);
        System.out.println("favorite color: " + guest4.favoriteColor);
        //System.out.println("does guest4 have plushies: " + guest4.plushies);
        guest4.eat("everything");
        guest4.hobby("play frisbee");
        guest4.pickle(7);

        Guest guest5 = new Guest("Felix", "Dandy", 31, false, "purple", false); //passing into args constructor on Guest.java
        System.out.println("guest5 first name: " +  guest5.firstName);
        System.out.println("guest5 last name: " +  guest5.lastName);
        System.out.println("guest5 age: " +  guest5.age);
        System.out.println("Is guest5 hungry: " + guest5.isHungry);
        System.out.println("favorite color: " + guest5.favoriteColor);
        //System.out.println("does guest5 have plushies: " + guest5.plushies);
        guest5.eat("chicken wings");
        guest5.hobby("take photos");
        guest5.pickle(9);


        System.out.println("--------DEFAULT CONSTRUCTOR----------");
        Guest guest6 = new Guest(); //instanciating new guest with constructor of GUEST
        guest6.firstName = "Rocky";
        guest6.lastName = "Balboa";
        guest6.age = 7;
        guest6.isHungry = true;
        guest6.favoriteColor = "purple";
        guest6.plushies = false;
        System.out.println("guest6: " + guest6);
        System.out.println("guest6 first name: " +  guest6.firstName);
        System.out.println("guest6 last name: " +  guest6.lastName);
        System.out.println("guest6 age: " +  guest6.age);
        System.out.println("Is guest6 hungry: " + guest6.isHungry);
        System.out.println("favorite color: " + guest6.favoriteColor);
        //System.out.println("does guest6 have plushies: " + guest6.plushies);
        guest6.eat("hot dogs");
        guest6.hobby("hate Bucky");
        guest6.pickle(12);

        Guest guest7 = new Guest(); //instanciating new guest with constructor of GUEST
        guest7.firstName = "Hank";
        guest7.lastName = "Tank";
        guest7.age = 10;
        guest7.isHungry = true;
        guest7.favoriteColor = "blue";
        guest7.plushies = true;
        System.out.println("guest7: " + guest7);
        System.out.println("guest7 first name: " +  guest7.firstName);
        System.out.println("guest7 last name: " +  guest7.lastName);
        System.out.println("guest7 age: " +  guest7.age);
        System.out.println("Is guest7 hungry: " + guest7.isHungry);
        System.out.println("favorite color: " + guest7.favoriteColor);
        //System.out.println("does guest7 have plushies: " + guest7.plushies);
        guest7.eat("hot dogs");
        guest7.hobby("hate Rocky");
        guest7.pickle(100);

        Guest guest8 = new Guest(); //instanciating new guest with constructor of GUEST
        guest8.firstName = "Nieve";
        guest8.lastName = "Portela";
        guest8.age = 1;
        guest8.isHungry = true;
        guest8.favoriteColor = "white";
        guest8.plushies = true;
        System.out.println("guest8: " + guest8);
        System.out.println("guest8 first name: " +  guest8.firstName);
        System.out.println("guest8 last name: " +  guest8.lastName);
        System.out.println("guest8 age: " +  guest8.age);
        System.out.println("Is guest8 hungry: " + guest8.isHungry);
        System.out.println("favorite color: " + guest8.favoriteColor);
        //System.out.println("does guest8 have plushies: " + guest8.plushies);
        guest8.eat("bugs");
        guest8.hobby("pee outside litterbox");
        guest8.pickle(1000);

        Guest guest9 = new Guest(); //instanciating new guest with constructor of GUEST
        guest9.firstName = "Anya";
        guest9.lastName = "Forger";
        guest9.age = 4;
        guest9.isHungry = true;
        guest9.favoriteColor = "pink";
        guest9.plushies = true;
        System.out.println("guest9: " + guest9);
        System.out.println("guest9 first name: " +  guest9.firstName);
        System.out.println("guest9 last name: " +  guest9.lastName);
        System.out.println("guest9 age: " +  guest9.age);
        System.out.println("Is guest9 hungry: " + guest9.isHungry);
        System.out.println("favorite color: " + guest9.favoriteColor);
        //System.out.println("does guest9 have plushies: " + guest9.plushies);
        guest9.eat("peanuts");
        guest9.hobby("watching TV");
        guest9.pickle(4);

        Guest guest10 = new Guest(); //instanciating new guest with constructor of GUEST
        guest10.firstName = "Yor";
        guest10.lastName = "Forger";
        guest10.age = 28;
        guest10.isHungry = false;
        guest10.favoriteColor = "red";
        guest10.plushies = true;
        System.out.println("guest10: " + guest10);
        System.out.println("guest10 first name: " +  guest10.firstName);
        System.out.println("guest10 last name: " +  guest10.lastName);
        System.out.println("guest10 age: " +  guest10.age);
        System.out.println("Is guest10 hungry: " + guest10.isHungry);
        System.out.println("favorite color: " + guest10.favoriteColor);
        //System.out.println("does guest10 have plushies: " + guest10.plushies);
        guest10.eat("noodles");
        guest10.hobby("doing hair");
        guest10.pickle(1);


        System.out.println("--------LIST OF GUESTS----------");
        List<Guest> guests = List.of(guest1, guest2, guest3, guest4, guest5, guest6, guest7, guest8, guest9);
        guests.forEach(guest -> {
            System.out.println("the following guest has just walked in..." + guest.firstName + " " + guest.lastName );
        });

        List<Guest> boys = List.of(guest1, guest4, guest5, guest6, guest7);
        boys.forEach(boy -> {
            System.out.println("a boy..." + boy.firstName + " " + boy.lastName );
        });

        List<Guest> girls = List.of(guest2, guest3, guest8, guest9);
        girls.forEach(girl -> {
            System.out.println("a girl..." + girl.firstName + " " + girl.lastName );
        });

        List<Guest> plushOwners = List.of(guest1, guest2, guest3, guest4, guest5, guest6, guest7, guest8, guest9);
        plushOwners.forEach(owner -> {
            if ( owner.plushies == true){
            System.out.println("the following guest has plushies..." + owner.firstName + " " + owner.lastName );
            }
        });

    }

}


// java object !== object oriented programming OOP

//FOR MONDAY: add at least another 5 fields to Guests and at least 3 more methods
//Create at least 10 instances of the objects and changing the values and doing lots of sysouts