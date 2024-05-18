import React, { useState } from 'react'
import HookMouse from '../3OnlyOnce/HookMouse'

function MouseContainer() {
    const [display, setDisplay] = useState(true)
  return (
    <div>
        <button onClick={() => setDisplay(!display)}>Toggel Display</button>
        {display && <HookMouse/>}
    </div>
  )
}

export default MouseContainer