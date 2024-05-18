import React, { useState } from 'react'

function Memo1() {
    const [counterOne, setCounterOne] = useState(0)
    const [counterTwo, setCounterTwo] = useState(0)

    const incrementOne = () => {
        setCounterOne(counterOne + 1)
    }

    const incrementTwo = () => {
        setCounterTwo(counterTwo + 1)
    }

  return (
    <div>
        <div>
            <button onClick={incrementOne}>Count One - { counterOne}</button>
        </div>
        <div>
            <button onClick={incrementTwo}>Count Two - { counterTwo}</button>
        </div>
    </div>
  )
}

export default Memo1