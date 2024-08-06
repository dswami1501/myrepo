//NOTE: This file contains steps for Multipe Reducers
const redux = require('redux')
const createStore = redux.createStore
const combineReducers = redux.combineReducers
const CAKE_ORDERED = 'CAKE_ORDERED'
const CAKE_RESTOCKING = 'CAKE_RESTOCKING'
const ICECREAM_ORDERED = 'ICECREAM_ORDERED'
const ICECREAM_RESTOCKING = 'ICECREAM_RESTOCKING'

function orderCake(){
    return {
        type: CAKE_ORDERED,
        payload: 1,
    }
}

function restockCake(qty = 1){
    return {
        type: CAKE_RESTOCKING,
        payload: qty,
    }
}

function orderIceCream(qty = 1){
    return {
        type: ICECREAM_ORDERED,
        payload: qty,
    }
}

function restockIceCream(qty = 1){
    return {
        type: ICECREAM_RESTOCKING,
        payload: qty,
    }
}

const initialCakeState ={
    numOfCakes: 10,    
}

const initialIceCreamState ={
    numOfIceCreams: 20, 
}

const cakeReducer = (state=initialCakeState, action) =>{
    switch(action.type){
        case CAKE_ORDERED:
            return{
                ...state,
                numOfCakes: state.numOfCakes - 1,
            }        
        case CAKE_RESTOCKING:
            return{
                ...state,
                numOfCakes: state.numOfCakes + action.payload
            }    
        default:
            return state
    }
}

const iceCreamReducer = (state=initialIceCreamState, action) =>{
    switch(action.type){        
        case ICECREAM_ORDERED:
            return{
                ...state,
                numOfIceCreams: state.numOfIceCreams - 1,
            }        
        case ICECREAM_RESTOCKING:
            return{
                ...state,
                numOfIceCreams: state.numOfIceCreams + action.payload
            }        
        default:
            return state
    }
}

const rootReducer = combineReducers({
    cake: cakeReducer,
    iceCream: iceCreamReducer
})

const store = createStore(rootReducer)
console.log('initial state', store.getState())
const unsubscribe = store.subscribe(()=>console.log(`update state`, store.getState()))
store.dispatch(orderCake())
store.dispatch(orderCake())
store.dispatch(orderCake())
store.dispatch(restockCake(3))
store.dispatch(orderIceCream())
store.dispatch(orderIceCream())
store.dispatch(restockIceCream(2))

unsubscribe()