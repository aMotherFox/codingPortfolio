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
/*
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
*/



//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

const piano = {
  type: "instrument",
  keys: 100,
  sings: false,
  songs: ["classical", "musical", "ragtime"],
  electric: undefined,
  recitals: null,
  color: "black",
  pedals: 3,
  uses: ["music class", "church", "concerts"],
  woodworker: undefined,
}
console.log("piano: ", piano)



const vehicle = {
	type: "car",
  doors: 4,
  electric: false,
  gas: true,
  color: "blue",
  build: "honda",
  year: 2018,
  miles: undefined,
  ammenities: ["radio", "bluetooth", "heating"],
  passangers: null,
}
console.log("vehicle: ", vehicle)



const sewingMachine = {
	type: "intermmediate",
  patterns: 30,
  electric: true,
  color: "white",
  fabric: ["cotton", "vinyl", "knit"],
  brand: "Brother",
  year: 2013,
  projects: undefined,
  password: null,
  accessories: ["shears", "pins", "ruler"]
}
console.log("sewingMachine: ", sewingMachine)




const getPianoKeys = (pianoVar) =>{
  const pianoKeys = pianoVar.keys
  return pianoKeys
}
const getPianoUses = (pianoVar2) =>{
  const pianoUses = pianoVar2.uses
  return pianoUses
}
const getPianoColor = (pianoVar3) =>{
  return pianoVar3.color
}
const getVehicalType = (vehicalVar) =>{
  return vehicalVar.type
}
const getVehicalFuel = (vehicalVar2) =>{
  return vehicalVar2.electric
}
const getVehicalDoors = (vehicalVar3) =>{
  return vehicalVar3.doors
}
const getSewingBrand = (sewingVar) =>{
  return sewingVar.brand
}
const getSewingProjects = (sewingVar) =>{
  return sewingVar.projects
}
const getSewingFabric = (sewingVar) =>{
  return sewingVar.fabric
}
const getSewingPassword = (sewingVar) =>{
  return sewingVar.password
}




const getPianoPedals = (pianoVar) =>{
	pianoVar.pedals = 4
  return pianoVar.pedals
}
const getPianoRecitals = (pianoVar) =>{
	pianoVar.recitals = "October"
  return pianoVar.recitals
}
const getPianoSongs = (pianoVar) =>{
	pianoVar.songs = ["classical", "musical", "ragtime", "jazz"]
  return pianoVar.songs
}
const getVehicalMiles = (vehicalVar) =>{
	vehicalVar.miles = 25000
  return vehicalVar.miles
}
const getVehicalPassangers = (vehicalVar) =>{
	vehicalVar.passangers = 2
  return vehicalVar.passangers
}
const getVehicalAmmenities = (vehicalVar) =>{
	vehicalVar.ammenities = ["radio", "bluetooth", "heating", "A/C"]
  return vehicalVar.ammenities
}
const getVehicalBuild = (vehicalVar) =>{
	vehicalVar.build = "Subaru"
  return vehicalVar.build
}
const getSewingType = (sewingVar) =>{
	sewingVar.type = "Beginner"
  return sewingVar.type
}
const getSewingAccessories = (sewingVar) =>{
	sewingVar.accessories = ["shears", "pins", "ruler", "thread", "bobbin"]
  return sewingVar.accessories
}
const getSewingColor = (sewingVar) =>{
	sewingVar.color = "white plus pokemon stickers"
  return sewingVar.color
}





const ourPiano = getPianoKeys(piano)
console.log("How many piano keys: ", ourPiano)

const ourPiano2 = getPianoUses(piano)
console.log("What are the piano uses: ", ourPiano2)

const ourPiano3 = getPianoColor(piano)
console.log("What is the color: ", ourPiano3)

const ourVehical = getVehicalType(vehicle)
console.log("What type of vehicle: ", ourVehical)

const ourVehical2 = getVehicalFuel(vehicle)
console.log("Is the car electric: ", ourVehical2)

const ourVehical3 = getVehicalDoors(vehicle)
console.log("How many doors: ", ourVehical3)

const ourSewing = getSewingBrand(sewingMachine)
console.log("What brand of sewing machine: ", ourSewing)

const ourSewing2 = getSewingProjects(sewingMachine)
console.log("What are our projects: ", ourSewing2)

const ourSewing3 = getSewingFabric(sewingMachine)
console.log("What material can it use: ", ourSewing3)

const ourSewing4 = getSewingPassword(sewingMachine)
console.log("What is the password: ", ourSewing4)


console.log("--------- AFTER field change -----------")



const ourPiano4 = getPianoPedals(piano)
console.log("What is our new number: ", ourPiano4)

const ourPiano5 = getPianoRecitals(piano)
console.log("When is the recital: ", ourPiano5)

const ourPiano6 = getPianoSongs(piano)
console.log("What genres of songs: ", ourPiano6)

const ourVehical4 = getVehicalMiles(vehicle)
console.log("How many miles: ", ourVehical4)

const ourVehical5 = getVehicalPassangers(vehicle)
console.log("How many passangers: ", ourVehical5)

const ourVehical6 = getVehicalAmmenities(vehicle)
console.log("What are the ammenities: ", ourVehical6)

const ourVehical7 = getVehicalBuild(vehicle)
console.log("What is the car build: ", ourVehical7)

const ourSewing5 = getSewingType(sewingMachine)
console.log("What is the level of machine: ", ourSewing5)

const ourSewing6 = getSewingAccessories(sewingMachine)
console.log("What are the accessories: ", ourSewing6)

const ourSewing7 = getSewingColor(sewingMachine)
console.log("What color is the sewing machine: ", ourSewing7)