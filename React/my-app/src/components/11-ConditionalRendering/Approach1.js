import React, { Component } from 'react'

export class Approach1 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         isLoggedin: true
      }
    }
    
  render() {
    if (this.state.isLoggedin) {
        return <div>Welcome Deepak</div>
    } else {
        return <div>Welcome Guest</div>
    }
  }
}

export default Approach1