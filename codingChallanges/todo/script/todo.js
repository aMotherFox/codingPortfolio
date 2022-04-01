const todoItems = [
    { id: 1, text: "Take out trash and recycling", completed: true},
    { id: 2, text: "Pick up dry cleaning", completed: false},
    { id: 3, text: "Get oil change", completed: false},
    { id: 4, text: "Write thank-you notes", completed: false},
];
console.log("todoItems: ", todoItems)

window.onload = onPageLoad();

function onPageLoad () {
    document.querySelector(".todo-checkbox").checked = true;
}


// --------------- DELETED "delete me"
const step1 = document.querySelector(".todo-text")
step1.setAttribute("id", "delete-me")

let getDeleted = document.getElementById("delete-me")
console.log("get delete", getDeleted)
if (getDeleted.parentNode) {
  getDeleted.parentNode.removeChild(getDeleted)
}

// ----------------------




