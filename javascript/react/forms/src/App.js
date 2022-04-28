import React, {useState} from 'react'
import './App.css';

const App = () => {


  const initialPereson = ({
    firstName: "Bucky",
    lastName: "Cagatay",
    age: 3,
    favoriteColor: "blue",
    aboutMe: "cuter than rocky",
    favoriteIceCream: "peanut butter",
  })

  const [person, setPerson] = useState(initialPereson)

  const handleSubmit = (e) => {
    e.preventDefault()

    const typedFirstName = e.target.elements.thisIsTheNameICreated.value
    const typedLastName = e.target.elements.thisIsTheLastName.value
   

    setPerson({
      firstName: typedFirstName,
      lastName: typedLastName,
      age: e.target.elements.age.value,
      favoriteColor: e.target.elements.favoriteColor.value, //coming out of event
      aboutMe: e.target.elements.aboutMe.value,
      favoriteIceCream: e.target.elements.favoriteIceCream.value,
      isHungry: e.target.elements.isHungry.value,
      gender: e.target.elements.gender.value,
    })
  }

  return (
    <div className="App">
      <h1>This is my form!</h1>

      <form onSubmit={handleSubmit}>
        <p>First Name</p>
        <input type={"text"} name="thisIsTheNameICreated"/> {/*property name is = {} */}

        <p>Last Name</p>
        <input type={"text"} name="thisIsTheLastName"/>

        <p>Your Age</p>
        <input type={"text"} name="age"/>

        <p>About me</p>
        <textarea name="aboutMe"></textarea>

        <p>Favorite Ice Cream</p>
        <select name="favoriteIceCream">
          <option value="mint">Mint</option>
          <option value="chocolate">Chocolate</option>
          <option value="peanutbutter">Peanut Butter</option>
          <option value="vanilla">Vanilla</option>
        </select>

        <p>Are you hungry? <input type={"checkbox"} name="isHungry"/></p>
        <p>Are you thirsty? <input type={"checkbox"} name="isThirsty"/></p>
        
        <div>
          <p>Choose your gender</p>
          <input type="radio" value="male" name="gender" /> Male
          <input type="radio" value="female" name="gender" /> Female
          <input type="radio" value="other" name="gender" /> Other
        </div>

        <div>
          <button>Click Me!</button>
        </div>

        <div>
          <p>My name is: {person.firstName} {person.lastName} with age: {person.age} </p>
          <p>My favorite color is: {person.favoriteColor}</p>

          <h2>About me...</h2>
          <p>{person.aboutMe}</p>

          <h3>Favorite Ice Cream</h3>
          <p>{person.favoriteIceCream}</p>

          <h2>Hunger Status: {person.isHungry ? "YES" : "no"}</h2>

          <h2>Choose gender: {person.gender}</h2>

        </div>
      </form>

    </div>
  );
}

export default App;

//do NOT need a form for todo app
// benefits of forms: removes two onClicks from the code and simplify the code AND automatically hit enter to submit