import React, { Component } from 'react'

export class DestructuringPropsNdStateWithClass extends Component {
  render() {
    const {name, heroName} = this.props
    //In a same way you can destructure state
    //const {state1, state2} = this.state
    return <div>
    <h1>Hello {name} a.k.a {heroName}</h1>
</div>
  }
}

export default DestructuringPropsNdStateWithClass