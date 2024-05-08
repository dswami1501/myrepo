import React from 'react'

function ListRendering1() {
    const names = ['Bruce', 'Clark', 'Diana']
    const nameList = names.map(name => <h1>{name}</h1>)
    return nameList    
}
{/* return <h1>{names[0]}</h1>
        <h1>{names[1]}</h1>
        <h1>{names[2]}</h1> */}
export default ListRendering1