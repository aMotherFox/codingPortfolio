package com.my.firstSpringBootService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

//install Postman
//create 10 get APIs
//create 10 Post APIs
//play around with returning different data from all of them
    //try returning string, integer, boolean, object (like car we created)
//figure out how to pass variables in the API URL (i.e. /hello/{this should be a variable somehow}
//figure out how to PASS data to the API
