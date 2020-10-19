import React from 'react';
import logo from './logo.svg';
import './App.css';
import Greet from './component/Greet';
import Welcome from './component/Welcome';
import Hello from './component/Hello';
import Message from './component/Message';
import Counter from './component/Counter';

function App() {
  return (
    <div className="App">
      <Counter>

      </Counter>

      {/* <Message/> */}

      {/* <Greet name="Neeraj" heroName="Cricketer">
        <p>This is children Props</p>
         </Greet>
      <Greet name="Rajesh" heroName="Chef" >
        <button>Action</button>
      </Greet>
      <Greet name="Amit" heroName="mature" />
      
      <Welcome name="Neeraj" heroName="Cricketer"/>
      <Welcome name="Rajesh" heroName="Chef"/>
      <Welcome name="Amit" heroName="mature"/>
      <Hello /> */}


    </div>
  );
}

export default App;
