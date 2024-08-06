//Step6:
const createSlice = require('@reduxjs/toolkit').createSlice
//Step6.3:
const createAsyncThunk = require('@reduxjs/toolkit').createAsyncThunk
//Step6.4:
const axios = require('axios')

//Step6.2:
const initialState = {
    loading: false,
    users: [],
    error: ''
}

//Step6.5:
//createAsyncThunk generates pending, fulfilled and rejected action types
const fetchUsers = createAsyncThunk('user/userSlice', () => {
    return axios.get('https://jsonplaceholder.typicode.com/users')
    .then(response => response.data.map((user) => user.id))
})

//Step6.1:
const userSlice = createSlice({
    name: 'user',
    initialState,
    //Step6.6:
    extraReducers: builder => {
        builder.addCase(fetchUsers.pending, (state)=>{
            state.loading = true
        })
        builder.addCase(fetchUsers.fulfilled, (state, action)=>{
            state.loading = false
            state.users = action.payload
            state.error = ''
        })
        builder.addCase(fetchUsers.rejected, (state, action)=>{
            state.loading = false
            state.users = []
            state.error = action.error.message
        })
    }
})

//Step6.7:
module.exports = userSlice.reducer
//Step6.8:
module.exports.fetchUsers = fetchUsers