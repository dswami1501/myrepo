//NOTE: STEP 6 TO STEP 7 in this file
const redux = require('redux')
const createStore = redux.createStore
//Step 7.1:
const bindActionCreators = redux.bindActionCreators
const CAKE_ORDERED = 'CAKE_ORDERED'
//Step 6: Adding another scenario: Cake Restocking
const CAKE_RESTOCKING = 'CAKE_RESTOCKING'

function orderCake(){
    return {
        type: CAKE_ORDERED,
        payload: 1,
    }
}

//Step 6.1:
function restockCake(qty = 1){
    return {
        type: CAKE_RESTOCKING,
        payload: qty,
    }
}

const initialState ={
    numOfCakes: 10,
}

const reducer = (state=initialState, action) =>{
    switch(action.type){
        case CAKE_ORDERED:
            return{
                ...state,
                numOfCakes: state.numOfCakes - 1,
            }
        //Step 6.2:
        case CAKE_RESTOCKING:
            return{
                ...state,
                numOfCakes: state.numOfCakes + action.payload
            }
        default:
            return state
    }
}

const store = createStore(reducer)
console.log(`initial state`, store.getState())
const unsubscribe = store.subscribe(()=>console.log(`update state`, store.getState()))
// store.dispatch(orderCake())
// store.dispatch(orderCake())
// store.dispatch(orderCake())

//Step 6.3:
// store.dispatch(restockCake(3))

//Step 7: Note:This step is not necessary, BindActionCreators is alternative to the above store.dispatch(orderCake())
const actions = bindActionCreators({orderCake, restockCake}, store.dispatch)
actions.orderCake()
actions.orderCake()
actions.orderCake()
actions.restockCake(3)
unsubscribe()


