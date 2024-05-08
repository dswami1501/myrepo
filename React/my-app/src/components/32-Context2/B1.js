import React, { Component } from 'react'
import C1 from './C1'
import UserContext1 from './userContext1'

class B1 extends Component {
  static contextType = UserContext1 /*Approach 2*/
  render() {
    return (
      <div>
        B1 context {this.context}
        <C1/>
      </div>
    )
  }
}

// B1.contextType = UserContext1 /*Approach 1*/
export default B1