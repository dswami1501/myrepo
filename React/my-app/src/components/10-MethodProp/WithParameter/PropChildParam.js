import React from 'react'

function PropChildParam(props) {
  return (<div>    
    <button onClick={() => props.greetHandler1('child')}>Greet Parent with Parameter</button>
  </div>    
  )
}

export default PropChildParam