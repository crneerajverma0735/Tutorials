import React from 'react'
import './App.css';
import IntervalClassCounter from './component/IntervalClassCounter';
import IntervalHookCounter from './component/IntervalHookCounter';


function App() {
  return (
    <div className="App">
      <IntervalClassCounter/>
      <IntervalHookCounter/>
    </div>
  );
}

export default App;
