import React, { useContext } from 'react'
import { ChannelContext, UserContext } from '../2Demo/UserContextHooks1'

function D() {

    const user = useContext(UserContext)
    const channel = useContext(ChannelContext)

  return (
    <div>
        {user}-{channel}
    </div>
  )
}

export default D