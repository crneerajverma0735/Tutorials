import React from 'react';
import './App.css';
import ClickCounter from './component/ClickCounter';
import HoverCounter from './component/HoverCounter';
import ClickCounterTwo from './component/ClickCounterTwo';
import HoverCounterTwo from './component/HoverCounterTwo';


function App() {
  return (
    <div className="App">
     <ClickCounterTwo />
     <HoverCounterTwo />
    </div>
  );
}

export default App;
