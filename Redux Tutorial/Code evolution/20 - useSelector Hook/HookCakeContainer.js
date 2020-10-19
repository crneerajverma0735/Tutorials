import React from 'react';
import { useSelector } from 'react-redux'

function HookCakeContainer() {
    const numOfCakes = useSelector(state => state.numOfCake);
    return (
        <div>
            <h2>Num Of cakes - {numOfCakes}</h2>
            <button>Buy cake</button>
        </div>
    )
}

export default HookCakeContainer
