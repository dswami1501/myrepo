const { configureStore, createSlice, createAsyncThunk } = require('@reduxjs/toolkit');
const axios = require('axios');

// Initial state
const initialState = {
  loading: false,
  users: [],
  error: ''
};

// Async thunk action
const fetchUsers = createAsyncThunk('users/fetchUsers', async () => {
  const response = await axios.get('https://jsonplaceholder.typicode.com/users');
  return response.data.map(user => user.id);
});

// Create slice
const usersSlice = createSlice({
  name: 'users',
  initialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(fetchUsers.pending, (state) => {
        state.loading = true;
      })
      .addCase(fetchUsers.fulfilled, (state, action) => {
        state.loading = false;
        state.users = action.payload;
        state.error = '';
      })
      .addCase(fetchUsers.rejected, (state, action) => {
        state.loading = false;
        state.users = [];
        state.error = action.error.message;
      });
  }
});

// Configure store
const store = configureStore({
  reducer: {
    users: usersSlice.reducer
  }
});

// Subscribe to store updates
store.subscribe(() => {
  console.log(store.getState());
});

// Dispatch the async thunk action
store.dispatch(fetchUsers());
