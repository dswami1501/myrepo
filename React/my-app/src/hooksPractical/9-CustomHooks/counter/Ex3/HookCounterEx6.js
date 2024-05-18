import React from 'react'
import useCounter1 from '../../../../myCustomHooks/useCounter1'

function HookCounterEx6() {
    const [count, increment, decrement, reset] = useCounter1(10, 10)

  return (
    <div>
        <h2>Count - {count}</h2>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={reset}>Reset</button>
    </div>
  )
}

export default HookCounterEx6