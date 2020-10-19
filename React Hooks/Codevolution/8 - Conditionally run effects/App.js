import React from 'react'
import './App.css';
import ClassCounter from './component/ClassCounter';
import HookCounter from './component/HookCounter';

function App() {
  return (
    <div className="App">
      {/* <ClassCounter/> */}
      <HookCounter />
    </div>
  );
}

export default App;
