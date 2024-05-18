import React, { useState } from 'react'
import useCounter from '../../../../myCustomHooks/useCounter'

function HookCounterEx3() {
  const [count, increment, decrement, reset] = useCounter()

  return (
    <div>
        <h2>Count - {count}</h2>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={reset}>Reset</button>
    </div>
  )
}

export default HookCounterEx3