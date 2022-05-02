import React, { useState, useEffect } from 'react';
import './App.css';

//*DONE* display list of to-do items  
//add ability to mark to-do items as complete ---- MUST BE STATE CHANGES
//keep the remaining to-do count up to date as items are completed or uncompleted
//create new to-do items
//modify completion behavior
//toggle visibility of completed to-do items

//PROPERTIES ARE IMMUTABLE 

function App() {

  const [todoItems, setTodoItems] = useState (
    [ //state variable with an array of objects
      { id: 1, 
        text: "Take out trash and recycling", 
        completed: true,
        newClass: "todo complete",
      },
      { id: 2, 
        text: "Pick up dry cleaning", 
        completed: false,
        newClass: "todo"
      },
      { id: 3, 
        text: "Get oil change", 
        completed: false,
        newClass: "todo"
      },
      { id: 4, 
        text: "Write thank-you notes", 
        completed: false,
        newClass: "todo",
      }, //fields of an object, not properties
    ]
  );  
  // console.log("todoItems", todoItems)

  
  //-------------------------------------------

  const [checkedState, setCheckedState] = useState(null)
  // const [newClass, setNewClass] = useState("todo")

  const handleCheckedState = (clickedItem, e) => {
    
    // console.log("clickedItem", clickedItem)
    // console.log("e", e)
    // const todoCompletion = todoItems[1].completed  // not understanding, must break down, understand what passing in and what data types, ITS AN ARRAY AND NEEDS INDEXS
    // console.log("todoCompletion", todoCompletion) // completed is a BOOLEAN

      // console.log("todoItems", todoItems)
      const newTodoItems = todoItems.map(item => { //todo is state variable that is holding my state, initial state is an array of objects
        // item is now id 1 on the first iteration, todoItems is an array 
        
        console.log("item", item)
        if(item.id === clickedItem.id){ //trying to find the item in my array with the ID of the item that was clicked, go back to .forEach, .map, .filter
         
          return {...item, completed: true, newClass: "todo complete"} //making a new object from item, making a copy of the item object and overriding the complete field
        }
        return item
      })
      console.log("newTodoItems", newTodoItems)
      setTodoItems(newTodoItems)

    // } 


    //create new array of objects
    //.find the object with id that matches todoItems id, if it matches then THAT is the one to change
    //update state with everything that was there before, but rerender only that particular object


    //have to change state
 
    
    //this function will allow the user to mark a list item as complete or incomplete
    //if check box is clicked, only that item is marked complete
      // * complete = true
    //if check box is NOT clicked, only that item is incomplete
      // * incomplete = false
    //completed items are greyed and crossed out
      // * related css is under todo.complete
    
    //read the completed status on the todoItems
    //when the event(checkbox) is triggered, 

  }

  




  return (
    <div>

    <div className="App">
      
      <div >
        <h1>Things to do</h1>
        <div id="main-todo-list" className="todo-list">
          {todoItems.map((item) =>
          <div className={item.newClass} id={item.id} key={item.id}>
            <input checked={item.completed} type="checkbox" className="todo-checkbox" onChange={(e) => handleCheckedState(item, e)}/>
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
