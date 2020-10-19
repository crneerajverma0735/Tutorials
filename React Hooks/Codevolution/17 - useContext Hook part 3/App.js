import React from 'react'
import './App.css';
import ComponentC from './component/ComponentC';
import ComponentE from './component/ComponentE';

export const UserContext = React.createContext();
export const ChannelContext = React.createContext();

function App() {
  return (
    <div className="App">
      <UserContext.Provider value={'Neeraj'} >
        <ChannelContext.Provider value={'Codevolution'}>
          <ComponentE />
        </ChannelContext.Provider>
      </UserContext.Provider>
    </div>
  );
}

export default App;
