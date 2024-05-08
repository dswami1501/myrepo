import React, { Component } from 'react'
import User from './User'

class UserParent extends Component {
  render() {
    return (
        <User name = {(isLoggedIn) => isLoggedIn ? 'Deepak' : 'Guest'}/>
    )
  }
}

export default UserParent