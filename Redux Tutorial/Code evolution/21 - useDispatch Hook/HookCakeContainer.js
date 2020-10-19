import React from 'react';
import { useSelector, useDispatch } from 'react-redux'
import { buyCake } from '../redux'

function HookCakeContainer() {
    const numOfCakes = useSelector(state => state.numOfCake);
    const dispatch = useDispatch();
    return (
        <div>
            <h2>Num Of cakes - {numOfCakes}</h2>
            <button onClick={() => dispatch(buyCake())}>Buy cake</button>
        </div>
    )
}

export default HookCakeContainer
