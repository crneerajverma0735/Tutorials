import React, {useState} from 'react'
import useCounter from '../hooks/useCounter';

function CounterTwo() {
    const [count,increment,decrement,reset] = useCounter(5,5);

    return (
        <div>
            <h2>Count = {count}</h2>
            <button onClick={increment}>increment</button>
            <button onClick={decrement}>decrement</button>
            <button onClick={reset}>reset</button>
        </div>
    )
}

export default CounterTwo
