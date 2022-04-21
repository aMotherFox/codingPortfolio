import React from 'react';
import './App.css';
import BoilingVerdict from './BoilingVerdict';
import TemperatureInput from './TemperatureInput';

const scaleNames = {
    c: 'Celsius',
    f: 'Fahrenheit'
};
  
const TemperatureInput = (props) => (
    <fieldset>
        <legend>Enter temperature in {scaleNames[props.scale]}:</legend>
        <input value={temperature}
               onChange={this.handleChange} />
    </fieldset>
)

export default TemperatureInput