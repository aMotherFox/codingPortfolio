// collection of things
// in JS are also known as lists
// content in JS lists/arrays should be the same data type, not a HARD rule but is preferred and codes better
//   ^i.e. [1, 2, 3, 4, 5, 6, 7] vs [1, 2, 3, null, true, pet1, 7]  
// we refer to each thing in a list as an index, starting at [0]
//  ^ that means the first thing in a list is index [0], the next thing is index [1], etc, regaurdless of what the content is

const pet1 = "Bucky"
const pet2 = "Rocky"
const pet3 = "Nieve"

const pets = [pet1, pet2, pet3] // list of strings
console.log("pets: ", pets)

const newList = [pet1, pet2, 9000, true]
console.log("newList: ", newList)



// How to log indexs
const someNumbers = [10, 5] //how to log only the first index
    console.log("someNumbers index 0 is: ", someNumbers[0]) //how to log the first index
    console.log("someNumbers index 1 is: ", someNumbers[1]) //how to log the second index
    console.log("Adding numbers from someNumbers", someNumbers[0] + someNumbers[1])


// newList.js
const numbers = Array(100).fill(0).map((e, i) => i + 1)
console.log("numbers: ", numbers)

const evenNumbers = []

numbers.forEach(number => {
    if (number % 2 === 0) {
        evenNumbers.push(number)
    }
    // DOES NOT return anything
})
console.log("evenNumbers: ", evenNumbers)

const filteredEvenNumbers = numbers.filter(number => number % 2 === 0)
const filteredEvenNumbers2 = numbers.filter(number => {
    if (number % 2 === 0) {
        return number
    }
})
console.log("filteredEvenNumbers: ", filteredEvenNumbers)
console.log("filteredEvenNumbers2: ", filteredEvenNumbers2)



// In-Line format
const someNumbers = [100, 50]
console.log("adding numbers from someNumbers", someNumbers[0] + someNumbers[1]) //NOT in-line
console.log(`adding numbers from ${someNumbers}`, someNumbers[0] + someNumbers[1]) //PARTIALLY in-line
console.log(`adding numbers from ${someNumbers}: whch gives me ${someNumbers[0] + someNumbers[1]}`)  //FULLY in-line





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





/*
Function definition/declaration - where it was created/telling us what it does
Function input (variables)
Function output - what it MIGHT return

Calling a function
*/

const entreePrice = 20
const drinkPrice = 5
// add them
const result = entreePrice + drinkPrice

/* functions refer to an action you want to do multiple times
    therefore its name should be something with a verb
    (console log is a function)
    () calls a function
*/
function printOutThings(){


    console.log("Hello, I'm inside the function!")


}

const finalBill1 = addItem(7, 3, 2)
const finalBill2 = addItem(11, 6, 10)
const finalBill3 = addItem(100, 60, 30)

console.log("finalBill1: ", finalBill1)











const numbers1 = [1, 2, 3, 4, 5]
numbers1.forEach(numbers) => {
    number + 10
}
console.log("numbers plus 10: ", number)