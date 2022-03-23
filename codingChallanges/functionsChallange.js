/*
 - Functions Requirements
   1. call every function at least 3 times
   2. Print out the RESULT (returned value) // OUTSIDE THE FUNCTION

1. Do standard math arithmetics (+, -, *, /)

Inputs:         2 numbers
Output:         1 number

2. Check if number is even/odd

Input:   1 number
Output: "Even" or "Odd"

Example: calling function with (1) should print out "Odd"

3. Find the smallest in the array

Input: 1 array of size 100
Output: 1 number

Example: calling with functions from 1- 100 prints out 1


4. Find the largest number in the array

Input: 1 array of size 100
Output: 1 number

Example: calling with functions from 1- 100 prints out 100



5. Give a grade range depending on given letter score using a switch statement

Input: 1 letter (string)
Output: 1 string

Example: 
calling with functions with A prints out "90-100"
calling with functions with B prints out "80-89"
calling with functions with F prints out "0-59"


6. Given an array of numbers, give me the sum of all of them together

Input: 1 array
Output: 1 number

Example: 

given [1, 2, 3, 4]
should output: 10


7. Given an array of numbers, find the subtraction of all numbers together

Input: 1 array
Output: 1 number

Example: 

given [1, 2, 3, 4]
should output: -8

8. Food menu! Given an entree, drink, and dessert, figure out the total cost of a bill after a 7% tax

Input: 3 numbers (entree, drink, and desser prices)
Output: 1 number

Example:

given 10, 5, 3 (entree cost 10, drink 5, and dessert 3)
should output: 19.26

9. Discounts! when buying an item with a coupon, figure out the final price after a X% discount, adding a flat 7% tax afterwards (the tax is applied on the amount AFTER being discounted, not before)

Input: 2 numbers (item cost and coupon amount)
Output: 1 number

Example:

Given 1000, 20 ($1000 item, 20% discount)
Should output: $786
*/

function addNumbers(number1, number2) {
    console.log("variables I recevied are number1: ", number1, " and number2: ", number2)

    const total = number1 + number2
    return total
}

const firstAddition = addNumbers(1, 2)
console.log("firstAddition: ", firstAddition)

const secondAddition = addNumbers(-1, -100)
console.log("secondAddition: ", secondAddition)

const thirdAddition = addNumbers(-3, 7)
console.log("thirdAddition: ", thirdAddition)








-----------------------------------------------------------

function addNumbers(number1, number2) {
  console.log("variables I recevied to add are number1: ", number1, " and number2: ", number2)

  const total = number1 + number2
  return total
  
}
const firstAddition = addNumbers(1, 2)
console.log("Adding 1 + 2: ", firstAddition)
const secondAddition = addNumbers(-1, -100)
console.log("Adding -1 + -100: ", secondAddition)
const thirdAddition = addNumbers(-3, 7)
console.log("Adding -3 + 7: ", thirdAddition)



console.log("--------------------ADD---------------------------") 



function subNumbers(number1, number2) {
  console.log("variables I recevied to subtract are number1: ", number1, " and number2: ", number2)

  const total = number1 - number2
  return total
}
const firstSubtration = subNumbers(5, 2)
console.log("Subtracting 5 - 2: ", firstSubtration)
const secondSubtration = subNumbers(17, 7)
console.log("Subtracting 17 - 7: ", secondSubtration)
const thirdSubtration = subNumbers(-11, -23)
console.log("Subtracting -11 - -23: ", thirdSubtration)


console.log("--------------------SUBTRACT---------------------------")   


function multiNumbers(number1, number2) {
  console.log("variables I recevied to multiply are number1: ", number1, " and number2: ", number2)

  const total = number1 * number2
  return total
}
const firstMultiply = multiNumbers(10, 2)
console.log("Multiplying 10 * 2: ", firstMultiply)
const secondMultiply = multiNumbers(20, 3)
console.log("Multiplying 20 * 3: ", secondMultiply)
const thirdMultiply = multiNumbers(3, 9)
console.log("Multiplying 3 * 9: ", thirdMultiply)



console.log("--------------------MULTIPLY---------------------------")


function divNumbers(number1, number2) {
  console.log("variables I recevied to divide are number1: ", number1, " and number2: ", number2)

  const total = number1 / number2
  return total
}  
const firstDivide = divNumbers(80, 4)
console.log("Dividing 80 / 4: ", firstDivide)
const secondDivide = divNumbers(65, 5)
console.log("Dividing 65 / 5: ", secondDivide)
const thirdDivide = divNumbers(92, 8)
console.log("Dividing 92 / 8: ", thirdDivide)


