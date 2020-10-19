import React from 'react';
import './App.css';
import ComponentC from './component/ComponentC';
import { UserProvider } from './component/userContext';


function App() {
  return (
    <div className="App">
      <UserProvider value="Neeraj">
        <ComponentC />
      </UserProvider>
    </div>
  );
}

export default App;
