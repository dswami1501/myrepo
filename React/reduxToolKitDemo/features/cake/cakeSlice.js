//Step1: Importing CreateSlice
const createSlice = require('@reduxjs/toolkit').createSlice

//Step1.3: Initial State
const initialState = {
    numOfCakes: 10
}

//Step1.1: Invoking createSlice
const cakeSlice = createSlice({
    //Step1.2: 
    name: 'cake',
    //Step1.4:
    initialState,
    //Step1.5:
    reducers: {
        ordered: (state, action) => {
            state.numOfCakes--
        },
        restocked: (state, action) => {
            state.numOfCakes += action.payload
        }
    }
})

//Step1.6:
module.exports = cakeSlice.reducer
//Step1.7:
module.exports.cakeActions = cakeSlice.actions