console.log("--------------------DIVISION---------------------------") 



function isNumEvenOrOdd (number1){
  if (number1 % 2 === 0) {
    return "even"
  } 
  else {
    return "odd"
  }
} 
const evenOrOdd = isNumEvenOrOdd(33)
console.log("33 is ", evenOrOdd)
const evenOrOdd2 = isNumEvenOrOdd(105)
console.log("102 is ", evenOrOdd2)
const evenOrOdd3 = isNumEvenOrOdd(42)
console.log("42 is ", evenOrOdd3)



console.log("--------------------EVEN OR ODD---------------------------") 





const oneTewOneHundred = Array(100).fill(0).map((e, i) => i + 1)
const testArray3 = [1, 6, 13, 267, -289, 2, 5]
const testArray4 = [4, 13, 56, 29, 46, 23, 78]

function findsmallestNumberInList(arrayOfNumbers) { // arrayOfNumbers = array
	//console.log("Inside largest number in list with arrayOfNumbers: ", arrayOfNumbers)
  
	let smallestNumberInArray = arrayOfNumbers[0]
  
  arrayOfNumbers.forEach(number => { 
  	//console.log("in the foreach, number is: ", number) //number = 1
    if (number < smallestNumberInArray){
    	//console.log("number", number, "is greater than smallestNumberInArray", smallestNumberInArray)
      smallestNumberInArray = number     
    }
  	
	})
  return smallestNumberInArray
}
const smallestNumber = findsmallestNumberInList(oneTewOneHundred)
console.log("The smallest number in the array is smallestNumber: ", smallestNumber)

const smallestNumber2 = findsmallestNumberInList(testArray3)
console.log("The smallest number in the array is smallestNumber2: ", smallestNumber2)

const smallestNumber3 = findsmallestNumberInList(testArray4)
console.log("The smallest number in the array is smallestNumber3: ", smallestNumber3)









console.log("--------------------SMALLEST IN ARRAY---------------------------") 





const oneToOneHundred = Array(100).fill(0).map((e, i) => i + 1)
const testArray1 = [1, 6, 13, 267, -289, 2, 5]
const testArray2 = [4, 13, 56, 29, 46, 23, 78]

function findLargestNumberInList(arrayOfNumbers) { // arrayOfNumbers = array
	//console.log("Inside largest number in list with arrayOfNumbers: ", arrayOfNumbers)
  
	let largestNumberInArray = arrayOfNumbers[0]
  
  arrayOfNumbers.forEach(number => { 
  	//console.log("in the foreach, number is: ", number) //number = 1
    if (number > largestNumberInArray){
    	//console.log("number", number, "is greater than largestNumberInArray", largestNumberInArray)
      largestNumberInArray = number     
    }
  	
	})
  return largestNumberInArray
}
const largestNumber = findLargestNumberInList(oneToOneHundred)
console.log("The largest number in the array is largestNumber: ", largestNumber)

const largestNumber2 = findLargestNumberInList(testArray1)
console.log("The largest number in the array is largestNumber2: ", largestNumber2)

const largestNumber3 = findLargestNumberInList(testArray2)
console.log("The largest number in the array is largestNumber3: ", largestNumber3)





console.log("--------------------LARGEST IN ARRAY---------------------------") 




function giveletterGradeToScore(grade){
	console.log("letter grade", grade)
 if (grade === "A") {
    return "90-100"
  } 
  else if(grade === "B") {
    return "80-89"
  }
  else if(grade === "C") {
    return "70-79"
  }
  else if(grade === "D") {
    return "60-69"
  }
  else if(grade === "F") {
    return "0-59"
  } 
  
}

const letterGrade = giveletterGradeToScore("A")
console.log("Your score is: ", letterGrade)
const letterGrade2 = giveletterGradeToScore("B")
console.log("Your score is: ", letterGrade2)
const letterGrade3 = giveletterGradeToScore("C")
console.log("Your score is: ", letterGrade3)
const letterGrade4 = giveletterGradeToScore("D")
console.log("Your score is: ", letterGrade4)
const letterGrade5 = giveletterGradeToScore("F")
console.log("Your score is: ", letterGrade5)





console.log("--------------------GRADING SCALE---------------------------")



const arrayOfNumbers = [1, 2, 3, 4]
const arrayOfNumbers2 = [5, 6, 7, 8]
const arrayOfNumbers3 = [9, 10, 11, 12]

function addingAllNumbers(arrayOfNumbers){
  let total = 0
  arrayOfNumbers.forEach(number =>{
  	total = total + number
  })
  return total
}

const allAdded = addingAllNumbers(arrayOfNumbers)
console.log("Total of addition: ", allAdded)

