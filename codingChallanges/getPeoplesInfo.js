/*
    Each person object should have at least 10 different fields 
        - at least 1 field of each data type you know, minus object/function
        Data types:
            - String
            - Number
            - Boolean
            - Null
            - Undefined
            - List(array)
            

    Create at least 3 objects, pass them in as you want


    1. Create functions that will take in an object
    Each function will return me a different field (should have 10 min in total), one function per field

    2. Create functions that will take in an object, and a field change
    Each function will return my updated object


    Examples:

    1. function a
    input: 1 person object
    output: person first name (string)

    function b
    input: 1 person object
    output: person last name (string)

    2. function a
    input: 1 person object, 1 string (newName)
    output: 1 person (which has an updated name)

*/
const piano = {
  type: "instrument",
  keys: 100,
  sings: false,
  songs: ["classical", "musical", "ragtime"],
  electric: undefined,
  recitals: null,
  electric: false,
  pedals: 3,
  uses: ["music class", "church", "concerts"],
  woodworker: undefined,
}
console.log("piano: ", piano)
//----------------------------------------
//this function take in a single piano object and it returns its type
const getPianoKeys = (pianoVar) =>{
  console.log("pianoVar: ", pianoVar)
  const pianoKeys = pianoVar.keys
  return pianoKeys
}
const getPianoType2 = (pianoVar) =>{
  console.log("pianoVar: ", pianoVar)
  return pianoVar.type
  }


const ourPiano = getPianoKeys(piano)
console.log("ourPiano: ", ourPiano)
//a function should be reusable, don't call varibles inside the function that were creadted before, do call the variable that was passed in
//pass in entire objects rather than fields
//console log the result from the function