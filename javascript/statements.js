const stringComparison = "lucas" === "lucas"
console.log("stringComparison: ", stringComparison) //this will be true

const numberComparison = 100 === "100"
console.log("numberComparison: ", numberComparison) //this will be false because index[0] is a number and index[1] is a string

const booleanComparison = true === false
console.log("booleanComparison: ", booleanComparison)

const nullComparison = null === undefined
console.log("nullComparison: ", nullComparison)

const randomComparison = undefined === false
console.log("randomComparison: ", randomComparison)

console.log("-----------------------")

// if else statement
if ("lucas" === "lucas") {
    console.log("this is true!")
} else {
    console.log("this is NOT true!")
}

console.log("-----------------------")

if (undefined) {
    console.log("this is truthy!") //truthy
} else {
    console.log("this is falsey!")
}






// ********* PRACTICE WRITING IF/ELSE STATEMENTS FOR DIFFERENT DATA TYPES ***********
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












//forLoop statement (allows you to iterate, the loop goes throuhh each index one at a time)
const numbers = [5, 15, 25, 35, 45, 55, 65, 75, 85, 95]

numbers.forEach( number => //you do not need the const, after the arrow anything you code will happen to each item in the list
console.log("adding 10 to the value: ", number, "which gives me: ", number + 10 ))

const buckies = [5, 15, 25, 35, 45, 55, 65, 75, 85, 95]

numbers.forEach(bucky => {
	console.log("adding 10 to the value: ", bucky, "which gives me: ", bucky + 10 )
})
result= [15, 25, 35, 45, 55, 65, 75, 85, 95, 105]



// ********* PRACTICE WRITING FOR LOOP BY ADDING 10 AND DETERMINING IF RESULT IS EVEN OR ODD ***********
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
// code divides number by 2, an even number will be completely divisible and leave 0 numbers left over
// an odd number cannot be completely dividing by 2 without leaving a number or decimal over, no it is NOT == 0 because there is a number other than 0 left over   




if (5 == "5") {
	console.log("equals")
}
if (5 === "5") {
	console.log("bleh")
}
if (Bucky === "Bucky") {
	
}