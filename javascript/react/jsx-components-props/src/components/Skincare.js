import React from 'react';

const Skincare = (props) => (
  <div>
    <h3>Best Skincare Brands:</h3>
    {props.skincare.map(skincare => <p key={skincare}>{skincare}</p>)}
  </div>
);

export default Skincare;