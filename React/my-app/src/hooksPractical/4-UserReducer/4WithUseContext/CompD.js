import React, { useContext } from 'react'
import { CountContext } from './ParentCompo'

function CompD() {
  const countContext = useContext(CountContext)
  return (
    <div>CompD - {countContext.countState}
        <button onClick={() => countContext.countDispatch('increment')}>Increment</button>
        <button onClick={() => countContext.countDispatch('decrement')}>Decrement</button>
        <button onClick={() => countContext.countDispatch('reset')}>Reset</button>
    </div>
  )
}

export default CompD