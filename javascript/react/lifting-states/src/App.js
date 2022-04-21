import React, { useState } from 'react'
import './App.css';

const App = () => {

  const [temperature, setTemperature] = useState('') // inside () is the intial value/state of your argument you pass in

  const handleChange = (e) => { //you will NEVER use this.____ in s JS function
    setTemperature(e.target.value)
  }

 
 return (
    <fieldset>
      <legend>Enter temperature in Celsius:</legend>
      <input
        value={temperature}
        onChange={handleChange} />
      <BoilingVerdict
        celsius={parseFloat(temperature)} />
    </fieldset>
  );

}

const BoilingVerdict = (props) => {

  return props.celsius >= 100 
  ? (<p>The water would boil.</p>)
  : (<p>The water would not boil.</p>)
}


export default App;
