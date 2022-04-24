import React, { useState } from 'react';
import './App.css';
import './index.css';

const App = () => {

  const [coinPickedMessage, setCoinPickedMessage] = useState('') //when you change a state, it will only re-render that part of them DOM
  const [messageColor, setMessageColor] = useState("blue")
  
  const handleCoinPicked = (coinValue) => { //coinValue is now "heads"

    const randomNumber = Math.floor(Math.random() * 2); //randomNumber is 0 or 1 because of math.
    console.log("randomNumber:", randomNumber)
    const result = randomNumber === 1 ? "heads" : "tails" // ? = if, : = else
    console.log("")
    console.log("result", result)
    if (coinValue === result){
      setCoinPickedMessage(`You Picked ${coinValue}, CPU picked ${result}, You WON!`)
      setMessageColor("red")
    } else {
      setCoinPickedMessage(`You Picked ${coinValue}, CPU picked ${result}, You LOST!`)
      setMessageColor("blue")
    }
    
  }

  //when i click a coin, tell me what coin was clicked
  //randomize a CPU coin result
  //figure out whether i won or lost
    //if my coin === the random coin result, i won, otherwise I lost
  //dislay the proper message depending if i won or lost

  //----------------------------- game 2 ----------------------------------
  const [weaponPickedMessage, setWeaponPickedMessage] = useState('')
  const [messageColor2, setMessageColor2] = useState("blue")
  
  const handleWeaponPicked = (weaponValue) => {
    const randomNumber = Math.floor(Math.random() * 3); 
    console.log("randomNumber:", randomNumber)
    // const result = randomNumber === 1 ? "paper" : "rock" // ? = if, : = else
    let result = randomNumber 
    if(randomNumber === 0){
      result = 'rock'
    } else if (randomNumber === 1){
      result = 'paper'
    } else if (randomNumber === 2){
      result = 'scissors'
    }

    
    console.log("")
    console.log("result", result)
  
  if(weaponValue === 'rock') {
    if(result === 'rock') {
      setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, TIE!`)
      setMessageColor2("yellow")
    } else if (result === 'paper') {
      setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, YOU LOSE!`)
      setMessageColor2("red")
    } else if (result === 'scissors') {
      setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, YOU WIN!`)
      setMessageColor2("green")
    }
  } else if (weaponValue === 'paper') {
    if(result === 'rock') {
       setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, YOU WIN!`)
       setMessageColor2("green")
    } else if (result === 'paper') {
      setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, TIE!`)
      setMessageColor2("yellow")
    } else if (result === 'scissors') {
      setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, YOU LOSE!`)
      setMessageColor2("red")
    }  
  } else if (weaponValue === 'scissors') {
    if(result === 'rock') {
      setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, YOU LOSE!`)
      setMessageColor2("red")
    } else if (result === 'paper') {
       setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, YOU WIN!`)
       setMessageColor2("green")
    } else if (result === 'scissors') {
      setWeaponPickedMessage(`You picked ${weaponValue}, CPU picked ${result}, TIE!`)
      setMessageColor2("yellow")
    }  
  }
  
}
  
  //--------------------------------- return --------------------------------

  return (
    <div>
      <header className='header'>Heads or Tails?</header>
      <h2 id='htwo'>Test your luck!</h2>
      <div id="coin-flip">
          <div onClick={(e) => handleCoinPicked("heads")}> {/* anonymus function */}
          	<img style={{width:350}}
              alt='heads coin' 
              src='https://i.ebayimg.com/images/g/xtcAAOSwLwBaZigS/s-l400.jpg'
              className='heads-coin' 
            />
          </div>
          <div onClick={(e) => handleCoinPicked("tails")}>
            <img style={{width:350}}
              alt='tails coin' 
              src='https://i.ebayimg.com/images/g/wGEAAOSwYu1crzzn/s-l400.jpg' 
              className='tails-coin' 
          	/>
      		</div>
        </div>
        <div style={{backgroundColor: 'black'}} >
          <p id='final-message' 
          style={{color: messageColor}}>{coinPickedMessage}</p>
        </div>
{/*------------------------------- game 2 ----------------------------------- */}
    {/* ROCK PAPER SCISSORS */}
      <h3 id='rps'>Rock + Paper + Scissors</h3>
      <div id="second-game">
          <div onClick={(e) => handleWeaponPicked("paper")}> {/* anonymus function */}
          	<img src="paper.png" 
            alt="paper"
            id='paper'
            />
          </div>
          <div onClick={(e) => handleWeaponPicked("rock")}>
            <img src="rock.png" 
            alt="rock"
            id='rock'
            />
      		</div>
          <div onClick={(e) => handleWeaponPicked("scissors")}>
            <img src="scissors.png" 
            alt="scissors"
            id='scissors'
            />
      		</div>
        </div>
        <div style={{backgroundColor: 'purple'}} >
          <p id='final-message'
          style={{color: messageColor2}}>{weaponPickedMessage}</p>
        </div>
    </div>
  );
}
console.log("I am after the return")

export default App;
