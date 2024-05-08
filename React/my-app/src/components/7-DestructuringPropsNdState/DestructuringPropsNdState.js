import React from 'react'

//Way 1
// const DestructuringPropsNdState = ({name, heroName}) => {
// return <div>
//     <h1>Hello {name} a.k.a {heroName}</h1>
// </div>
// }

//Way 2
const DestructuringPropsNdState = props => {
const {name, heroName} = props
return <div>
    <h1>Hello {name} a.k.a {heroName}</h1>
</div>
}

export default DestructuringPropsNdState