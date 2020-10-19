import React from 'react';
import logo from './logo.svg';
import './App.css';
import Greet from './component/Greet';
import Welcome from './component/Welcome';
import Hello from './component/Hello';

function App() {
  return (
    <div className="App">
       {/* <Greet/> */}
       {/* <Welcome/> */}
       <Hello />
    </div>
  );
}

export default App;
