const todoItems = [
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false},
];
console.log("todoItems: ", todoItems)


//----------------------------------- todo items
const item = todoItems.find(item => item.id === 1)
console.log("item 1: ", item.text)

const item2 = todoItems.find(item => item.id === 2)
console.log("item 2: ", item2.text)

const item3 = todoItems.find(item => item.id === 3)
console.log("item 3: ", item3.text)

const item4 = todoItems.find(item => item.id === 4)
console.log("item 4: ", item4.text)



// -------root element to attach divs for main-todo-list------

const rootElement = document.getElementById("main-todo-list")
console.log("rootElement: ", rootElement)



// // ---------------------------------- DELETED "delete me"
// const deleteMe = document.querySelector(".todo-text")
// deleteMe.setAttribute("id", "delete-me")

// let getDeleted = document.getElementById("delete-me")
// console.log("get delete", getDeleted)
// if (getDeleted.parentNode) {
//   getDeleted.parentNode.removeChild(getDeleted)
// }

// -------------------------------------- delete todo list

const step1 = document.querySelector(".todo")
step1.setAttribute("id","delete-me")
console.log("step1", step1)

let getDeleted = document.getElementById("delete-me")
console.log("get deleted", getDeleted)
if (getDeleted.parentNode) {
    getDeleted.parentNode.removeChild(getDeleted)
}
console.log("getDeleted", getDeleted)

///--------- add back list ---------------

const lineThrough = document.getElementsByClassName(".todo-complete")
console.log("linethrough", lineThrough)
function addToDo(toDo, id, completed){

    const LINE = completed ? lineThrough : "";

    const item = `
                <div class="todo">
                <input type="checkbox" class=".todo-checkbox"/>
                <span class ="todo-text ${LINE}">${toDo}</span>
                </div>
            `
    const position = "beforeend";

    rootElement.insertAdjacentHTML(position,item)
}

addToDo(item.text)
addToDo(item2.text)
addToDo(item3.text)
addToDo(item4.text)




//-------------------- checkmark when page loads
// window.onload = onPageLoad();

// function onPageLoad () {
//     document.querySelector(".todo-checkbox").checked = true;
// } 

// checkbox = getElementsByClassName("todo-checkbox");
// checkbox.addEventListener

// rootElement.forEach(todoVar =>
//     const completed = todoVar.completed
//     // if (completed === true){
//     //     checkbox.checked
//     }
// )


// ----------------------------------- create new todo

const input = document.getElementById("input")
document.addEventListener("keyup", function(event){
    if(event.keycode === 13){
        const toDO = input.value;

        if (toDo){
            addToDo(toDo, id, false)

        todoItems.push({
            
        })
        }
    }
})




//----------------------------------- LUCAS EXAMPLE ---------------------------------------
const todoItems = [
  { id: 1, text: "Take out trash and recycling", completed: true},
  { id: 2, text: "Pick up dry cleaning", completed: false},
  { id: 3, text: "Get oil change", completed: false},
  { id: 4, text: "Write thank-you notes", completed: false},
];
console.log("todoItems: ", todoItems)

const mainTodoDiv = document.getElementById("main-todo-list")

console.log("---- DELETING DIV -----")
const deleteDiv = document.getElementsByClassName("todo")[0]
mainTodoDiv.removeChild(deleteDiv)

console.log("---- DISPLAYING TODO ITEMS ---- ")

const handleClick = (event) => {
  const target = event.target
  const checked = target.checked
  const parent  = target.parentElement

  const span = document.getElementById("remaining-count")

  if (checked) {
      parent.className = "todo complete"
      span.innerHTML--
  } else {
      parent.className = "todo"
      span.innerHTML++
  }

}

const displayTodoItem = (todoItem) => {
  const div2 = document.createElement('div')
  div2.id = todoItem.id
  div2.className = todoItem.completed === true ? "todo complete" : "todo"

  const input2 = document.createElement('input')
  input2.type = "checkbox"
  input2.className = "todo-checkbox"
  if (todoItem.completed === true) {
      input2.checked = true
  }
  input2.addEventListener("click", handleClick)
  
  const span2 = document.createElement("span")
  span2.className = "todo-text"
  span2.innerHTML = todoItem.text
  
  div2.append(input2)
  div2.append(span2)
  mainTodoDiv.appendChild(div2)
}

todoItems.forEach(todoItem => {
  displayTodoItem(todoItem)
})

console.log("---- MARKING ITEM COMPLETE -----")

console.log("---- ITEMS REMAINING ----")
const uncompletedItems = todoItems.filter(todoItem => todoItem.completed === false)
const itemsRemaining = uncompletedItems.length

const span = document.getElementById("remaining-count")
span.innerHTML = itemsRemaining

console.log("----- ADDING NEW ITEMS -----")
const appDiv = document.getElementsByClassName("app")[0]
console.log("appDiv: ", appDiv)

const input = appDiv.children[2]
console.log("input: ", input)

const handleInput = (event) => {
  const text = event.target.value
  const keyCode = event.keyCode

  if (keyCode === 13) {
      const children = mainTodoDiv.children
      const lastItemId = +children[children.length - 1].id

      const newItem = {
          id: lastItemId + 1, 
          text: text, 
          completed: false
      }
      
      displayTodoItem(newItem)
      input.value = ""
      const currentItemsRemaining = +span.innerHTML
      span.innerHTML = currentItemsRemaining + 1
  }
}

input.addEventListener("keydown", handleInput)

//https://github.com/lgc13/lucasBootcamp/blob/main/js/coding_challenges/todo/script/todoPartiallyCompleted.js