import React from 'react'
import D from './D'

export const UserContext = React.createContext()
export const ChannelContext= React.createContext()

function UserContextHooks1() {
  return (
    <div>
        <UserContext.Provider value={'Deepak'}>
          <ChannelContext.Provider value={'Learning'}>
            <D/>
          </ChannelContext.Provider>            
        </UserContext.Provider>
    </div>
  )
}

export default UserContextHooks1
