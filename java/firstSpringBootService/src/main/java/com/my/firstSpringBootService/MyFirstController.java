package com.my.firstSpringBootService;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//browser is only calling the API
//the server is running and to make any changes, you have to restart
//browser is caller, server and reciever
//an API call is like a letter you are sending to someone: address is URL, must clarify is sending or getting information (getting = requesting info in your letter, setting = sending a package
//body is all the contents you can add to your API

@RestController
public class MyFirstController {
    //controller is a term meaning the guy in control of the API
    @GetMapping("/") //the slash is the path we are calling to get to the API
    //endpoint AKA API
    public void sayHelloWorld() {
        System.out.println("Hello world from my first controller");
        //going to use an API to show this
        //first need to make myFirstController so that spring is aware it's a controller
        //@RestController ^
        //now make is usable with @GetMapping
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        System.out.println("This is the /hello api");
        return "Hello world from getHelloWorld()";
    }

    @GetMapping("/this-is-my-awesome/url/that-i-/made-up/in-2022")
    public String crazyAPI() {
        System.out.println("The crazy API was called");
        return "Ain't this something";
    }

    @PostMapping("/cookie")
    //endpoint's purpose is NOT to put out stuff for you to see on the browser;
    //the purpose is to handle/manipulate data and return you that data
    //the job to show you the stuff is the front end, not the back end
    //the browser will ALWAYS be making get requests; it will never do head, post, delete, etc on its own
    //we cannot (easily) make post requests from the browser
    //frontend would call the endpoint, take the data, do something with it, and then show something on the browser
    //one of the tools you can use is Postman
    public void createCookie() {
        System.out.println("I want a cookie");
    }


    //-----------------POSTMAN HOMEWORK-----------------

    //--------------------GET API----------------------
    @GetMapping("/bucky") //string
    public String getBuckyInfo() {
        System.out.println("Bucky is a darling little angel babyman");
        return "bucky from getBuckyInfo()";
    }

    @GetMapping("/rocky") //string
    public String getRockyInfo() {
        System.out.println("Rocky is an evil, smelly, stupid misogynist");
        return "rocky from getRockyInfo()";
    }

    @GetMapping("/hank") //string
    public String getHankInfo() {
        System.out.println("Hank went far away to live on a farm");
        return "hank from getHankInfo()";
    }

    @GetMapping("/puppies") //string
    public String namingPuppies() {
        String germanShep = "Chief";
        String dalmatian = "Spot";
        String golden = "Buddy";
        String doberman = "Spike";
        String puppies = germanShep + dalmatian + golden + doberman;
        System.out.println("Dogs: " + germanShep + dalmatian + golden + doberman);
        return puppies;
    }

    @GetMapping("/lunch") //list
    public List<String> getLunchOrder() {

        System.out.println("This is our lunch: ");
        List<String> Lunch = Arrays.asList("Cuban sandwich", "Raspberry lemonade", "Chocolate covered strawberries");
        return Lunch;
    }

    @GetMapping("/pets") //integer
    public Integer getPetNumber() {
        Integer myPets = 2;
        Integer yourPets = 1;
        Integer totalPets = myPets + yourPets;
        System.out.println("The total number of pets: " + totalPets);
        return totalPets;
    }

    @GetMapping("/fruits") //integer
    public Integer getFruits() {
        Integer strawberries = 5;
        Integer pineapples = 1;
        Integer kiwis = 3;
        Integer cherries = 15;
        Integer totalFruits = strawberries + pineapples + kiwis + cherries;
        System.out.println("How much fruit do we have: " + totalFruits + "pieces");
        System.out.println("Strawberries: " + strawberries + " Pineapples: " + pineapples + " Kiwis: " + kiwis + " Cherries: " + cherries );
        return totalFruits;
    }

    @GetMapping("/hunger") //boolean
    public Boolean getHungerStatus() {
        System.out.println("The pets says they are hungry. Is that true?");
        String buckyHunger = "yes";
        String rockyHunger = "yes";
        if (buckyHunger == rockyHunger){
            return true;
        } else {
            return false;
        }
    }


    @GetMapping("/myCarObject") //object
    public Car getCarObject() {
        System.out.println("This is a car object: ");
        return new Car("Civic", "Honda", 2013, "Silver", 4);
    }

    @GetMapping("/myCarListGet") //object
    public List<Car> getCarList() {
        System.out.println("This is a list of car object: ");
        return Arrays.asList(
                new Car("Civic", "Honda", 2013, "Silver", 4),
                new Car("Tundra", "Toyota", 2004, "Red", 2),
                new Car("Focus", "Ford", 2019, "Black", 2)
        );
    }


    @GetMapping("/myCarListPost") //object
    public List<Car> postCarList() {
        System.out.println("This is a list of car object: ");
        return Arrays.asList(
                new Car("Civic", "Honda", 2013, "Silver", 4),
                new Car("Tundra", "Toyota", 2004, "Red", 2),
                new Car("Focus", "Ford", 2019, "Black", 2)
        );
    }

