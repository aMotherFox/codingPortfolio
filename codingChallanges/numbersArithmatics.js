/* class MathNum
Find the largest and smallest number in a list 
Assume the list size is X - you can't hard code it...
Assume the items in the list are NOT in order
Assume the items in the list could very well be negative, decimal numbers
ex: [50, -2, 0, 100, 7....]

Expected output: 
Largest number: 100
Smallest number: -2

*/

const numbers = [1, -100, 2, 0, 100, 7, 150, -40, -900000]

// find largest number
let largestNumber = numbers[0]

numbers.forEach(number => {
    console.log("number ", number)
    console.log("current largest number: ", largestNumber)

    if (number > largestNumber) {
        console.log("number: ", number, " is greater than: ", largestNumber)
        largestNumber = number
    }
    console.log("---- ending loop! ---- ")
})
console.log(">>>> largestNumber: ", largestNumber)

// find me the smallest number
console.log("...... SMALLEST NUMBER!!!!! .....")
let smallestNumber = numbers[0]

numbers.forEach(number => {
    console.log("number: ", number)
    console.log("current smallest number: ", smallestNumber)

    if (number < smallestNumber) {
        console.log(`number: ${number} is smaller than: ${smallestNumber}`)
        smallestNumber = number
    }

})
console.log(`smallestNumber: ${smallestNumber}`)








//MinMax
const largest = _.max(numbers);
console.log("largest: ", largest);

const smallest = _.min(numbers);
console.log("smallest: ", smallest);