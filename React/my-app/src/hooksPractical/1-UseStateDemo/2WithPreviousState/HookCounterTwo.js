import React, { useState } from 'react'

function HookCounterTwo() {
    const initialCount = 0
    const [count, setCount] = useState(initialCount)

    const incrementFiveProblem = () => {
        for(let i = 0; i<5; i++){
            setCount(count + 1)
        }
    }

    const incrementFive = () => {
        for(let i = 0; i<5; i++){
            setCount(prevCount => prevCount + 1)
        }
    }

  return (
    <div>
        Count: {count}
        <button onClick={() => setCount(initialCount)}>Reset</button>
        <button onClick={() => setCount(count + 1)}>Increment</button>
        <button onClick={() => setCount(count - 1)}>Decrement</button>
        {/* Below button shows the problem in the approach in which we are implementing the Increment */}
        <button onClick={incrementFiveProblem}>Increment 5 Problem</button>
        {/* But the below approach is the correct approach */}
        <button onClick={incrementFive}>Increment 5 solution</button>
    </div>
  )
}

export default HookCounterTwo