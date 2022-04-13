import React from 'react'
import './App.css';
import MyPets from './MyPets'



const App = () => {
  

  const pets = [
    {
      name: "Bucky",
      age: 3,
      fur: "brown",
      favoriteColor: "blue",
      favoriteFood: "beef",
    },
    {
      name: "Rocky",
      age: 6,
      fur: "grey",
      favoriteColor: "purple",
      favoriteFood: "Portillos",
    },
    {
      name: "Hank",
      age: 10,
      fur: "blonde",
      favoriteColor: "navy",
      favoriteFood: "peanut butter",
    }
  ]
  

  return (
    <>
    <h1 id="text">These are my pets!</h1>
    {pets.map(pet => {
      return (
        <MyPets 
          pet={pet}
          cutenessLevel="MAXIMUM"
          expenses={["raw food", "toys", "treats"]}
        />
      )
    })}
    <p id="text"> My cutest pet is: {pets[0].name}</p>
    <p id="text"> My ugliest and smelliest pet is: {pets[1].name}</p>
    <p id="text"> My most un-alive pet is: {pets[2].name}</p>
    </>
  ) 
}

export default App;