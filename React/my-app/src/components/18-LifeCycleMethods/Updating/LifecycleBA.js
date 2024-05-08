import React, { Component } from 'react'

class LifecycleBA extends Component {
constructor(props) {
  super(props)

  this.state = {
     name: 'Deepak'
  }
  console.log('LifecycleBA constructor')
}

static getDerivedStateFromProps(props, state){
    console.log('LifecycleBA getDerivedStateFromProps')
    return null
}

componentDidMount(){
    console.log('LifecycleBA componentDidMount')
}

shouldComponentUpdate(){
  console.log('LifecycleBA shouldComponentUpdate')
  return true
}

getSnapshotBeforeUpdate(prevProps, prevState){
  console.log('LifecycleBA getSnapshotBeforeUpdate')
  return null
}

componentDidUpdate(){
  console.log('LifecycleBA componentDidUpdate')
}

  render() {    
      console.log('LifecycleBA render')
      return <div>LifecycleBA</div>    
  }
}

export default LifecycleBA