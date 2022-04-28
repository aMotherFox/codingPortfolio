import React, { useState } from 'react';
import './App.css';


//*DONE* display list of to-do items  
//add ability to mark to-do items as complete ---- MUST BE STATE CHANGES
//keep the remaining to-do count up to date as items are completed or uncompleted
//create new to-do items
//modify completion behavior
//toggle visibility of completed to-do items

//PROPERTIES ARE IMMUTABLE 

function App() {

  const [todoItems, setTodoItems] = useState ([ //state variable with an array of objects
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false}, //fields of an object, not properties
  ]);  
  console.log("todoItems", todoItems)


  //-------------------------------------------

  const [checkedState, setCheckedState] = useState('')


  const handleCheckedState = (item) => {
    console.log("item", item)
    const todoCompletion = item.completed  // not understanding, must break down, understand what passing in and what data types, ITS AN ARRAY AND NEEDS INDEXS
    console.log("todoCompletion", todoCompletion) // completed is a BOOLEAN
    //have to change state

    // const checked = e.target.checked
    
    if (todoCompletion === false){
      setCheckedState({
      
    })
    }
    
    //this function will allow the user to mark a list item as complete or incomplete
    //if check box is clicked, only that item is marked complete
      // * complete = true
    //if check box is NOT clicked, only that item is incomplete
      // * incomplete = false
    //completed items are greyed and crossed out
      // * related css is under todo.complete
    
    //read the completed status on the todoItems
    //when the event(checkbox) is triggered, 

    
    



    // if(todoItems.completed === true) {
    //   // setCheckedState(true)
    //   console.log("i am checked", e.target.completed)
    // } else {
    //   // setCheckedState("false")
    //   console.log("i am not checked", e.target.completed)
    // }
  }

  




  return (
    <div>

    <div className="App">
      
      <div >
        <h1>Things to do</h1>
        <div id="main-todo-list" className="todo-list">
          {todoItems.map((item) =>
          <div className="todo" id={item.id} key={item.id}>
            <input type="checkbox" className="todo-checkbox" onClick={(e) => handleCheckedState(item)}/>
            <span className="todo-text">{item.text}</span>
          </div>
          )}
        </div>
      <input type="text" placeholder="New todo"/>
      <p><span id="remaining-count">0</span> items remain</p>
    </div>

    </div>
    </div>
  );
} //id, className, ect, are properties
//redundant to pass in todoItems on line 85, pass in which was clicked instead

export default App;
