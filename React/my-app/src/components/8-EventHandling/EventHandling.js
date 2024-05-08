import React from 'react'

function EventHandling() {
    function clickHandler(){
        console.log('button clicked')
    }
  return (
    //Note: Eventhandling is a function and not a function call don't add the paranthesis
    <div>
        <button onClick={clickHandler}>Click</button>
    </div>
  )
}

export default EventHandling