import React from 'react'
import './App.css';
import ClassMouse from './component/ClassMouse';
import HookMouse from './component/HookMouse';
import MouseContainer from './component/MouseContainer';


function App() {
  return (
    <div className="App">
      {/* <ClassMouse /> */}
      {/* <HookMouse /> */}
      <MouseContainer/>
    </div>
  );
}

export default App;
