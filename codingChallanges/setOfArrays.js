/*
Start with a list of X numbers

1- create me a new list of all even numbers
2- create me another list with all odd numbers
3- create me another list with all even numbers AND numbers that are divisible by 15
4- create me a list where numbers are between 20 and 30 inclusive
5- create me a list where nubmers are between 10 to 20 inclusive OR 30 - 40 inclusive

Expected outputs:
const numbers = [1, ...., 100]

1. [2, 4, 6, ...]
2. [1, 3, 5, ...]
3. [2, 4, 6,.... 15, 16, 18, ...45, 46]
5. [20, 21, ...30]
6. [10, 11,...20, 30, 31, ..., 40]
*/



const numbers = Array(100).fill(0).map((e, i) => i + 1)
console.log("numbers: ", numbers)

const evenNumbers = []
const oddNumbers = []
const divisible = []
const twentyToThirty = []
const tenTwentyThirtyFourty = []

 
 
 numbers.forEach(number => {
 if (number % 2 === 0) {
     evenNumbers.push(number)
   }
 })
 console.log("Even numbers", evenNumbers)
 
 
 
 numbers.forEach(number => {
 if (number % 3 === 0) {
     oddNumbers.push(number)
   }
 })
 console.log("Odd numbers", oddNumbers)
 
 
 
  numbers.forEach(number => {
 if (number % 2 === 0 && number % 15 === 0) {
     divisible.push(number)
   }
 })
 console.log("Divisible by 15, and even", divisible)
 
 
 numbers.forEach(number => {
 if (number > 19 && number < 31) {
     twentyToThirty.push(number)
   }
 })
 console.log("20-30", twentyToThirty)
 
 
 
 numbers.forEach(number => {
 if (number >= 10 && number <= 20 || number >= 30 && number <= 40) {
     tenTwentyThirtyFourty.push(number)
   }
 })
 console.log("10-20 or 30-40", tenTwentyThirtyFourty)






 ******* BETTER WAY *******

numbers.forEach(number => {
    if (number % 2 === 0) {
        evenNumbers.push(number)
  }
  if (number % 3 === 0) {
        oddNumbers.push(number)
  }
  if (number % 2 === 0 && number % 15 === 0) {
        divisible.push(number)
  }
  if (number > 19 && number < 31) {
        twentyToThirty.push(number)
  }
  if (number > 9 && number < 21 || number > 29 && number < 41) {
        tenTwentyThirtyFourty.push(number)
  }
})
