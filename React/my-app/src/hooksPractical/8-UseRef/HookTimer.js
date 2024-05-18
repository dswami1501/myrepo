import React, { useEffect, useState } from 'react'

function HookTimer() {
    const[timer, setTimer] = useState(0)

useEffect(() => {
    const interval = setInterval(() => {
        setTimer(prevTimer => prevTimer + 1)
    }, 1000)
    return () => {
        clearInterval(interval)
    };
}, [])

  return (
    <div>
        Hook Timer - {timer}
    </div>
  )
}

export default HookTimer