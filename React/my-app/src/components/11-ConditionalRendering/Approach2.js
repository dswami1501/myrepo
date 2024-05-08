import React, { Component } from 'react'

export class Approach2 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         isLoggedin: false
      }
    }
    
  render() {
    let message
    if (this.state.isLoggedin) {
        message= <div>Welcome Deepak</div>
    } else {
        message= <div>Welcome Guest</div>
    }
    return <div>{message}</div>
  }
}

export default Approach2