import React, { useState } from 'react';
import './App.css';

//*DONE* display list of to-do items  
//*DONE* add ability to mark to-do items as complete ---- MUST BE STATE CHANGES
//*DONE* keep the remaining to-do count up to date as items are completed or uncompleted
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

  //--------------------------------------------------------------------------------

  const [checkedState, setCheckedState] = useState(null)
  
  const handleCheckedState = (clickedItem, e) => {
   
      // console.log("todoItems", todoItems)
      const newTodoItems = todoItems.map(item => { 
        const trueOrFalse = clickedItem.completed
        if ( trueOrFalse === false ){
        	if(item.id === clickedItem.id){ 
            return {...item, completed: true, newClass: "todo complete"} 
          }
          return item
        }
        else if (trueOrFalse === true){
        	if(item.id === clickedItem.id){ 
            return {...item, completed: false, newClass: "todo"} 
          }
          return item  
        }
      }
    )
    setTodoItems(newTodoItems)

    //--------------------------------------------------------------------------------

   const uncompletedItems = newTodoItems.filter(newTodoItems => newTodoItems.completed === false)
   const itemsRemaining = uncompletedItems.length
   const span = document.getElementById("remaining-count")
   span.innerHTML = itemsRemaining
   console.log("uncompletedItems", uncompletedItems)
   console.log("itemsRemaining", itemsRemaining)
   console.log("span", span)

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
      <p><span id="remaining-count">3</span> items remain</p>
    </div>

    </div>
    </div>
  );
} //id, className, ect, are properties
//redundant to pass in todoItems on line 85, pass in which was clicked instead

export default App;
