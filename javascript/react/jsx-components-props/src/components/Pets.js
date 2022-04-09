import React from 'react';

const Pets = (props) => {
  const listItems = props.pets.map((pet) => (
    <p key={pet.name}>{pet.name} is {pet.status} and {pet.color}</p>)
  );
  return (
    <div>
      <h3>My Pets</h3>
      {listItems}
    </div>
  );
}

export default Pets;