import React, { Component } from 'react'
import withCounter2 from './withCounter2'

class HoverCounter2 extends Component {    

  render() {
    const {count, incrementCount} = this.props
    return <h2 onMouseOver={incrementCount}>
      Hovered {count} times</h2>    
  }
}

export default withCounter2(HoverCounter2, 10)