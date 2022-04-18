import React from 'react'
import './App.css';

const App = () => {
  return (
    <> {/* React Fragment */}
      <div>
        <p>This is a div</p>
      </div>
      <div>
        <p>These are my headers</p>
        <h1>This is an h1</h1>
        <h2>This is an h2</h2>
        <h3>This is an h3</h3>
        <p> Headers go all the way to h6</p>
      </div>

      <div>
        <h3>This is an unordered list</h3>
        <ul>
          <li>this is the first list item</li>
          <li>this is the second item</li>
          <li>this is the third item</li>
        </ul>
      </div>

      <div>
        <h3>This is an ordered list</h3>

        <ol>
          <li>First Thing</li>
          <li>Second Thing</li>
          <li>Third Thing</li>
        </ol>
      </div>

      <div>
        <h3 style={{color: 'red', fontSize: '30px'}}>This is a table</h3>

        <table>
          <thead>
            <tr>
              <td>First Header</td>
              <td>Second Header</td>
              <td>Third Header</td>
            </tr>
          </thead>
          <tbody>
          <tr>
              <td>This is the top left</td>
              <td>This is the top middle</td>
              <td>This is the top right</td>
            </tr>
            <tr>
              <td>First item top left</td>
              <td>Second item top middle</td>
              <td>Third item top right</td>
            </tr>
            <tr>
              <td>Another First item top left</td>
              <td>Another Second item top middle</td>
              <td>Another Third item top right</td>
              <td> oops example</td>
            </tr>
          </tbody>
        </table>
      </div>

      <br/>
      <p>There was a break above me</p>

      <hr/>
      <p>There is a line above me</p>

      <div>
        <p>This is an 'A href' tag</p>

        <a href="bucky.com">Visit Bucky</a>
      </div>

      <div>
        <p>This is an image tag</p>

        <img width={400} height={630} alt="puppy" src="https://pbs.twimg.com/media/FCfxUSNWQAg312_?format=jpg&name=large" />
      </div>

      <div>
        <h3>this is a button</h3>
        <button>Click Me!</button>
      </div>

      <hr />
      <h1>Grid And Flexbox</h1>

      <div>
        <div style={{ backgroundColor: "red", display: "grid", padding: 1}}></div>

      </div>
    </>
  );
}

export default App;