import React, { Component } from 'react'
import PropChild from './PropChild'

export class MethodPropParent extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         parentName: 'Parent'
      }

      this.greetParent = this.greetParent.bind(this)    
    }

    greetParent(childName){                
      alert(`Hello ${this.state.parentName}`)        
    }

  render() {
    return (
      <div>
        <PropChild greetHandler={this.greetParent}/>
      </div>
    )
  }
}

export default MethodPropParent