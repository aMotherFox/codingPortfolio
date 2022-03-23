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

const myNumber = 123456 //number
  console.log("myNumber: ", myNumber)

const isHappy = true //boolean
const isHappy = false //boolean
  console.log("isHappy: ", isHappy)





// 02-28-22, practicing arithmatic on variables

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





// 03-01-22
//boolean
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
    
    
    //number
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
    
    
    
    //undefined
    if(undefined) {
    console.log("this is true")
    } else{
    console.log("this is not true")
    }
    
    
    
    //string
    if( "Buck" === "Bucky") {
    console.log("Rocky is cute")
    } else{
    console.log("Bucky is cute")
    }



const numbers = [5, 15, 25, 35, 45, 55, 65, 75, 85, 95]

numbers.forEach( number => 
console.log("adding 10 to the value: ", number, "which gives me: ", number + 10 ))

const buckies = [5, 15, 25, 35, 45, 55, 65, 75, 85, 95]

numbers.forEach(bucky => {
	console.log("adding 10 to the value: ", bucky, "which gives me: ", bucky + 10 )
})





// 03-02-22
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









// 03-02-22
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

let numTotal = 1
console.log("numTotal: ", numTotal)


numbers.forEach(number => { 
	numTotal = 2
})
console.log("numTotal after the for each: ", numTotal)










// 03-03-2022
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let numTotal = 0
console.log("numTotal: ", numTotal )
numbers.forEach(number => {
	numTotal = numTotal + number
  console.log("numTotal in forEach: ", numTotal )
})
console.log("numTotal at the end: ", numTotal )




const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let numTotal = 2
console.log("numTotal: ", numTotal )
numbers.forEach(number => {
	if (number === 1){
  numTotal = 1
	console.log("if  number 0 is 1 ", numTotal)
  } else {
  	numTotal = numTotal - number
  console.log("numTotal in forEach: ", numTotal )
  } 
  
})
console.log("numTotal at the end: ", numTotal )

XX OR XX

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let result = 2

console.log("result: ", result )
numbers.forEach(number => {
	if (number === numbers[0]){
  numTotal = number
	console.log("if  number 0 is 1 ", result)
  } else {
  	result = result - number
  console.log("result in forEach: ", result )
  } 
  
})
console.log("result at the end: ", result )




LUCAS EXAMPLE
console.log(" ---- better way -- ")
let betterSum = 0
let betterSubtraction = numbers[0]
let betterMultiplication = numbers[0]
let betterDivision = numbers[0]

numbers.forEach((number, index) => {
    console.log("number: ", number)
    console.log("index: ", index)
    betterSum = betterSum + number

    if (index !== 0) {
        betterSubtraction = betterSubtraction - number
        betterMultiplication = betterMultiplication * number
        betterDivision = betterDivision / number
    }
})
console.log("betterSum: ", betterSum)
console.log("betterSubtraction: ", betterSubtraction)
console.log("betterMultiplication: ", betterMultiplication)
console.log("betterDivision: ", betterDivision)





console.log(" ---- bestish way -- ")
const newSum = numbers.reduce(
    (previousValue, currentValue) => previousValue + currentValue
);
const newSubtraction = numbers.reduce(
    (previousValue, currentValue) => previousValue - currentValue
);
const newMultiplication = numbers.reduce(
    (previousValue, currentValue) => previousValue * currentValue
);
const newDivision = numbers.reduce(
    (previousValue, currentValue) => previousValue / currentValue
);
    
console.log("newSum: ", newSum)
console.log("newSubtraction: ", newSubtraction)
console.log("newMultiplication: ", newMultiplication)
console.log("newDivision: ", newDivision)









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








*********SWITCH METHOD*********
const iceCream = "chocolate"

if(iceCream === "chocolate"){
	console.log("Your favorite ice cream is chocolate")
} else if (iceCream === "vanilla"){
	console.log("Your favorite ice cream is vanilla")
}

switch(iceCream){
	case "vanilla": {
  	console.log("Your favorite ice cream is vanilla")
  }
}



function giveLetterGradeToScore(grade){
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
    else{
    	return "No grade range applicible to grade" + grade
    }
  
}

const letterGrade = giveLetterGradeToScore("A")
console.log("Your score is: ", letterGrade)
const letterGrade2 = giveLetterGradeToScore("B")
console.log("Your score is: ", letterGrade2)
const letterGrade3 = giveLetterGradeToScore("C")
console.log("Your score is: ", letterGrade3)
const letterGrade4 = giveLetterGradeToScore("D")
console.log("Your score is: ", letterGrade4)
const letterGrade5 = giveLetterGradeToScore("F")
console.log("Your score is: ", letterGrade5)
const letterGrade6 = giveLetterGradeToScore(6)
console.log("Your score is: ", letterGrade6)