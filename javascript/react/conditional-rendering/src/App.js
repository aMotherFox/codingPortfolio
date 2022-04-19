import React, { useState } from 'react'
import './App.css';


//This is a functional component; AKA create a function that returns JSX

const App = () => {

  // let myName = "Lucas"
  // if (myName === "Lucas") {
  //   return (
  //     <h1>This person's name is Lucas</h1>
  //   )
  // } else {
  //   return null
  // }

  // return myName === "Lucas" && (
  //   <div>
  //     <h1>This person's name is Lucas</h1>
  //   </div>
  // )

  const [myName, setMyName] = useState("Lucas")  //useState is a hook, is calling a fuction

  const handleButtonClick = () => {
    console.log("I WAS CLICKED")
    // myName = "Another name"
    if (myName === "Lucas") {
      setMyName( "another name ") 
    } else {
      setMyName("Lucas")
    }
    console.log("myName: ", myName)
  }

  return (
    <div>
      {/* <h1>Hello There</h1>
      {myName === "Lucas" && (
        <div>
          <p>This person's name is Lucas</p>
        </div>
      )} */}
{/* v This is a ternary and NEEDS an else to go with if */}
      {/* {myName.length === 5 ? (
        <div>
          <p>This name has a length of 5</p>
        </div>
      ) : (
        <div>
          <p>The length of this name is not 5</p>
        </div>
      )} */}
      <p> My name is: {myName}</p>
      <button onClick={handleButtonClick}>Click me!</button> {/*DONT CALL THE FUNCTION HERE*/}
    </div>  
  )



}



//   return (
//     <div className="App">
//       <h1>Hello there</h1>
//       <div>
//         <p>My name is: {myName}</p>
//       </div>
//     </div>
//   );
// }

export default App;


// const color = "blue"

// if (color === "blue" && color.length === 4) { // this the AND OPERATOR
//   console.log("hurray")
// }

// const ternaryResult = color === "blue" ? "yay, you chose blue" : "you did not chose blue"
// console.log("ternaryResult: ", ternaryResult)

// //logical AND operator
// const color2 = color.length === 4 && "black"  //saying 'if everything to the left is true, return "black"
// console.log("color2: ", color2)

// const something = "askjfnkajdnfa"

// if (something) {
//   console.log("yeeeeee")
// }


// class component cannot use hooks, everything must be inside of a method
// functional component HAS to return JSX and is a component that uses a => component
// consts are IMMUTABLE
// to stop something from rendering, return NULL