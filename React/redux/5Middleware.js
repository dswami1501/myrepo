//Demonstration of Middleware
//Note: install logger library (npm i redux-logger or npm install redux-logger)
const redux = require('redux')
const createStore = redux.createStore
//Steps start
const reduxLogger = require('redux-logger')
const logger = reduxLogger.createLogger()
const applyMiddleware = redux.applyMiddleware
//Steps end

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

const initialState ={
    numOfCakes: 10,
    numOfIceCreams: 20, 
}

const reducer = (state=initialState, action) =>{
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

//Below you can see use of middleware
const store = createStore(reducer, applyMiddleware(logger))
console.log('initial state', store.getState())
const unsubscribe = store.subscribe(()=>{})
store.dispatch(orderCake())
store.dispatch(orderCake())
store.dispatch(orderCake())
store.dispatch(restockCake(3))
store.dispatch(orderIceCream())
store.dispatch(orderIceCream())
store.dispatch(restockIceCream(2))

unsubscribe()