import React, { Component } from 'react'

class UserGreeting extends Component {
    constructor(props) {
        super(props)

        this.state = {
            isLoggedIn: false
        }
    }

    render() {
        return this.state.isLoggedIn && <div>Welcome Neeraj</div>


        // return(
        //     this.state.isLoggedIn ?
        //     <div>Welcome Neeraj</div> :
        //     <div>Welcome guest</div>
        // )


        // let message
        // if(this.state.isLoggedIn){
        //     message = <div>Wecome Neeraj</div>
        // }else{
        //     message = <div>Welcome guest</div>
        // }

        //  return <div>{message}</div>



        // if (this.state.isLoggedIn) {
        //     return <div>Welcome Vishwas</div>

        // } else {
        //     return <div>Welcome guest</div>
            
        // }

        // return (
        //     <div>
        //        <div> Welcome Neeraj</div>
        //        <div>Welcome Guest</div>
        //     </div>
        // )
    }
}

export default UserGreeting
