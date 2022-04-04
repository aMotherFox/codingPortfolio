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
