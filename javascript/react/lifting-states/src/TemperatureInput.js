import React, { useState } from 'react'

const scaleNames = {
    c: 'Celsius',
    f: 'Fahrenheit'
  };
  
const TemperatureInput = (props) => {
    const [temperature, setTemperature] = useState('')

    const handleChange = (e) => {
        setTemperature(e.target.value)
    }

    const scale = props.scale;
  
    return (
    <fieldset>
        <legend>Enter temperature in {scaleNames[scale]}:</legend>
        <input value={temperature}
                onChange={handleChange} />
    </fieldset>
    );
    
}


export default TemperatureInput