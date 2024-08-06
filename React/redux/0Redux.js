//NOTE: STEP 1 TO STEP 5 in this file
//Step 5: Create store
const redux = require(`redux`)
const createStore = redux.createStore

//Step 1: Action type
const CAKE_ORDERED = `CAKE_ORDERED`

//Step 2: Action is an Object with the type property
// {
//     type: CAKE_ORDERED,
//     quantity: 1,
// }

//Step 3: Action Creator is a function that returns an action object
function orderCake(){
    return {
        type: CAKE_ORDERED,
        quantity: 1,
    }
}

//Step 4: initial state
const initialState ={
    numOfCakes: 10,
}

//Step 4.1: Reducers: specify how the app's state change in response to actions sent to the store
//Functions that accepts state and action as arguments, and returns the next state of the application
//(previousState, action)=>newState
const reducer = (state=initialState, action) =>{
    switch(action.type){
        case CAKE_ORDERED:
            return{
                ...state,
                numOfCakes: state.numOfCakes - 1,
            }
        default:
            return state
    }
}

//Step 5.1:use Store
const store = createStore(reducer)
//Step 5.2
console.log(`initial state`, store.getState())
//Step 5.3
const unsubscribe = store.subscribe(()=>console.log(`update state`, store.getState()))
//Step 5.4
store.dispatch(orderCake())
store.dispatch(orderCake())
store.dispatch(orderCake())
//Step 5.5
unsubscribe()

//Note:After unsubscribing you cannot dispatch any more actions

