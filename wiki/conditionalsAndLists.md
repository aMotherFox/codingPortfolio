******************** STYLING *********************

Inline styling:
    - most direct way to style react
    - styling elements inline doesn't require you to create a separate style sheet
        *style is applied directly to the elements which means they have a higher precedence; inline OVERRIDES other style rules applied to the same element
    - is best for small applications as the code becomes very bulky very fast
    - CANNOT write animations, style nested elements, or use psuedo-classes/elements
    - to style an element with inline style, the value must be a JS object
    - in JSX, JS expressions are written inside curly braces, and since JS objects also use curlies, the styling is writen inside two sets of curlies; {{ }}
    - written in camel case (backgroundColor instead of backround-color)

i.e.)
export default function App() {
  return (
    <section
      style={{
        fontFamily: '-apple-system',
        fontSize: "1rem",
        fontWeight: 1.5,
        lineHeight: 1.5,
        color: "#292b2c",
        backgroundColor: "#fff",
        padding: "0 2em"
      }}
  );
}

PROS:
-quickest way to write styles
-good for prototyping (write inline and then move to stylesheet)
-has great preference (can override styles from a stylesheet)

CONS:
-tedious to convert plain CSS to inline styles
-lots of inline makes JSX unreadable
-cannot use basic CSS features like animations, selectors, etc
-does not scale well







CSS StyleSheet:
    - CSS StyleSheets are regularly improving because there is always an improving set of features available through CSS
    - Features like; storing dynamic values, advanced selectors to select child elements with precision, and new psuedo-classes like :is and :where
    - will be applied to any children elements
    - written with hyphen (backround-color instead of backgroundColor)
    - write CSS in a separate file and import it into your application

i.e.)
imprort src/styles.css

PROS:
-gives all tools of modern CSS
-helps clean up our component files from inline styles

CONS:
-need to set up vendor preficing to ensure latest features work for all users
-requires more typing than other CSS libraies (i.e. SASS)
-stylesheet cascades to compoenent and all children; not scoped
-must use reliable naming convention to ensure styles don't conflict







******************** CONDITIONAL RENDERING *********************

In React, you can create distinct components that encapsulate behavior you need. Then, you can render only some of them, depending on the state of your application
The process of delievering elements and components based on certain conditions
    i.e. only showing log in button when not logge in, and only showing log out button when logged in

Conditional Rendering refers to changing the behavior of an app depending on its state, i.e. automatically changing the display to dark at night

Types: 
if-Else statements (conditionals)
ternary operators (takes in a condition followed by the code to execute if the condition is TRUTHY followed by the code to execute if the condition is FALSY; If the condition is true, the element right after && will appear in the output. If it is false, React will ignore and skip it.)
logical && operators (used to conditionally include an element)

Variables:
    - using varibles to store elements
    - can help you conditionally render a part of the component while the rest of the output doesn't change









******************** LISTS AND KEYS *********************
You can build collections of elements and include them in JSX using curlies {}
Usually you render lists inside a component

Keys help React idenify which items have changed, are added, or are removed. Keys shouldbe given to the elements inside the array to give the elements a stable identity
    - most often would use IDs from your data as keys ( key ={todo.id} {todo.text})
    - when you don't have stable IDs for rendered items, you may use the item index as a key as a last resort ( key={index} {todo.text}}
    - not recommended to use indexes as keys if the order of items may change
    - if you don't assign an explicit key to list items, then React will default to using indexes as keys
    - keys only make sense in the context of the surrounding array
        *GOOD RULE OF THUMB: elements inside of the map() call need keys
    - keys used wthinin arrays should be unique amoung their siblings, but don't need to be globally unique



A functional component HAS to return JSX