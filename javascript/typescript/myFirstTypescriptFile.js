"use strict";
/* ---------------------DATA TYPES----------------------------
 :_____ is specififying the data type
- string
- number
- boolean
- null
- undefined
- lists/arrrays = datatype[] or Array<data type>
- objects
- function
*/
exports.__esModule = true;
var myName = "Bucky"; //string, same as JS
var myFavNumber = 5; //number, same as JS; when you don't use : it means you are INFERRING type
var isHappy = true; //boolean, same as JS
var nullVar = null;
var undefinedVar = undefined;
var favColours = ["red", "blue", "green"];
var myFavNumbers = [5, 23, 101];
var person = {
    name: "Bucky",
    age: 3,
    isHungry: true,
    color: "brown"
};
var myFunction = function (someParameter) {
    console.log("myFunction", someParameter);
};
myFunction("I AM A STRING");
var myFunciton2 = function (event) {
    console.log("myFunciton2 - event", event);
};
var myEventObject = {
    target: {
        value: "I am a string"
    }
};
myFunciton2(myEventObject);
// favColour: Color // can also do this
var Hobby;
(function (Hobby) {
    Hobby[Hobby["GAMING"] = 0] = "GAMING";
    Hobby[Hobby["TEACHING"] = 1] = "TEACHING";
    Hobby[Hobby["CRYING"] = 2] = "CRYING";
    Hobby[Hobby["LAUGHING"] = 3] = "LAUGHING";
})(Hobby || (Hobby = {}));
var person2 = {
    firstName: "Rocky",
    lastName: "Balboa",
    age: 7,
    favColour: "purple",
    isHungry: true,
    favoriteHobby: Hobby.GAMING,
    hobbies: [Hobby.CRYING, Hobby.GAMING, Hobby.LAUGHING]
};
console.log("my name is: ", myFavNumber);
console.log("my fav numer is: ", myFavNumber);
console.log("am I happy ", isHappy);
console.log("nullVar: ", nullVar);
console.log("undefinedVar: ", undefinedVar);
console.log("favColours: ", favColours);
console.log("myFavNumbers: ", myFavNumbers);
console.log("person: ", person);
console.log("person2: ", person2);
// TSC compiles, NODE executes
