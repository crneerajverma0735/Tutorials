import React from 'react';
import './App.css';
import RefsDemo from './component/RefsDemo';
import FocusInput from './component/FocusInput';
import FRParentInput from './component/FRParentInput';

function App() {
  return (
    <div className="App">
      <FRParentInput/>
      {/* <FocusInput/> */}
    </div>
  );
}

export default App;
