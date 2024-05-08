import React, { Component } from 'react'

export class BindingEventApproach4 extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         message: 'Hello'
      }      
    }

    clickHandler = () => {
        this.setState({
            message: 'GoodBye'
        })
        console.log(this)
    }

  render() {
    return (
      <div>
        <div>{this.state.message}</div>
        <button onClick={this.clickHandler}>Click</button>
      </div>
    )
  }
}

export default BindingEventApproach4