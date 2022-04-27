import React, { useState } from 'react';
import './App.css';


//*DONE* display list of to-do items  
//add ability to mark to-do items as complete
//keep the remaining to-do count up to date as items are completed or uncompleted
//create new to-do items
//modify completion behavior
//toggle visibility of completed to-do items

function App() {

  const [todoItems, setTodoItems] = useState ([
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false},
  ]);  
  console.log("todoItems", todoItems)
  
  

  




  return (
    <div>

    <div className="App">
      
      <div >
        <h1>Things to do</h1>
        <div id="main-todo-list" className="todo-list">
          {todoItems.map((item) =>
          <div className="todo" id={item.id} key={item.id}>
            <input type="checkbox" className="todo-checkbox"/>
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
}

export default App;
