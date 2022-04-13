import React from 'react'
import './App.css';

const MyPets = ({ pet, cutenessLevel, expenses }) => {
    return (
        <div id="text">
            <p>My pet's name: {pet.name}</p>
            <p>My pet's age: {pet.age}</p>
            <p>My pet's favorit food: {pet.favoriteFood}</p>
            <p>My pet's fur: {pet.fur}</p>
            <p>cutenessLevel: {cutenessLevel}</p>
            <div>
                <p>Expenses:</p>
                {expenses.map(expense => (
                    <p>expense: {expense}</p>
                ))}
            </div>
            <hr />
        </div>
    ) 
}
export default MyPets;



const pets = {
    smarts: "genius",
    beauty: "gorgeous",
    talent: "unmeasureable",
}

const {smarts, beauty, talent} = pets

const petBrain = pets.smarts