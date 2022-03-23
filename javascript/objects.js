/*
OBJECTS:
*/

//WRONG class object example
class Person(
    const name
    const age 

    const eat = () => {}
)


//RIGHT class object example
const pet = { 
    //inside curlies need KEY: VALUE pairs
    name: "Bucky",  //name is the key, "Bucky" is the value
    age: 2,
    isFat: false,
    color: null,
    furTexture: undefined,
    personality: "10/10",
    toys: ["frisbee", "ball", "plushies", "kong"],
}
console.log("pet: ", pet) //will print out all that data ^

//BETTER WAY
const buckyAge = pet["age"] // how to get same VALUE another way as above 
console.log("Bucky age: ", buckyAge) //will print out only age

//BEST WAY
const buckyAge = pet.age //key + dot will let you access any field
console.log("Bucky age: ", buckyAge)

const buckyToys = pet.toys
console.log("Bucky toys: ", buckyToys) // will give array

const firstToy = buckyToys[0]
console.log("firstToy: ", firstToy) // will give only first toy in array






// Change an object's fields
pet.age = 4 //telling code to assign 4 to the pet age
console.log("Pet after changing age:", pet) //will print out everything with the reassigned age

pet.isFat = true
console.log("pet after changing isFat: ", pet) //will print out everything with the reassigned fat




//create NEW objects from other objects
//wrong way
const pet2 = pet
console.log("pet2: ", pet2) //will be identical to pet

pet2.name = "Rocky"
console.log("pet after changing pet name: ", pet)
console.log("pet2 after changing pet2 name: ", pet2) //changes pet2 AND pet, computer is reading it as the same pet with an additional alias of Rocky; it is a REFERENCE, not true new object

const pet3 = { //notice no pet3 = pet like above
        name: "Nieve"
        ...pet //is saying to take all the the fields from pet and add it to this new object, called SPREADING
}
console.log("pet3: ", pet3) //will NOT change pet2 or pet, computer is reading it as a new object with imported fields

pet3.name = "Hank"
pet3.age = 6
pet3.color = "Blonde"
pet3.furTexture = "course"
console.log("pet3 after many changes: ", pet3) //chages only the applicible new fields, will give all the other fields unchanged


// OVER WRITING FIELDS
const pet4 = {
    age: 10, //age will NOT change because the spread is below, so the spread will overwrite age: 10
    stinkLevel: 100, //will NOT be overwritten because it is new, will come out on console whereever its placed, so here it comes after age
    ...pet3, //called SPREADING, everything before spread will be overwritten UNLESS its a new field
    height: "small", //also new field that will not be overwritten
    name: "Bob", 
}
console.log("pet4: ", pet4) //has the exact same fields as pet 3, but the name is overwritten, you can only overwrite fields that ALREADY existed






// ---------------------------------- LUCAS NOTES ------------------------------------- 
// Object notes 

/*
    Objects!!!!!
*/

const pet = {
    // need KEY: VALUE pairs
    name: "Nieve",
    age: 3,
    isFat: true,
    color: null,
    furTexture: undefined,
    personality: "0/10",
    toys: ["ball", "hedgehog", "mouse"]
}

console.log("pet: ", pet)

// Access values by their key
const nieveAge1 = pet.age
console.log("nieveAge1: ", nieveAge1)

const nieveAge2 = pet['age']
console.log("nieveAge2: ", nieveAge2)

const nieveToys = pet.toys
console.log("nieveToys: ", nieveToys)

const firstToy = nieveToys[0]
console.log("firstToy: ", firstToy)

console.log("pet after reading... ", pet)

console.log("-----------Change an object's fields")
pet.age = 4
console.log("pet after changing age: ", pet)

pet.isFat = false
console.log("pet after changing isFat: ", pet)


console.log("----------- create NEW objects from other objects")
const pet2 = pet
console.log("pet2: ", pet2)

pet2.name = 'Bucky'
console.log("pet after changing pet2 name: ", pet)
console.log("pet2 after changing pet2 name: ", pet2)

const pet3 = {
    ...pet // spreading
}
console.log("pet3: ", pet3)

pet3.name = "Rocky"
console.log("pet3 after changing pet3 name: ", pet3)
console.log("pet after changing pet3 name: ", pet)

pet3.name = "Hank"
pet3.age = 6
pet3.color = "blue"
pet3.furTexture = "extremelly hairy"
console.log("pet3 after many changes: ", pet3)

console.log("-------------- overwritting fields ----------")
const pet4 = {
    stinkLevel: 100,
    age: 10,  // this age will get over written by pet3 when spread below
    ...pet3,
    height: 80,
    name: "Bob" // you can only overwrite fields that ALREADY existed
}
console.log("pet4: ", pet4)