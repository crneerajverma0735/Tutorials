import React, { Component } from 'react'
import './App.css';
import CakeContainer from './components/CakeContainer';
import { Provider } from 'react-redux';
import store from './redux/store';
import HookCakeContainer from './components/HookCakeContainer';


export default class App extends Component {

  render() {
    return (
      <Provider store={store}>
        <div>
          <CakeContainer />
          <HookCakeContainer />
        </div>
      </Provider>
    )
  }
}
