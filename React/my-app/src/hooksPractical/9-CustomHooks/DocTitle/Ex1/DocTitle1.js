import React, { useEffect, useState } from 'react'

function DocTitle1() {
    const [count, setCount] = useState(0)

useEffect(() => {
    document.title = `Count ${count}`
}, [count])

  return (
    <div>
        <button onClick={() => setCount(count + 1)}>Count - {count}</button>
    </div>
  )
}

export default DocTitle1