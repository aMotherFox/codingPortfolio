import React from 'react';

import SuperPeople from './SuperPeople.js'
import Restaurants from './Restaurants.js'
import Pets from './Pets.js'
import Skincare from './Skincare.js'

const superPeople = [
  {
    name: 'Thanos',
    power: 'The Snap!'
  },
  {
    name: 'Iron Man',
    power: 'Intelligence x 3000'
  },
  {
    name: 'Dr Strange',
    power: 'the Time Stone'
  }
];

const restaurants = ['Cosmic Stones Wings', 'BK', 'Rye of Agamotto']


const pet = [
    {
      name: 'Bucky',
      status: 'Cute',
      color: 'Brown',
    },
    {
      name: 'Rocky',
      status: 'Ugly',
      color: 'Grey',
    },
    {
      name: 'Hank',
      status: 'Dead',
      color: 'Blond',
    }
  ];

const skincare = ['COSRX', 'Dr. Jart+', 'Dear Klaris']


const MainComponent = (props) => (
  <div>
    <SuperPeople
      superPeople={superPeople}
    />
    <Restaurants
      restaurants={restaurants}
    />
    <Pets
      pets={pet}
    /> 
    <Skincare
      skincare={skincare}
    /> 
  </div>
)

export default MainComponent;


