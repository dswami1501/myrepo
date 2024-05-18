import React, { Component } from 'react'
import { ChannelContext, UserContext } from './UserContextHooks'

function C() {
  return (
    <div>
      <UserContext.Consumer>
        {
            username => {
                return (
                  <ChannelContext.Consumer>
                    {
                      channel => {
                        return <div> Hello {username} {channel}</div> 
                      }                        
                    }
                  </ChannelContext.Consumer>
                ) 
            }
        }
    </UserContext.Consumer>
    </div>
  )
}

export default C