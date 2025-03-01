import { applyMiddleware, compose, createStore } from "redux";
import rootReducer from "./rootReducer";
import thunk from 'redux-thunk'

//const store = createStore(rootReducer, applyMiddleware(thunk))
const store = createStore(  
    rootReducer,  
    compose(  
        applyMiddleware(thunk)  
    )  
);  

export default store