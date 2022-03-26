const name = "Emre"
console.log("Hello again: ", name)

const rootElement = document.getElementById("root")
console.log("rootElement: ", rootElement)

const p = document.createElement("p")
p.innerHTML = "Hello from the JS file"
rootElement.appendChild(p)


const p2 = document.createElement("p")
p2.innerHTML = "This is the inner element!"

const divElement = document.createElement("div")
divElement.className = "my-special-class"
rootElement.appendChild(div2)
rootElement.appendChild(divElement)

const div2 = document.createElement("div")
div2.className = "my-special-class"
div2.innerHTML = "this is my second element"
div2.id = "i-am-a-div-2-id"



const divTags = document.getElementsByTagName("div")
console.log("divTags: ", divTags)

const specialClassElements = document.getElementsByClassName("my-special-class")
console.log("specialClassElements: ", specialClassElements)

const div3 = document.createElement("div")
div3.innerHTML = "Hello, I am a child"
div2.appendChild(div3)