import React, { Component } from 'react';
//import logo from './logo.svg';
import './App.css';

class App extends Component {
    render() {
        return ( <div>
            <h2 className="App-header">
            Hello world!
        </h2>
        <Foo />

        </div>
    );
    }
}

class Foo extends Component {
    render() {
        return (<div>
            For for For for For for  <br/>
        For for For for For for  <br/>
        For for For for For for  <br/>
        </div>

    );
    }
}


export default App;