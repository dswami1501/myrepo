import React, { Component } from 'react'
import PropChildParam from './PropChildParam'

export class MethodPropParentParam extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         parentName: 'Parent'
      }

      this.greetParent1 = this.greetParentWithParam.bind(this)
    }    

    greetParentWithParam(childName){
        alert(`Hello ${this.state.parentName} from ${childName}`)
    }

  render() {
    return (
      <div>    
        <PropChildParam greetHandler1={this.greetParent1}/>
      </div>
    )
  }
}

export default MethodPropParentParam