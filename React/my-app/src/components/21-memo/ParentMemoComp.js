import React, { Component } from 'react'
import MemoComp from './MemoComp'

class ParentMemoComp extends Component {

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
        ParentMemoComp
      <MemoComp name={this.state.name}/>
      </div>
    )
  }
}

export default ParentMemoComp