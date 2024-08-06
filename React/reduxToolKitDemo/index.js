//Step3:
const store = require('./app/store')
//Step8:
const fetchUsers = require('./features/user/userSlice').fetchUsers
//Step3.3:
const cakeActions  = require('./features/cake/cakeSlice').cakeActions
const icecreamActions = require('./features/iceCream/icecreamSlice').icecreamActions
const userActions = require('./features/user/userSlice').userActions

//Step3.1:
console.log('Initial state', store.getState())
//Step3.2:
const unsubscribe = store.subscribe(() => {
    //Remove the below log statement for the step 4.x to see middleware action
    console.log('Updated state', store.getState())
})
//Step8.1: comment all other dispatch function lines 
//and an unsubscribe function as fetchUsers is an async action
store.dispatch(fetchUsers())
//Step3.4:
// store.dispatch(cakeActions.ordered())
// store.dispatch(cakeActions.ordered())
// store.dispatch(cakeActions.ordered())
// store.dispatch(cakeActions.restocked(3))

// store.dispatch(icecreamActions.ordered())
// store.dispatch(icecreamActions.ordered())

//Step3.4.1:
// store.dispatch(icecreamActions.restocked(2))

//Step3.5:
// unsubscribe()