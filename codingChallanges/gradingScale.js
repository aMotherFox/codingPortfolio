// grading scale
/*
Take in a list of grades (0 - 100)

1: tell me the letter grade for each score (in an array)
2: Give the student a motivational sentence depending on their letter grade
 2.a: use if/else if/else statements
 2.b: use a switch statement


Ex:
numbers = [0, 100]

expected output: 

1. [[0, F], [70, C], [90, A], etc]
   

2.
    A -> 'WOW YOURE AMAZINZ'
    B -> "...."
    C -> "...."
    D -> "something else...."
    F -> "YOU SUCK...."
   
*/

const numbers = []
const grades = []
for (let number = 0; number <= 100; number++) {
    numbers.push(number)
}
console.log('numbers: ', numbers)

numbers.forEach(number => {
	if (number <= 59){
  	grades.push([number, "F"])
  } else if (number >=60 && number <=69){
  	grades.push([number, "D"])
  } else if (number >=70 && number <=79){
  	grades.push([number, "C"])
  } else if (number >=80 && number <=89){
  	grades.push([number, "B"])
  } else if (number >=90 && number <=100){
  	grades.push([number, "A"])
  } else{
  	console.log("No Grade for Number ", number)
  }
})
console.log("Grades: ", grades)


grades.forEach(numberLetterArray => {
	console.log(numberLetterArray, "numberLetterArray")
	if (numberLetterArray[1] === "A"){
  	console.log(numberLetterArray[1], ": Almost as perfect as Bucky!")
  } else if (numberLetterArray[1] === "B"){
  		console.log(`${numberLetterArray[1]} : B is for Bucky`)
  } else if (numberLetterArray[1] === "C"){
  		console.log(`${numberLetterArray[1]} : C is for Cute Bucky`)
  } else if (numberLetterArray[1] === "D"){
  		console.log(`${numberLetterArray[1]} : Don't disappoint Bucky`)
  } else if (numberLetterArray[1] === "F"){
  	console.log(`${numberLetterArray[1]} : You are Rocky`)
  }


  switch (numberLetterArray[1]) { 
      case "F":
        console.log(numberLetterArray[1], "You are Rocky");
        break;
      case "D":
        console.log(numberLetterArray[1], "Don't disappoint Bucky");
        break;
      case "C":
        console.log(numberLetterArray[1], "C is for Cute Bucky");
        break;
      case "B":
        console.log(numberLetterArray[1], "B is for Bucky");
        break;
      case "A":
        console.log(numberLetterArray[1], "Almost as perfect as Bucky!");
        break;
      default:
        console.log(numberLetterArray[1], "Grades don't match", grades)
  }

})


/* grades.forEach(numberLetterArray => {
  switch (numberLetterArray[1]) { 
    case "F":
      console.log(numberLetterArray[1], "You are Rocky");
      break;
    case "D":
      console.log(numberLetterArray[1], "Don't disappoint Bucky");
      break;
    case "C":
      console.log(numberLetterArray[1], "C is for Cute Bucky");
      break;
    case "B":
      console.log(numberLetterArray[1], "B is for Bucky");
      break;
    case "A":
      console.log(numberLetterArray[1], "Almost as perfect as Bucky!");
      break;
    default:
      console.log(numberLetterArray[1], "Grades don't match", grades)
}
}) */
























// grading scale
/*
Take in a list of grades (0 - 100)

1: tell me the letter grade for each score (in an array)
2: Give the student a motivational sentence depending on their letter grade
 2.a: use if/else if/else statements
 2.b: use a switch statement
   
*/

const numbers = []
const grades = []
for (let number = 0; number < 101; number++) {
    numbers.push(number)
}
console.log('numbers: ', numbers)

numbers.forEach(number => {
	if (number <= 59){
  	grades.push([number, "F"])
  } else if (number >=60 && number <=69){
  	grades.push([number, "D"])
  } else if (number >=70 && number <=79){
  	grades.push([number, "C"])
  } else if (number >=80 && number <=89){
  	grades.push([number, "B"])
  } else if (number >=90 && number <=100){
  	grades.push([number, "A"])
  }
}
)
console.log("Grade: ", grades)

grades.forEach(numberLetterArray => {
	if (numberLetterArray[1] === "A"){
  	console.log(numberLetterArray[1], ": Almost as perfect as Bucky!")
  } else if (numberLetterArray[1] === "B"){
  		console.log(`${numberLetterArray[1]} : B is for Bucky`)
  } else if (numberLetterArray[1] === "C"){
  		console.log(`${numberLetterArray[1]} : C is for Cute Bucky`)
  } else if (numberLetterArray[1] === "D"){
  		console.log(`${numberLetterArray[1]} : Don't disappoint Bucky`)
  } else if (numberLetterArray[1] === "F"){
  	console.log(`${numberLetterArray[1]} : You are Rocky`)
    }
})