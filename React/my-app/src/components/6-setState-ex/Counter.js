import React, { Component } from 'react'

class Counter extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         count: 0
      }
    }

    increment(){
        //In below line of code it is not rendering the output to UI but to the console it is,
        //So it is not possible to modify the state outside of the constructor directly
        //the only place where you can assign "this.state" is the constructor
        //Or if you are trying to do it outside the constructor use setState()
    //   this.state.count = this.state.count + 1
    //   console.log(this.state.count)  

    //Below code is working fine
    this.setState({
        count: this.state.count+1
     }, ()=> {
        console.log('callback value', this.state.count)
        }
    )
    console.log(this.state.count)
    }

    //This below code demonstrate the use of previous state
    incrementFiveCorrectly(){
        this.setState(prevState => ({
            count: prevState.count + 1 
        }))
        console.log('Count Five: ',this.state.count)
    }

    //Below code will not work for incrementing the value by five
    incrementFive(){
        this.increment()
        this.increment()
        this.increment()
        this.increment()
        this.increment()
    }

    //Code to increment the value by 5, it is working
    incrementFive1(){
        this.incrementFiveCorrectly()
        this.incrementFiveCorrectly()
        this.incrementFiveCorrectly()
        this.incrementFiveCorrectly()
        this.incrementFiveCorrectly()
    }

  render() {
    return (
        <div>
            <div>Count - {this.state.count}</div>
            <button onClick={() => this.increment()}>Increment</button>
            <div>CountFiveIncorrectly - {this.state.count}</div>
            <button onClick={() => this.incrementFive()}>IncrementFive_No working</button>
            <div>CountFiveCorrectly - {this.state.count}</div>
            <button onClick={() => this.incrementFive1()}>IncrementFive_Working</button>
        </div>      
    )
  }
}

export default Counter