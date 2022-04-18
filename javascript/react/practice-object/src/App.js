import React from 'react'
import './App.css';
import MyPets from './MyPets'

const App = () => {

  const pets = [
    {
      id: 1,
      name: "Bucky",
      age: 3,
      fur: "brown",
      favoriteColor: "blue",
      favoriteFood: "beef",
    },
    {
      id: 2,
      name: "Rocky",
      age: 6,
      fur: "grey",
      favoriteColor: "purple",
      favoriteFood: "Portillos",
    },
    {
      id: 3,
      name: "Hank",
      age: 10,
      fur: "blonde",
      favoriteColor: "navy",
      favoriteFood: "peanut butter",
    }
  ]
  

  return (
    <div className='text'>
      <h1>These are my pets!</h1>
      {pets.map(pet => {
        return (
          <MyPets
            key={pet.id} 
            pet={pet}
            cutenessLevel="MAXIMUM"
            expenses={["raw food", "toys", "treats"]}
          />
        )
      })}
      <p> My cutest pet is: {pets[0].name}</p>
      <p> My ugliest and smelliest pet is: {pets[1].name}</p>
      <p> My most un-alive pet is: {pets[2].name}</p>
    </div>
  ) 
}

export default App;