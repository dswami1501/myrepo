import React, { Component } from 'react'
import RegComp from './RegComp'
import PureComp from './PureComp'

class ParentComp extends Component {

    constructor(props) {
      super(props)
    
      this.state = {
         name: 'Deepak'
      }
    }

    componentDidMount(){
        setInterval(() => 
            {
                this.setState({
                    name: 'Deepak'
                })
            }, 2000            
        )
    }

  render() {
    console.log('*****************Parent Comp Render****************************')
    return (
      <div>
        ParentComp
      <RegComp name={this.state.name}></RegComp>
      <PureComp name={this.state.name}></PureComp>
      </div>
    )
  }
}

export default ParentComp