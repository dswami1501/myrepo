import React, { useEffect, useState } from 'react'

function IntervalHookCounter() {
    const [count, setCount] = useState(0)

    //Approach 1
    // const tick = () => {
    //     setCount(count + 1)
    // }

    // useEffect(() => {
    //     const interval = setInterval(tick, 1000)

    //     return () => {
    //         clearInterval(interval)
    //     }
    // }, [count])

    //Approach 2
    const tick = () => {
        // setCount(testCount => testCount + 1)
        setCount(prevCount => prevCount + 1)
    }

    useEffect(() => {
        const interval = setInterval(tick, 1000)

        return () => {
            clearInterval(interval)
        }
    }, [])

  return (
    <div>{count}</div>
  )
}

export default IntervalHookCounter