Core concepts:

- creating lists
- getting values by index (number[0])
- iterating though lists (numbers.forEach[])



Arrays are are 0 based in every language, which means the first item is [0], second is [1], and so on.
JavaScript arrays are written with square brackets []
    ^ in JS also known as lists
    array === list



// collection of things
// in JS are also known as lists
// content in JS lists/arrays should be the same data type, not a HARD rule but is preferred and codes better
//   ^i.e. [1, 2, 3, 4, 5, 6, 7] vs [1, 2, 3, null, true, pet1, 7]  
// we refer to each thing in a list as an index, starting at [0]
//  ^ that means the first thing in a list is index [0], the next thing is index [1], etc, regaurdless of what the content is
// Array items are separated by commas. AKA [1, 2, 3, 4, etc]



The following code declares (creates) an array called cars, containing three items (car names):
    const cars = ["Saab", "Volvo", "BMW"];



array mthods/functions:
    - .forEach (iterating though lists)
    - .reduce
    - _.max/_.min (lodash largest/smallest) ***technically not an array method, is a lodash method
    - push (add elements to a lsit)
    - .filter // great if you want an array as a result that match the criteria given i.e. given a large array and returns a smaller array that matches a particular condition
    - .map 
    - .find
    - .sort


1:21


// ----- PUSH METHOD -----
console.log("----- PUSH METHOD -----")

const numbers = []
console.log("numbers: ", numbers)
numbers.push(2, 5,, 6, ect)
console.log("numbers after pushing: ", numbers)

//you can do this more than once
numbers.push(7, 8,, 9, ect)
console.log("numbers after ANOTHER pushing: ", numbers)

numbers.push("I am a string", true, "I am another string", false, undefined, 2000, "booooo")
console.log("numbers after FINAL push: ", numbers)

numbers.forEach(element => {
    console.log("element: ", element)
})    




