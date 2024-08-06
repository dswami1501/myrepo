//Step2:
const configureStore = require("@reduxjs/toolkit").configureStore
//Step4:
// const reduxLogger = require('redux-logger')
//Step2.3:
const cakeReducer = require('../features/cake/cakeSlice')
const icecreamReducer = require('../features/iceCream/icecreamSlice')
//Step7:
const userReducer = require('../features/user/userSlice')

//Step4.1:
// const logger = reduxLogger.createLogger()

//Step2.1:
const store = configureStore({
    //Step2.2:
    reducer: {
        //Step2.4:
        cake: cakeReducer,
        icecream: icecreamReducer,
        //Step7.1:
        user: userReducer
    },
    //Step4.2:
    // middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(logger)
})

//Step2.5:
module.exports = store