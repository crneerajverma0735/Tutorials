import React from 'react';
import './App.css';
import PureComp from './component/PureComp';
import ParentComp from './component/ParentComp';

function App() {
  return (
    <div className="App">
      <ParentComp/>
    </div>
  );
}

export default App;
