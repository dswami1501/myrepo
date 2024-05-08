import React, { Component } from 'react'

export class EventHandlingInClass extends Component {

    clickHandler(){
        console.log('Clicked the button')
    }

  render() {
    return (
      <div>
        <button onClick={this.clickHandler}>Click!</button>
      </div>
    )
  }
}

export default EventHandlingInClass