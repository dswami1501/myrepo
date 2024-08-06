//Demonstration of Immer
//Note: install immer library (npm i immer or npm install immer)
const redux = require('redux')
const produce = require('immer').produce

const initialState = {
    name: 'Vishwas',
    address: {
        street: '123 Main St',
        city: 'Boston',
        state: 'MA'
    }
}

const STREET_UPDATED = 'STREET_UPDATED'
const updateStreet =(street) =>{
    return{
        type: STREET_UPDATED,
        payload: street
    }
}

const reducer = (state=initialState, action) =>{
    switch(action.type){
        case STREET_UPDATED:
        //Commented manual code     
        // return{
            //     ...state,
            //     address: {
            //     ...state.address,
            //     street: action.payload
            //     }
            // }
            
            //Replacement of above code
            return produce(state, (draft) => {
                draft.address.street = action.payload
            })
        default:
            return state
    }
}

const store = redux.createStore(reducer)
console.log('initial state', store.getState())
const unsubscribe = store.subscribe(()=>console.log(`update state`, store.getState()))
store.dispatch(updateStreet('456 Main St'))

unsubscribe()
