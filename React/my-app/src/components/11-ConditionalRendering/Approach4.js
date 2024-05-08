import React, { Component } from 'react'

export class Approach3 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         isLoggedin: false
      }
    }
    
  render(){
    return this.state.isLoggedin && <div> Welcome Deepak</div>    
  }
}

export default Approach3