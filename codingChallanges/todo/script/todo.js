const todoItems = [
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false},
];
console.log("todoItems: ", todoItems)

const item = todoItems.find(item => item.id === 1)
console.log("item.text:", item.text)
const item2 = todoItems.find(item => item.id === 2)
console.log("item2.text:", item2.text)
const item3 = todoItems.find(item => item.id === 3)
console.log("item3.text:", item3.text)
const item4 = todoItems.find(item => item.id === 4)
console.log("item4.text:", item4.text)

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
spanElement2.innerHTML = item2.text
spanElement2.className="todo-text"
rootElement.appendChild(spanElement2)
divElement2.appendChild(spanElement2)

// ------- to do #3

const divElement3 = document.createElement("div")
divElement3.className="todo"
rootElement.appendChild(divElement3)


const inputElement3 = document.createElement("input")
inputElement3.className="todo-checkbox"
inputElement3.type="checkbox"
rootElement.appendChild(inputElement3)
divElement3.appendChild(inputElement3)

const spanElement3 = document.createElement("span")
spanElement3.innerHTML = item3.text
spanElement3.className="todo-text"
rootElement.appendChild(spanElement3)
divElement3.appendChild(spanElement3)

// ------- to do #4

const divElement4 = document.createElement("div")
divElement4.className="todo"
rootElement.appendChild(divElement4)


const inputElement4 = document.createElement("input")
inputElement4.className="todo-checkbox"
inputElement4.type="checkbox"
rootElement.appendChild(inputElement4)
divElement4.appendChild(inputElement4)

const spanElement4 = document.createElement("span")
spanElement4.innerHTML = item4.text
spanElement4.className="todo-text"
rootElement.appendChild(spanElement4)
divElement4.appendChild(spanElement4)