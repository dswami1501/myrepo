import React, { useEffect, useRef } from 'react'

function Ref1() {

    const inputRef = useRef(null)

    useEffect(() => {
        inputRef.current.focus()
    }, [])

  return (
    <div>
        <input ref={inputRef} type='text'/>
    </div>
  )
}

export default Ref1