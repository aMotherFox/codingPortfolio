const name = "Lucas!!!!!"
console.log("Hello again: ", name)

const rootElement = document.getElementById("root")
console.log("rootElement: ", rootElement)

const p = document.createElement("p")
p.innerHTML = "Hello from the JS file"
rootElement.appendChild(p)


const p2 = document.createElement("p")
p2.innerHTML = "This is the inner element!!"

const divElement = document.createElement("div")
divElement.className = "my-special-class"
divElement.appendChild(p2)
rootElement.appendChild(divElement)


const h1 = document.createElement("h1")
h1.innerHTML = "This is my second element"

const div2 = document.createElement("div")
div2.className = "my-special-class"
div2.id = "i-am-a-div-2-id"
div2.appendChild(h1)
rootElement.appendChild(div2)


const divTags = document.getElementsByTagName("div")
console.log("divTags: ", divTags)

const specialClassElements = document.getElementsByClassName("my-special-class")
console.log("specialClassElements: ", specialClassElements)

const div3 = document.createElement("div")
div3.innerHTML = "Hello I am a child"
div2.append(div3)