import React, { useState } from 'react';
import './App.css';
import './index.css';
// import HeadsCoin from './images/HeadsCoin';
// import TailsCoin from './images/TailsCoin';

const App = () => {
  
  const [headsPicked, setHeadsPicked] = useState('')
  // console.log("headsPicked", headsPicked)

  const [tailsPicked, setTailsPicked] = useState('')

  // const headsSelection = () => {
  //   if ( headsPicked === true ) {
  //     setHeadsPicked('You picked heads!')
  //   } else {
  //     setHeadsPicked('You picked tails!')
  //   } 
  // }

  // const tailsSelection = () => {
  //   if ( tailsPicked === true ) {
  //     setTailsPicked('You picked tails!')
  //   } else {
  //     setTailsPicked('You picked heads!')
  //   }
  // }
  console.log("I am in the app")

  return (
    <div>
      <header className='header'>Heads or Tails?</header>
      <h2>Click One!</h2>
      <div>
          <img style={{width:350}}
          alt='heads coin' 
          src='https://i.ebayimg.com/images/g/xtcAAOSwLwBaZigS/s-l400.jpg' 
          />
      </div>
      <div>
        <img style={{width:350}}
          alt='heads coin' 
          src='https://i.ebayimg.com/images/g/wGEAAOSwYu1crzzn/s-l400.jpg' 
        />
      </div>
    </div>
  );
}
console.log("I am after the return")

export default App;
