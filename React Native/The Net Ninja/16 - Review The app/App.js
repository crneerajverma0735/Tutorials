import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import About from './screens/About';
import Home from './screens/Home';
import ReviewDetails from './screens/ReviewDetails';


export default function App() {



  return (
    <View>
      <Home />
      <About />
      <ReviewDetails />
    </View>
  );
}

const styles = StyleSheet.create({

});
