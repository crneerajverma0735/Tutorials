import React from 'react';
import { buyIceCream } from '../redux';
import { connect } from 'react-redux';

function IceCreamContainer(props) {
    return (
        <div>
            <h2>Number of Ice creams -{props.numOfIceCreams} </h2>
            <button onClick={props.buyIceCream}>Buy Icecream</button>
        </div>
    )
}

const mapStateToProp = (state) => {
    return {
        numOfIceCreams: state.iceCream.numOfIceCreams
    }
}

const mapDispatchToProp = (dispatch) => {
    return {
        buyIceCream: () => dispatch(buyIceCream())
    }
}


export default connect(mapStateToProp, mapDispatchToProp)(IceCreamContainer)
