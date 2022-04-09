import React from 'react';

const MyInfo = (props) => {
    const listItems = props.details.map((person) => (
      <p key={person.name}>{person.name} is {person.age} years old and is a {person.color}</p>)
    );
    return (
      <div>
        <h3>Welcome to EmrePalooza</h3>
        {listItems}
      </div>
    );
  }
  
  export default MyInfo;