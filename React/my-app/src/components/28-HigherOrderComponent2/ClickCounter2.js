import React, { Component } from 'react'
import withCounter2 from './withCounter2'

class ClickCounter2 extends Component {

  render() {
    const {count, incrementCount} = this.props
    return <button onClick={incrementCount}>
      {this.props.name} Clicked {count} times</button>    
  }
}

export default withCounter2(ClickCounter2, 5)