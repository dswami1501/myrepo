import React, { Component } from 'react'
import LifecycleBA from './LifecycleBA'

class LifecycleAB extends Component {
constructor(props) {
  super(props)

  this.state = {
     name: 'Deepak'
  }
  console.log('LifecycleAB constructor')
}

static getDerivedStateFromProps(props, state){
    console.log('LifecycleAB getDerivedStateFromProps')
    return null
}

componentDidMount(){
    console.log('LifecycleAB componentDidMount')
}

shouldComponentUpdate(){
  console.log('LifecycleAB shouldComponentUpdate')
  return true
}

getSnapshotBeforeUpdate(prevProps, prevState){
  console.log('LifecycleAB getSnapshotBeforeUpdate')
  return null
}

componentDidUpdate(){
  console.log('LifecycleAB componentDidUpdate')
}

changeState= () => {
  this.setState({
    name: 'Deepak Swami'
  })
}

  render() {    
      console.log('LifecycleAB render')
      return (<div>
        <div>LifecycleAB</div>
        <button onClick={this.changeState}>Change state</button>
        <LifecycleBA/>
      </div>)    
  }
}

export default LifecycleAB