    //--------@PathVariable--------------

    @GetMapping("/users/{name}/{age}/{location}")
    public String printUserInfo(@PathVariable String name, @PathVariable Integer age, @PathVariable String location) {
        return "My name is: " + name + ", My age is: " + age + ", and I live in: " + location;
    }

    @GetMapping("/adopt/{breed}/{color}/{fur}")
    public String adoptingDog(@PathVariable String breed, @PathVariable String color, @PathVariable String fur) {
        return "I want to adopt a: " + breed + ", in the color: " + color + ", and their coat will be: " + fur;
    }


    //--------------------POST API----------------------
    //endpoint's purpose is NOT to put out stuff for you to see on the browser;
    //the purpose is to handle/manipulate data and return you that data
    //the job to show you the stuff is the front end, not the back end
    //the browser will ALWAYS be making get requests; it will never do head, post, delete, etc on its own
    //we cannot (easily) make post requests from the browser
    //frontend would call the endpoint, take the data, do something with it, and then show something on the browser

    @PostMapping("/flowers") //cannot make post requests from browser
    public String createFlowers() {
        String whiteFlowers = "Lilies, Carnations ";
        String redFlowers = "Roses, Poppies ";
        String yellowFlowers = "Sunflowers, Tulips ";
        String flowers = whiteFlowers + redFlowers + yellowFlowers;
        System.out.println("White Flowers: " + whiteFlowers);
        System.out.println("Yellow Flowers: " + yellowFlowers);
        System.out.println("Red Flowers: " + redFlowers);
        return flowers;
    }

    @PostMapping("/summer")
    public String enjoyingSummer() {
        String summer = "Summer is for da boys";
        return summer;
    }

    @PostMapping("/fun") //string
    public String getFunEvents() {
        String winter = "sledding";
        String summer = "pool party";
        String spring = "picnic";
        String fall = "pumpkin patch";
        String events = winter + summer + spring + fall;
        System.out.println("Fun events year-round: " + events);
        return events;
    }


    @PostMapping("/sleepy") //Boolean
    public Boolean judgeSleepiness() {
        System.out.println("Rocky said both him and Buck are sleepy. Is that true?");
        String buckySleepy = "no";
        String rockySleepy = "yes";
        if (buckySleepy == rockySleepy){
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("/happy") //Boolean
    public Boolean judgeHappiness() {
        System.out.println("Is it true or false the pets are happy?");
        String buckyHappy = "yes";
        String rockyHappy = "yes";
        if (rockyHappy == buckyHappy){
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("/pizza") //Integer
    public Integer getPizzaSlices() {
        System.out.println("How many pizza slices are left?");
        Integer totalSlices = 12;
        Integer eatenSlices = 4;
        Integer leftSlices = totalSlices - eatenSlices;
        return leftSlices;
    }

    @PostMapping("/buttons") //Integer
    public Integer getButtons() {
        System.out.println("How many buttons do we have to re-sew?");
        Integer coat = 8;
        Integer shirt = 4;
        Integer backpack = 15;
        Integer totalButtons = backpack + shirt + coat;
        return totalButtons;
    }

    @PostMapping("/bill") //Integer
    public Integer getBillTotal() {
        System.out.println("How much is the bill?");
        Integer entree = 9;
        Integer drink = 4;
        Integer dessert = 5;
        Integer total = entree + drink + dessert;
        return total;
    }

    @PostMapping("/songs") //cannot make post requests from browser
    public String gettingSongs() {
        String popularSong = "Baby - Justin Beiber";
        String hatedSong = "Havanna - Camila Cabello";
        String favoriteSong = "Gasolina - Daddy Yankee";
        System.out.println("What is your favorite song?");
        return favoriteSong;
    }

    @PostMapping("/request")
    public String requestingBody(@RequestBody String requestedString) {
        System.out.println("printing the request body: " + requestedString);
        return "this is the requested body";
    }


}

// Install Postman
// Create 10 GET APIs
// Create 10 POST APIs
// play around with returning different data from all of them
// string
// Integer
// boolean
// Object (Car) (GET request)
// List Object (List of Cars) - GET request
// figure out how to pass VARIABLES in the API URL (ex: /hello/{this should be a variable somehow} ) @PathVariable
// returning the string/number that you passed in
// ex: /hello/123
// expect the return to be 123
// /hello/my-name-is-lucas
// expect the return to be my-name-is-lucas
// figure out how to PASS data to the API through the BODY (use this only with POST requests) @RequestBody
// ex: POST /hello
// body: "hello there"
// return "hello there"
// try the same as above with other data types (integer, object, list)




/*
@PathVariable is used to handle template variables in the request URI mapping (URI - Uniform Resource Indentifier)
Optional Elements:
- name (name of the path variable to bind to)
- required (whether the path variable is required)
- value (alias for name)



@RequestBody is used to map the HttpRequest body to transfer or domain object, enabling automatic deserialization
AKA the annotation tells Spring to deserialize a request body into an object, and the object is passed as a handler method parameter
 */
