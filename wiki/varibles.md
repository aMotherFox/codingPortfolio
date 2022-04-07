In computer science, data is anything that is meaningful to the computer 
    AKA data type; how you talk to the computer
JavaScript provides eight different data types which are undefined, null, boolean, string, symbol, bigint, number, and object.

!! CONST IS A VARIABLE !!
    CONST:
    allows you to create an immutable variable





const name = "emre" // assignment
const name2 = "victoria"
const name3 = "lucas"
const name4 = "first name:"

console.log(name4, name) // parameters
console.log(name4, name2)
console.log(name4, name3) 

const firstNumber = 5
const secondNumber = 10
const newNumber = secondNumber - firstNumber
console.log("newNumber: ", newNumber)



Data types:
Function
String
Number
Boolean
Null
Undefined
Arrays
BigInt
Symbol
Lists (array)
Objects
Class


BOOLEAN:
In computer science, a Boolean is a logical data type that can have only the values true or false
*Use 'if' for function names
Very often, in programming, you will need a data type that can only have one of two values, like
                    YES / NO
                    ON / OFF
                    TRUE / FALSE
You can use the Boolean() function to find out if an expression (or a variable) is true:
    ^ e.g.
    if (boolean conditional) {
        console.log("boolean conditional resolved to true");
    } else {
        console.log("boolean conditional resolved to false");
    }
AKA
    Boolean(10 > 9)
    (10 > 9)
    10 > 9
                                if(true) {
                                    console.log("Bucky is the best")
                                } else{
                                    console.log("Rocky is the best")
                                }
    
                                if(false) {
                                    console.log("Rocky smells nice")
                                } else{
                                    console.log("Rocky is stinky")
                                }







NULL:
In computer science, a null value represents a reference that points, generally intentionally, to a nonexistent or invalid object or address. The meaning of a null reference varies among language implementations. AKA Null means nothing, NOT 0 because 0 is a defined thing
An empty value has nothing to do with undefined.
An empty string has both a legal value and a type.
Use: Age: 28, Gender: F, isHungry: (in the case of not knowing if I am hungry) Null- because we don't know or didn't get a response to this question,
    ^ e.g. 
    let car = "";    // The value is "", the typeof is "string"
Is falsey because it is essentially nothing








UNDEFINED: 
A variable without a value has the value undefined, similar to null
    ^ e.g.
    let car;    // Value is undefined, type is undefined
Is falsey because it is essentially nothing
Any variable can be emptied, by setting the value to undefined. The type will also be undefined.
    ^ e.g.
    car = undefined;    // Value is undefined, type is undefined
                if(undefined) {
                    console.log("this is true")
                } else{
                    console.log("this is not true")
                }











NUMBER:
The Number type is a double-precision 64-bit binary format IEEE 754 value (numbers between -(2^53 − 1) and 2^53 − 1). 
In addition to representing floating-point numbers, the number type has three symbolic values: +Infinity, -Infinity, and NaN ("Not a Number").
    ^ To check for the largest available value or smallest available value within ±Infinity, you can use the constants Number.MAX_VALUE or Number.MIN_VALUE.
The number type has only one integer with two representations: 0 is represented as both -0 and +0. (0 is an alias for +0.)
                if(1 === 1) {
                    console.log("this is true")
                } else{
                    console.log("this is not true")
                }
    
                if(10 === 1) {
                    console.log("this is true")
                } else{
                    console.log("this is not true")
                }










BIGINT:
The BigInt type is a numeric primitive in JavaScript that can represent integers with arbitrary precision. With BigInts, you can safely store and operate on large integers even beyond the safe integer limit for Numbers.
A BigInt is created by appending n to the end of an integer or by calling the constructor.
You can use the operators +, *, -, **, and % with BigInts—just like with Numbers. A BigInt is not strictly equal to a Number, but it is loosely so.
    ^ e.g. > const x = 2n ** 53n;
            9007199254740992n
            > const y = x + 1n;
            9007199254740993n











        

STRING:
String type is used to represent textual data. It is for storing and manipulating text. A JavaScript string is zero or more characters written inside quotes.
    ^ e.g. 
    let answer1 = "It's alright";
    let answer2 = "He is called 'Johnny'";
    let answer3 = 'He is called "Johnny"';
                if( "Buck" === "Bucky") {
                    console.log("Rocky is cute")
                } else{
                    console.log("Bucky is cute")
                }












SYMBOL:
A value having the data type Symbol can be referred to as a "Symbol value"
Symbol can have an optional description, but for debugging purposes only
Symbols are often used to add unique property keys to an object that won't collide with keys any other code might add to the object, and which are hidden from any mechanisms other code will typically use to access the object
    ^ e.g.
    let id1 = Symbol("id");
    let id2 = Symbol("id");









const firstNumber = 5
const secondNumber = 10
const newNumber = secondNumber - firstNumber
const newNumber10 = "newNumber: " + newNumber
console.log(newNumber10)
console.log("subtracting " + secondNumber + " - " + firstNumber + " which gives me " + (secondNumber - firstNumber))

const thirdNumber = 25
const fouthNumber = 5
const newNumber2 = thirdNumber + fouthNumber
console.log("newNumber2: "+ newNumber2)
console.log("adding "+ thirdNumber+ "+ "+ fouthNumber + " which gives me "+ thirdNumber + fouthNumber)

const fifthNumber = 2
const sixthNumber = 5
const newNumber3 = fifthNumber * sixthNumber
console.log("newNumber3: "+ newNumber3)
console.log("multiplying " + fifthNumber + " * " + sixthNumber + " which gives me " + fifthNumber * sixthNumber)

const seventhNumber = 50
const eighthNumber = 2
const newNumber4 = seventhNumber / eighthNumber
console.log("dividing " + seventhNumber+ " / "+ eighthNumber+ " which gives me "+ seventhNumber / eighthNumber)










const numbers = [5, 15, 25, 35, 45, 55, 65, 75, 85, 95]

numbers.forEach( number => 
console.log("adding 10 to the value: ", number, "which gives me: ", number + 10 ))

const buckies = [5, 15, 25, 35, 45, 55, 65, 75, 85, 95]

numbers.forEach(bucky => {
	console.log("adding 10 to the value: ", bucky, "which gives me: ", bucky + 10 )
})










const numbers = [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

numbers.forEach(number => {
	console.log("adding 10 to the value: ", number, "which gives me: ", number + 10 )
 
	if ((number + 10) % 2 === 0) {
    console.log("even")
	} 
  else {
    console.log("odd")
	}
})
     
if (5 == "5") {
	console.log("equals")
}
if (5 === "5") {
	console.log("bleh")
}
if (Bucky === "Bucky") {
	
}
