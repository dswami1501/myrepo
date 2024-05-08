import React from 'react'

function Person({test}) {        
    return (
        <div>
            <h2>
                I am {test.name}, I am {test.age} years old
            </h2>
        </div>
    )    
}

export default Person