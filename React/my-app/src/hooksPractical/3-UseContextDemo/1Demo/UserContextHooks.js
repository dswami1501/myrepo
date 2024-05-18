import React from 'react'
import A from './A'

export const UserContext = React.createContext()
export const ChannelContext= React.createContext()

function UserContextHooks() {
  return (
    <div>
        <UserContext.Provider value={'Deepak'}>
          <ChannelContext.Provider value={'Learning'}>
            <A/>
          </ChannelContext.Provider>            
        </UserContext.Provider>
    </div>
  )
}

export default UserContextHooks
