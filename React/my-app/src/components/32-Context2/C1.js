import React, { Component } from 'react'
import { UserConsumer1 } from './userContext1'

class C1 extends Component {
  render() {
    return <UserConsumer1>
        {
            username => {
                return <div> Hello {username}</div>
            }
        }
    </UserConsumer1>
  }
}

export default C1