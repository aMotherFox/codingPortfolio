JSX, Components, Props:


---------JSX----------
JSX looks like HTML but is imported from React
You cannot render more than one JSX element in the same render return
    * you CAN wrap JSX elements within other elements E.G.
    * can only render with built in components like div, li, p, etc
        - render() {
            return (
                <div>
                    <p>Hello world!! I am wrapped</p>
                    <h3> I am still wrapper </h3>
                </div>
            )
            }        //p and h3 are WRAPPED in the div, so they can both be in the return



** user-defined components MUST be capitalized 
** props default to TRUE


---------Components----------
ALWAYS START COMPONENT NAME WITH CAPITAL LETTER
    *react treats components starting with lower case letters as DOM tags
Components use XML-like syntax
Can maintain its own internal state
Let you split UI into independant, reusable pieces
    * it thinks about each piece in isolation
Conceptually, components are like JS functions
    *the accept inputs called "props" and return React elements


Define component with JS Function:
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}



Define component with an E26 class:
class Welcome extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}



If a component is going to be reused (like button, panel, avatar)(App, feedstory, comment), it is good to be extracted to a separate component

All react components MUSt be pure functions. You should not be changing the inputs