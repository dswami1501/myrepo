import React from 'react'

function Title1() {
    console.log('Rendering Title')
  return (
    <h2>
        UseCallBack Hook
    </h2>
  )
}

export default React.memo(Title1)