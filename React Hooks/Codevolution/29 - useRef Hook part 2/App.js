import React from 'react'
import './App.css';
import ClassTimer from './component/ClassTimer';
import HookTimer from './component/HookTimer';


function App() {
  return (
      <div className="App">
        {/* <FocusInput/> */}
        <ClassTimer/>
        <HookTimer />
      </div>
    );
}

export default App;
