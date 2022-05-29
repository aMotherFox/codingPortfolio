class Guest { 

    //attributes/properties
    //information/descriptions about object
    String firstName;
    String lastName;
    Integer age;
    Boolean isHungry;
    String favoriteColor;
    Boolean plushies;

    //creating a constructor aka method
    //not static or void

    public Guest() {
        //this constructor allows us to create an INSTANCE of the guest class
        //default constructor: takes 0 arguments and returns nothing- just an empty object
        //aka no args constructor
    }

    //creating all args constructor
    public Guest(String firstName, String lastName, Integer age, Boolean isHungry, String favoriteColor, Boolean plushies) { //taking in 3 arguments
        //NOT the same as the first Guest fields
        //must ASSIGN these arguments to the first Guest fields
        this.firstName = firstName; //this is the first Guest
        this.lastName = lastName;
        this.age = age;
        this.isHungry = isHungry;
        this.favoriteColor = favoriteColor;
        this.plushies = plushies;
    }

    // methods = actions
    // for an instance of Guest, we can call this action
    public void eat(String food) {
        System.out.println(this.firstName + " is eating: " + food);
    }

    public void hobby(String activity) {
        System.out.println(this.firstName + " likes to: " + activity);
    }

    public void pickle(Integer ownPickles) {
        System.out.println(this.firstName + " has: " + ownPickles + " pickles");
    }

    
}
