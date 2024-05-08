import React, { Component } from 'react'
import Hero from './Hero'
import ErrorBoundaries from './ErrorBoundaries'

export class HeroParent extends Component {
  render() {
    return (
      <div>
        <ErrorBoundaries>
            <Hero heroName='Batman'/>
        </ErrorBoundaries>
        <ErrorBoundaries>
            <Hero heroName='Superman'/>
        </ErrorBoundaries>
        <ErrorBoundaries>
            <Hero heroName='Joker'/>
        </ErrorBoundaries>
        <ErrorBoundaries>
            <Hero heroName='Daku'/>
        </ErrorBoundaries>
      </div>
    )
  }
}

export default HeroParent