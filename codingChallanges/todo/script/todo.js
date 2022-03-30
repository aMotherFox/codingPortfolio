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

const rootElement = document.getElementById("main-todo-list")
console.log("rootElement:", rootElement)

// const todoText = document.getElementsByClassName("todo-text")
// console.log("todoText:", todoText)

// ------- to do #1

const divElement = document.createElement("div")
divElement.className="todo"
rootElement.appendChild(divElement)


const inputElement = document.createElement("input")
inputElement.className="todo-checkbox"
inputElement.type="checkbox"
rootElement.appendChild(inputElement)
divElement.appendChild(inputElement)

const spanElement = document.createElement("span")
spanElement.innerHTML = item.text
spanElement.className="todo-text"
rootElement.appendChild(spanElement)
divElement.appendChild(spanElement)

// ------- to do #2

const divElement2 = document.createElement("div")
divElement2.className="todo"
rootElement.appendChild(divElement2)


const inputElement2 = document.createElement("input")
inputElement2.className="todo-checkbox"
inputElement2.type="checkbox"
rootElement.appendChild(inputElement2)
divElement2.appendChild(inputElement2)

const spanElement2 = document.createElement("span")
spanElement2.innerHTML = item.text
spanElement2.className="todo-text"
rootElement.appendChild(spanElement2)
divElement2.appendChild(spanElement2)