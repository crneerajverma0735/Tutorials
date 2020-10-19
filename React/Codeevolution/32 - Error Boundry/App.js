import React from 'react';
import './App.css';
import Hero from './component/Hero';
import ErrorBoundry from './component/ErrorBoundry';

function App() {
  return (
    <div className="App">
      <ErrorBoundry>
        <Hero heroName="Batman"/>
      </ErrorBoundry>

      <ErrorBoundry>
        <Hero heroName="Superman"/>
      </ErrorBoundry>

      <ErrorBoundry>
        <Hero heroName="Joker"/>
      </ErrorBoundry>

      {/* <ErrorBoundry>
        <Hero heroName="Batman"/>
        <Hero heroName="Superman"/>
        <Hero heroName="Joker"/>   
      </ErrorBoundry>    */}
    </div>
  );
}

export default App;
