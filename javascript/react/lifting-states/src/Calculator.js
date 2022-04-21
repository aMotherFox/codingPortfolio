import React, { useState } from 'React'
import TemperatureInput from './TemperatureInput'
import BoilingVerdict from './BoilingVerdict'

const Calculator = () => {

    const [temperature, setTemperature] = useState('') // inside () is the intial value/state of your argument you pass in
  
    const handleChange = (e) => { //you will NEVER use this.____ in s JS function
      setTemperature(e.target.value)
    }
  
   
   return (
    <div>
    <TemperatureInput scale="c" />
    <TemperatureInput scale="f" />
  </div>
    );
  
  }
  


export default Calculator;