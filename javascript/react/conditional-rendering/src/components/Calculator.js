import React from 'react';
import './App.css';
import BoilingVerdict from './BoilingVerdict';
import TemperatureInput from './TemperatureInput';

class Calculator extends React.Component {
    constructor(props) {
      super(props);
      this.handleChange = this.handleChange.bind(this);
      this.state = {temperature: ''};
    }
  
    handleChange(e) {
      this.setState({temperature: e.target.value});
    }
  
    render() {
      const temperature = this.state.temperature;
      return (
        <fieldset>
          <legend>Enter temperature in Celsius:</legend>
          <input
            value={temperature}
            onChange={this.handleChange} />
          <BoilingVerdict
            celsius={parseFloat(temperature)} />
        </fieldset>
      );
    }
  }

















//This class has 3 function/METHODS; a function inside of a class is called a METHOD
class Calculator extends React.Component { //everything within curlies is withinin scope
    constructor(props) {//start of new scope, constructor is a function that is passing in props
      super(props); //super is a function call inside the constructor;() means function
      this.handleChange = this.handleChange.bind(this); //handleChange is a method below
      this.state = {temperature: ''};
    }
  
    handleChange(e) { //also a function
      this.setState({temperature: e.target.value}); // this means the class its inside of basically, setState is a function that is taking in the ( values)
    }
  
    render() { //also a method
      const temperature = this.state.temperature;
      return ( //return is a method, is returning JSX
        <fieldset>
          <legend>Enter temperature in Celsius:</legend>
          <input
            value={temperature} //all props within JSX components, props are OJECTS, value is the prop KEY
            onChange={this.handleChange} /> //is a method calling in handleChange, e stands for EVENT
          <BoilingVerdict //a component, meaning that celsius is a prop
            celsius={parseFloat(temperature)} /> //temp was an empty string, a float is a different data type of number, parseFloat takes in a string and returns a number, parsing/casting refer to taking something from one type and changing it to another type
        </fieldset>
      );
    }
}
  
  










