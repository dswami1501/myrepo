//NOTE: STEP 8 in this file
const redux = require('redux')
const createStore = redux.createStore
const CAKE_ORDERED = 'CAKE_ORDERED'
const CAKE_RESTOCKING = 'CAKE_RESTOCKING'
//Step 8: 
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
//Step 8.1 start
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
//Step 8.2 end

const initialState ={
    numOfCakes: 10,
    //Step 8.3
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
        //Step 8.4 start
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
        //Step 8.4 end
        default:
            return state
    }
}

const store = createStore(reducer)
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


