import React from 'react'

const UserContext1 = React.createContext('Deepak Swami')

const UserProvider1 = UserContext1.Provider
const UserConsumer1 = UserContext1.Consumer

export {UserProvider1, UserConsumer1}
export default UserContext1