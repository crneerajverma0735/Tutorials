import { BUY_CAKE } from './cakeTypes';


const initailState = {
    numOfCake: 10
}

const cakeReducer = (state = initailState, action) => {
    switch (action.type) {
        case BUY_CAKE:
            return {
                ...state,
                numOfCake: state.numOfCake - 1
            }

        default:
            return state;
    }
}


export default cakeReducer;