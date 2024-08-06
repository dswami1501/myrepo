// Import configureStore from Redux Toolkit
const { configureStore, createSlice } = require('@reduxjs/toolkit');

// Create a slice with initial state and reducers
const exampleSlice = createSlice({
  name: 'example',
  initialState: {},
  reducers: {
    exampleAction: (state, action) => {
      state.data = action.payload;
    },
  },
});

// Extract the action creators object and the reducer
const { actions, reducer } = exampleSlice;

// Configure the store with the reducer and thunk middleware
const store = configureStore({
  reducer: {
    example: reducer,
  },
  middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(),
});

// Example async action creator using Thunk
const exampleAsyncAction = () => {
  return (dispatch) => {
    // Simulate an async operation, like an API call
    setTimeout(() => {
      dispatch(actions.exampleAction('Hello, Redux Thunk!'));
    }, 1000);
  };
};

// Dispatch the async action
store.dispatch(exampleAsyncAction());

// Log the updated state
store.subscribe(() => {
  console.log(store.getState());
});
