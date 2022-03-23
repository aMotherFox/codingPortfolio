/*
FizzBuzz
Take a list with numbers, in numerical order (ex: 1- 100)

whenever a number is not divisble by 3 or 5, print out the number
whenever a number is divisble by 3, we want to print out the word "Fizz"
whenever a number is divisble by 5, we want to print out the word "Buzz"
whenever a number is divisble by both 3 and 5, we want to print out the word "FizzBuzz"

Example:
List [1, 2, 3, 4, 5, 6,.... 15]

Expect:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
...
(15) FizzBuzz
*/



const fizzBuzzNumbers = Array(100).fill(0).map((e, i) => i + 1)
console.log("fizzBuzzNumbers: ", fizzBuzzNumbers)


fizzBuzzNumbers.forEach(number => {
  if ((number % 15) === 0){
      console.log("FizzBuzz")
  } 
  else if (number % 3 === 0) {
      console.log("Fizz")
  } 
  else if ((number % 5) === 0){
      console.log("Buzz")
  } 
  else {
      console.log(number)
  }
 })

 const highest = Math.max(...numbers)
 const lowest = Math.min(...numbers)
 
 console.log("Highest Number: " + highest)
 console.log("Lowest Number: " + lowest)
 
 /*
if (number % 3 === 0 && number % 5 === 0)
    ^another way to do line 34, is just serperately saying 'if number is % by 3 AND if number is % by 5'

if (number % 3 === 0 || number % 5 === 0)
    ^is saying 'if number is % by 3 OR if number is % by 5

*/
