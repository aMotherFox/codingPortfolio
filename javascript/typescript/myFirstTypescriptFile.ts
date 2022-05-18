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

const myName: string = "Bucky" //string, same as JS
const myFavNumber: number = 5 //number, same as JS; when you don't use : it means you are INFERRING type
const isHappy: boolean = true //boolean, same as JS
const nullVar: null = null
const undefinedVar: undefined = undefined
const favColours: string[] = ["red", "blue", "green"]
const myFavNumbers: number[] = [5, 23, 101]
const person: { name: string, age: number, isHungry: boolean, color: string } = {
    name: "Bucky",
    age: 3,
    isHungry: true,
    color: "brown"
}

const myFunction = (someParameter: string) => {
    console.log("myFunction", someParameter)
}
myFunction("I AM A STRING")

// Creating a function 'myFunciton2' that recieves an object type 'MyEvent' as a parameter

type MyEvent = {
    target: {
        value: string
    }
}

const myFunciton2 = (event: MyEvent) => {
    console.log("myFunciton2 - event", event)
}

const myEventObject = {
    target: {
        value: "I am a string"
    }
}
myFunciton2(myEventObject)



type Person = {
    firstName: string,
    lastName: string,
    age: number,
    favColour: "purple" | "blue" | "red", //can hardcode it so you get alerted when it changes
    isHungry: boolean,
    favoriteHobby: Hobby,
    hobbies: Hobby[]
}

type Color = "red" | "blue" | "purple" //not an ENUM
// favColour: Color // can also do this
enum Hobby {
    GAMING, TEACHING, CRYING, LAUGHING
}

const person2: Person = {
    firstName: "Rocky",
    lastName: "Balboa",
    age: 7,
    favColour: "purple",
    isHungry: true,
    favoriteHobby: Hobby.GAMING,
    hobbies: [Hobby.CRYING, Hobby.GAMING, Hobby.LAUGHING]
}

console.log("my name is: ", myFavNumber)
console.log("my fav numer is: ", myFavNumber)
console.log("am I happy ", isHappy)
console.log("nullVar: ", nullVar)
console.log("undefinedVar: ", undefinedVar)
console.log("favColours: ", favColours)
console.log("myFavNumbers: ", myFavNumbers)
console.log("person: ", person)
console.log("person2: ", person2)

export {}


// TSC compiles, NODE executes