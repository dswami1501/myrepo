import React from 'react'
import './myStyles.css'

function Stylesheet(props) {
    let colors = props.test ? 'primary' : ''
  return (
    <div>
        {/* If you use single styling class */}
        {/* <h1 className={colors}>Stylesheet</h1> */}

        {/* If you want to specify multiple styling class */}
        <h1 className={`${colors} font-xl`}>Stylesheet</h1>
    </div>
  )
}

export default Stylesheet
