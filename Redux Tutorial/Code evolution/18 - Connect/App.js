import React, { Component } from 'react'
import './App.css';
import CakeContainer from './components/CakeContainer';
import { Provider } from 'react-redux';
import store from './redux/store';


export default class App extends Component {

  render() {
    return (
      <Provider store={store}>
        <div>
          <CakeContainer />
        </div>
      </Provider>
    )
  }
}
