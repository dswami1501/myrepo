import React from 'react'

const PropsExample = props => {
console.log(props)
//there is one limitation in below approach as it won't be able to add multiple html element
// so we need to wrap it with div tag
// return <h1>Hello {props.name} a.k.a {props.heroName}</h1>

//Enhanced return statement to return multiple html elements
return <div>
    <h1>Hello {props.name} a.k.a {props.heroName}</h1>
    {props.children}
</div>
}

export default PropsExample