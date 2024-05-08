import React from 'react'

function PropChild(props) {
  return (<div>
    <button onClick={props.greetHandler}>Greet Parent without Parameter</button>    
  </div>    
  )
}

export default PropChild