import React, { Component, PureComponent } from 'react'
import PureComp from './PureComp'
import RegComp from './RegComp'

class ParentComp extends PureComponent {
    constructor(props) {
        super(props)
    
        this.state = {
             name:'neeraj'
        }
    }

    componentDidMount(){
        setInterval(() => {
            this.setState({
                name:'neeraj'
            })
        },2000)
    }
    
    render() {
        console.log("==========Parent Component Render=============")
        return (
            <div>
                Parent Component
                <RegComp name={this.state.name}></RegComp>
                <PureComp name={this.state.name}></PureComp>
            </div>
        )
    }
}

export default ParentComp
