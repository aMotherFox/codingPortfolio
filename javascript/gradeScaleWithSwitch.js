/*
Give a grade range depending on given letter score using a switch statement

Input: 1 letter (string)
Output: 1 string

Example: 
calling with functions with A prints out "90-100"
calling with functions with B prints out "80-89"
calling with functions with F prints out "0-59"
*/


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