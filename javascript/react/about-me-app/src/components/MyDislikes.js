import React from 'react';

const MyDislikes = (props) => (
  <div className="likes-dislikes">
    <h3>Dislikes:</h3>
    {props.dislikes.map(dislikes => <li key={dislikes}>{dislikes}</li>)}
  </div>
);

export default MyDislikes;