const todoItems = [
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false},
];
console.log("todoItems: ", todoItems)
/* const item = todoItems.find(item => item.id === 1)
console.log(item.text)
*/
const item = todoItems.find(item => item.id === 1)
console.log("item.text:", item.text)


const todoText = document.getElementsByClassName("todo-text")
console.log("todoText:", todoText)
todoText[0].innerText = "Bucky"


const rootElement = document.getElementById("main-todo-list")
console.log("rootElement:", rootElement)

const divElement = document.createElement("divElement")
divElement.className="toDo"
rootElement.appendChild(divElement)

const 


