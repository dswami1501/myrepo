import React, { useContext } from 'react'
import { CountContext } from './ParentCompo'

function CompA() {
  const countContext = useContext(CountContext)
  return (
    <div>CompA - {countContext.countState}
        <button onClick={() => countContext.countDispatch('increment')}>Increment</button>
        <button onClick={() => countContext.countDispatch('decrement')}>Decrement</button>
        <button onClick={() => countContext.countDispatch('reset')}>Reset</button>
    </div>
  )
}

export default CompA