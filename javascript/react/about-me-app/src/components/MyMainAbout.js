import React from 'react';
import MyInfo from './PersonalInfo.js'
import MyLikes from './MyLikes.js'
import MyDislikes from './MyDislikes.js'
import Logo from './Logo.js'
import Icon from './Icon.js';
import Selfie from './Selfie.js';
import Pets from './Pets.js';

//const Hello 

const details = [
    {
      name: 'Emre',
      age: '28',
      color: 'Brunette',
    }
  ];

const likes = ['animals', 'skincare', 'art']
const dislikes = ['bugs', 'birds', 'cliffhangers']

const pets = [
  {name: 'Bucky', age: '3', gender: "Boy",},
  {name: 'Rocky', age: '6', gender: "Boy",},
  {name: 'Hank', age: '10', gender: "Boy",},
]



const MainComponent = (props) => (
  <div>
    {/* <Icon
    /> */}
    <img src='meandbuck.jpeg' alt='me and Bucky'/>
    <MyInfo
      details={details}
      // likes={likes}
      // dislikes={dislikes}
    />
    <Pets
    pets={pets}
    />
    <MyLikes
      likes={likes}
    />
    <MyDislikes
      dislikes={dislikes}
    />
  </div>
)

export default MainComponent;


// const Footer = () => (
//   <div>
//     <Icon
//     /> 
//   </div>
// )

// export {Footer};

// const LikesAndDislikes = (props) => (
//   <div>
//     <MyLikes/>
//     <MyDislikes/>
//   </div>
// )
// export {LikesAndDislikes};

// const MainComponent = (props) => (
//     <div>
//         <Infos
//       infos={info}
//     />      
//     </div>
//   )
  
// export default MainComponent