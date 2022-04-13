import React from 'react'
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
    <h1>These are my pets!</h1>
    {pets.map(pet => {
      return (
        <MyPets 
          pet={pet}
          cutenessLevel="MAXIMUM"
          expenses={["raw food", "toys", "treats"]}
        />
      )
    })}
    </>
  ) 
}

export default App;