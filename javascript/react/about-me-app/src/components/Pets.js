import React from 'react';

const Pets = (props) => {
    const listItems = props.pets.map((pets) => (
      <p class="pets-info" key={pets.name}>{pets.name} is {pets.age} years old and is a {pets.gender}</p>)
    );
    return (
      <div>
        <h3 class ="my-kids">My Furry Kids</h3>
        {listItems}
      </div>
    );
  }

export default Pets