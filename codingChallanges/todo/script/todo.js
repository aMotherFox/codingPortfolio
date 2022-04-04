const todoItems = [
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false},
];
console.log("todoItems: ", todoItems)

const rootElement = document.getElementById("main-todo-list")
console.log("rootElement: ", rootElement)

const insideText = document.createElement("todo-text")
insideText.innerHTML = ""
rootElement.appendChild(insideText)

// ---------------- framework

const item = document.createElement("div")
item.className = "main-todo-list"
item.appendChild(insideText)
rootElement.appendChild(item)

// const item2 = todoItems.find(item => item.id === 2)
// console.log("item 2: ", item2.text)

// const item3 = todoItems.find(item => item.id === 3)
// console.log("item 3: ", item3.text)

// const item4 = todoItems.find(item => item.id === 4)
// console.log("item 4: ", item4.text)

//---------------------------------------- ITEMS


// const todoEl1 = document.createElement("div")
// todoEl1.className = "main-todo-list" 
// todoEl1.

// function listingToDo(taskVar){
//     taskVar.forEach(theTaskImIteratingOn =>

//     )

// }

// const taskInput = document.getElementsByClassName("todo-list"); //new-task
// const addButton = document.getElementsByClassName("todo-checkbox")[0]; //first button

// //New Task List Item
// const creatingNewTaskElement = function(todoVar) {
//     //Create List Item
//     const listItem = document.createElement("todo");

//     //input (checkbox)
//     const checkBox = document.createElement("todo-checkbox"); // checkbox
//     //label
//     const innerText = document.createElement("todo-text");
//     //input (text)


//     //Each element needs modifying

//     checkBox.type = "checkbox";
//     innerText.innerHTML = "todo-text";

//     //Each element needs appending
//     listItem.appendChild(checkBox);
//     listItem.appendChild(innerText);
    

//     return listItem;
// }
// const tasksReturned = creatingNewTaskElement(todoItems)
