/*
    Create 5 different user objects
        - each with at least 5 different fields
        - 1 field must be `age`
        - 1 field must be `salary`
        - 1 field must be `favoriteColor
        - 1 field must be `luckyNumber` // at least one person must have 7

    Create a function for each of the following problems (each function must be called once per user):

    1. Give me a list of all the users (entire object) who are about to retire (older than 59)
    2. Give me a list of al the users who are not allowed to drink (younger than 21)
    3. Give me a list of users that underpaid (anyone who makes less than 30000)

    4. Tell me the total $ we spend on employee salaries per year (total of all salaries)
        // output is a number
    5. Tell me the total amount of people who like the color "red"
        // output is a number
    6. Tell me the first (and only) person whose lucky number is 7
        // output is an object

    Input for all of them: list of objects (list of users)
    Output: depends on the ask (list, number, object)

*/

// example:
const user1 = {
    name: "lucas",
    // add required fields like age, salary, favoriteColor, luckyNumber
}
// add 4 more users

// create 6 functions as mentioned above

// call each function once, passing in your list of users





const user1 = {
    name: "Felix",
    age: 60,
    salary: 60000,
    favoriteColor: "Purple",
    luckyNumber: 7
}
const user2 ={
    name: "Lucas",
    age: 28,
    salary: 100000,
    favoriteColor: "Red",
    luckyNumber: 5,
}
const user3 ={
    name: "Emre",
    age: 28,
    salary: 10,
    favoriteColor: "Black",
    luckyNumber: 6,
}
const user4 ={
    name: "Victoria",
    age: 26,
    salary: 10,
    favoriteColor: "Pink",
    luckyNumber: 9,
}
const user5 ={
    name: "Bucky",
    age: 2,
    salary: 100,
    favoriteColor: "Blue",
    luckyNumber: 2,
}



const users = [user1, user2, user3, user4, user5]
console.log("users: ", users)
console.log("-------- ALL USERS/OBJECTS-----------")
const listOfUsersRetiringSoon = []

//print users over 59
const getUsersRetiringSoon = (listOfUsers) => {
	listOfUsers.forEach(theUserImIteratingOn => {

	// console.log("theUserImIteratingOn", theUserImIteratingOn)
	const userAge = theUserImIteratingOn.age
  // console.log("userAge", userAge)
  
  if (userAge > 59){
  	listOfUsersRetiringSoon.push(theUserImIteratingOn)
  }
  
  
})
return listOfUsersRetiringSoon
}

const soonToRetire = getUsersRetiringSoon(users)
console.log("soon to retire", soonToRetire)
console.log("-------- ALL USERS TO RETIRE-----------")



const listOfUsersUnder21 = []

//print users over 59
const getUsersUnder21 = (listOfUsers) => {
	listOfUsers.forEach(theUserImIteratingOn => {

	// console.log("theUserImIteratingOn", theUserImIteratingOn)
	const userAge = theUserImIteratingOn.age
  // console.log("userAge", userAge)
  
  if (userAge < 21){
  	listOfUsersUnder21.push(theUserImIteratingOn)
  }
  
  
})
return listOfUsersUnder21
}

const soonToDrink = getUsersUnder21(users)
console.log("Who cannot drink", soonToDrink)

console.log("-------- ALL USERS UNDER 21----------")





const listOfUsersUnderpaid = []

//print users over 59
const getUsersUnderpaid = (listOfUsers) => {
	listOfUsers.forEach(theUserImIteratingOn => {

	// console.log("theUserImIteratingOn", theUserImIteratingOn)
	const userSalary = theUserImIteratingOn.salary
  // console.log("userAge", userAge)
  
  if (userSalary < 30000){
  	listOfUsersUnderpaid.push(theUserImIteratingOn)
  }
  
  
	})
	return listOfUsersUnderpaid
}

const needsARaise = getUsersUnderpaid(users)
console.log("Uses who need a raise", needsARaise)


console.log("-------- ALL USERS UNDER WHO NEED A RAISE----------")




const getTotalSpentOnSalaries = (listOfUsers) => {
	let finalSum = 0
	listOfUsers.forEach(theUserImIteratingOn => {
        const userSalary = theUserImIteratingOn.salary
        finalSum = finalSum + userSalary

	// console.log("theUserImIteratingOn", theUserImIteratingOn)

 
  
	})
	return finalSum
}

const salaryTotal = getTotalSpentOnSalaries(users)
console.log("Total spent on salaries", salaryTotal)


console.log("-------- TOTAL OF ALL SALARIES----------")


const usersThatLikeRed = (listOfUsers) => {
	return listOfUsers.filter(user => user.favoriteColor === "Red")
}

const redEnthusists = usersThatLikeRed(users)
console.log("Users that like red: ", redEnthusists)



console.log("-------- USERS THAT LIKE RED----------")


const usersThatLikeSeven = (listOfUsers) => {
	return listOfUsers.filter(user => user.luckyNumber === 7)
}
const sevenEnthusists = usersThatLikeSeven(users)[0]
console.log("Users whose lucky numbers is 7: ", sevenEnthusists)



console.log("-------- USERS THAT LIKE SEVEN----------")