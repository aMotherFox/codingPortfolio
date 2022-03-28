/* Function
// keyword function + name of the function + () + {}
function addItem(){
    //type regular code you need repeated

code:
function functionName(parameter1, parameter2, parameter3) {
    ^ // code to be executed

    
}
Function signature: v
    Function definition/declaration - where it was created/telling us what it does - it does NOT do anything on its own (line 27)
    Function input - (variables) what you send into a function; declare how many and what variables are called in this function
    Function output - what it MIGHT return (return & strings)
------ *separation in code
Calling a function (line 37, 39, 40)
*/

/* functions refer to an action you want to do multiple times
    therefore its name should be something with a verb
    (console log is a function)
    () calls a function
    It is not until you call a function will it execute the code
    
*/
function takeThingToTheTable(x){ //we have a function with one delcared varible, x; it becomes banana when the first takeThingToTheTable runs


    console.log("Hello, I'm inside the function!")
    console.log("Taking x thing to the table...", x)

    console.log("________________________")
    return "I am the string being returned from the function" //firstReturn = this string
}

const firstReturn = takeThingToTheTable("BANANA") //here in the function we are calling it, it will do NOTHING until it is called; return is being assigned due to const output1
    //first it gives the string, then it gives the return; assign the RETURN of takeThingsToTheTable to variable firstReturn
takeThingToTheTable(20) //function calls, if no const return you don't use the return
takeThingToTheTable(true) //function calls

console.log("firstReturn: ", firstReturn)

const secondReturn = takeThingsToTheTable(20)
console.log("Second return: ", secondReturn)

/*
const firstReturn = takeThingToTheTable("BANANA")
const secondReturn = takeThingToTheTable(20)
takeThingToTheTable(true)
console.log("firstReturn: ", firstReturn)
console.log("Second return: ", secondReturn)

^better way to write
*/

_________________________________________________________________________________________________________________________________________

function addNumbers(x, y){
    const sumTotal = x + y

    console.log("sumTotal ", sumTotal)
    // ^ does NOT have a return
    return "This is x + y", 
    //^ NOW has a return, return must be after console
}

addNumbers(4, 2)
addNumbers(5, 10)


function addNumbers(x, y){
    const sumTotal = x + y
    console.log("in addNumbers, x: ", x, "y", y)
    return sumTotal 
    
}
const result1 = addNumbers(4, 2)
console.log("results1: ", results1)
const result2 = addNumbers(4, 2)
console.log("results2: ", results2)
const result3 = addNumbers(4, 2)
console.log("results3: ", results3)

/*
ECMA SCRIPT (aka ES_):
var myNumber = 0 //var almost the same as let, is older syntax from ES5 and earlier
Parameter handling: 

 const addNumbers = (x, y) => {
       const sumTotal = x + y
       return sumTotal  
 }

 function sayHello(){
    return "hello world"
 } //ES5

const sayHello = () =>{
    return "Hello World"
} ///ES6


const sayHello() => {
    return "Hello World"
} //rare version, MIGHT see
*/ 



console.log("--------")
function printNumbers(numbers){
    console.log("numbers: ", numbers)

                    //HINT, can create another array that is empty
    const anotherArray = []
    numbers.forEach(number => {
        anotherArray.push("I am the number...", number)
    })


    return anotherArray // could be any data type
}

const result = printNumbers([1, 2, 3])
console.log("result: ", result)