const allAdded2 = addingAllNumbers(arrayOfNumbers2)
console.log("Total of addition: ", allAdded2)

const allAdded3 = addingAllNumbers(arrayOfNumbers3)
console.log("Total of addition: ", allAdded3)



console.log("--------------------ADDING AN ARRAY---------------------------")




const arrayOfNumbers = [1, 2, 3, 4]
const arrayOfNumbers2 = [5, 6, 7, 8]
const arrayOfNumbers3 = [9, 10, 11, 12]

function addingAllNumbers(functionVarible){
  let total = 0
  functionVarible.forEach(number =>{
  	total = total + number
  })
  return total
}

const allAdded = addingAllNumbers(arrayOfNumbers)
console.log("Total of addition: ", allAdded)

const allAdded2 = addingAllNumbers(arrayOfNumbers2)
console.log("Total of addition: ", allAdded2)

const allAdded3 = addingAllNumbers(arrayOfNumbers3)
console.log("Total of addition: ", allAdded3)





console.log("--------------------ADDING AN ARRAY---------------------------")





const arrayOfNumbers = [1, 2, 3, 4]
const arrayOfNumbers2 = [5, 6, 7, 8]
const arrayOfNumbers3 = [9, 10, 11, 12]

function subtractingAllNumbers(functionVarible){
console.log("functionVarible", functionVarible)
  let total = functionVarible[0]
  functionVarible.forEach((number, index) =>{
    if (index !== 0){
      total = total - number
    }
  })
  return total
}

const allSubbed = subtractingAllNumbers(arrayOfNumbers)
console.log("Total of subtracting: ", allSubbed)

const allSubbed2 = subtractingAllNumbers(arrayOfNumbers2)
console.log("Total of subtracting: ", allSubbed2)

const allSubbed3 = subtractingAllNumbers(arrayOfNumbers3)
console.log("Total of subtracting: ", allSubbed3)




console.log("--------------------SUBTRACT AN ARRAY---------------------------")




function giveLetterGradeAScoreWithSwitch(grade){
	switch (grade){
  	case "F":{
    	return "0-59"
    }
    case "D":{
    	return "60-69"
    }
    case "C":{
    	return "70-79"
    }
    case "B":{
    	return "80-89"
    }
    case "A":{
    	return "90-100"
    }
    default:{
    	return "No grade range applicible to grade" + grade
    }
  }
}

const realLetterGrade = giveLetterGradeAScoreWithSwitch("F")
console.log("realLetterGrade", realLetterGrade)
const realLetterGrade2 = giveLetterGradeAScoreWithSwitch("D")
console.log("realLetterGrade2", realLetterGrade2)
const realLetterGrade3 = giveLetterGradeAScoreWithSwitch(6)
console.log("realLetterGrade3", realLetterGrade3)
const realLetterGrade4 = giveLetterGradeAScoreWithSwitch("C")
console.log("realLetterGrade4", realLetterGrade4)
const realLetterGrade5 = giveLetterGradeAScoreWithSwitch("B")
console.log("realLetterGrade5", realLetterGrade5)
const realLetterGrade6 = giveLetterGradeAScoreWithSwitch("A")
console.log("realLetterGrade6", realLetterGrade6)




console.log("--------------------GRADE SWITCH STATEMENT---------------------------")





function printOutTotal(entreePrice, drinkPrice, dessertPrice){
	const dinnerTotal = entreePrice + drinkPrice + dessertPrice
  const afterTax = dinnerTotal + (dinnerTotal * (7/100))
  return afterTax
}

const bill1 = printOutTotal(7, 3, 2)
console.log("bill1: ", bill1)
const bill2 = printOutTotal(12, 6, 8)
console.log("bill2: ", bill2)
const bill3 = printOutTotal(18, 2, 11)
console.log("bill3: ", bill3)




console.log("--------------------MENU PLUS TAX---------------------------")




function usingACoupon(itemCost, couponAmount){
	const creatingPercent = couponAmount/100
	const afterCoupon = itemCost - (itemCost * creatingPercent)
  const afterTax = afterCoupon + (afterCoupon * (7/100))
  return afterTax
}

const priceAndDiscount = usingACoupon(1000, 20)
console.log("priceAndDiscount", priceAndDiscount)
const priceAndDiscount2 = usingACoupon(5000, 45)
console.log("priceAndDiscount2", priceAndDiscount2)
const priceAndDiscount3 = usingACoupon(80, 33)
console.log("priceAndDiscount3", priceAndDiscount3)






console.log("--------------------SHOPPING MINUS DISCOUNT PLUS TAX---------------------------")