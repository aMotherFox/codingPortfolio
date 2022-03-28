/*
Mon.) Display list of to-do items
Tues.) Do Remaining to-do
Wed.) Create new items
Thurs.) Modify completion behavior
Fri.) Toggle visibility
*/




<!DOCTYPE html>
<html>
  <head>
    <title>Things to do (JavaScript)</title>
    <link rel="stylesheet" type="text/css" href="style/default.css" />
  </head>
  <body>
    <div class="app">
      <h1>Things to do</h1>
      <div id="main-todo-list" class="todo-list">
        <div class="todo">
          <input type="checkbox" class="todo-checkbox"/>
          <span class="todo-text" >Delete me!</span>
        </div>
      </div>
      <input type="text" placeholder="New todo"/>
      <p><span id="remaining-count">0</span> items remain</p>
    </div>
    <script src="script/todo.js"></script>
  </body>
</html>