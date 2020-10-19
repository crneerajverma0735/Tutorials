import React from 'react';
import logo from './logo.svg';
import './App.css';
import Greet from './component/Greet';
import Welcome from './component/Welcome';
import Hello from './component/Hello';

function App() {
  return (
    <div className="App">
      <Greet name="Neeraj" heroName="Cricketer">
        <p>This is children Props</p>
         </Greet>
      <Greet name="Rajesh" heroName="Chef" >
        <button>Action</button>
      </Greet>
      <Greet name="Amit" heroName="mature" />
      
      <Welcome name="Neeraj" heroName="Cricketer"/>
      <Welcome name="Rajesh" heroName="Chef"/>
      <Welcome name="Amit" heroName="mature"/>
      {/* <Hello /> */}
    </div>
  );
}

export default App;
