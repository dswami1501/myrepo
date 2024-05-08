import React, { Component } from 'react'

export class Approach3 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         isLoggedin: true
      }
    }
    
  render(){
    return this.state.isLoggedin ?
    (<div>Welcome Deepak</div>) :
    (<div>Welcome Guest</div>)
  }
}

export default Approach3