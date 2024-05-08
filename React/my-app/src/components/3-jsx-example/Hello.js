import React from 'react'

const Hello = () => {
    /*return (
        <div className='dummyClass'>
            <h1>
                JSX Example
            </h1>
        </div>
    )*/

    //Below code is for non-JSX example
    return React.createElement('div',
{id: 'hello', className: 'dummyClass'},
React.createElement('h1', null, 'Non-JSX Example'))
}

export default Hello