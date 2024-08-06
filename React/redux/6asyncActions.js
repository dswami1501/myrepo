//Demonstration of Redux-Thunk
//Note: install axios for making api request and redux-thunk for async actions
//VERY IMPORTANT: You need to do const thunkMiddleware = require("redux-thunk").thunk
// not const thunkMiddleware = require("redux-thunk").default; with redux-thunk since version 3.
const redux = require('redux')
const axios = require('axios')
const thunkMiddleware = require('redux-thunk').thunk
const createStore = redux.createStore
const applyMiddleware = redux.applyMiddleware

const initialState = {
    loading: false,
    users: [],
    error: ''
}

const FETCH_USERS_REQUESTED = 'FETCH_USERS_REQUESTED'
const FETCH_USERS_SUCCEEDED = 'FETCH_USERS_SUCCEEDED'
const FETCH_USERS_FAILED = 'FETCH_USERS_FAILED'

const fetchUserRequested = () => {
    return {
        type: FETCH_USERS_REQUESTED       
    }
}

const fetchUserSucceeded = (users) => {
    return {
        type: FETCH_USERS_SUCCEEDED,
        payload: users
    }
}

const fetchUserFailure = (error) => {
    return {
        type: FETCH_USERS_FAILED,
        payload: error
    }
}

const reducer = (state = initialState, action) => {
    switch(action.type){
        case FETCH_USERS_REQUESTED:
            return{
                ...state,
                loading: true
            }
        case FETCH_USERS_SUCCEEDED:
            return{
                ...state,
                loading: false,                
                users: action.payload
            }
        case FETCH_USERS_FAILED:
            return{
                ...state,
                loading: false,
                error: action.payload
            }
    }
}

//Async Action creator, Thunk middleware returns function instead of action object
const fetchUsers = () => {
    return function(dispatch){
        dispatch(fetchUserRequested())
        axios.get('https://jsonplaceholder.typicode.com/users')
        .then((response) =>{
            const users = response.data.map((user) => user.id)
            dispatch(fetchUserSucceeded(users))
        })
        .catch((error) => {
            dispatch(fetchUserFailure(error.message))
        })
    }
}

const store = createStore(reducer, applyMiddleware(thunkMiddleware))
store.subscribe(() => {console.log(store.getState())})
store.dispatch(fetchUsers())