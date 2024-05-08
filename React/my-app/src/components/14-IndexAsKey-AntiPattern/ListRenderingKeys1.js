import React from 'react'

function ListRenderingKeys1() {
    
    const names = ['Bruce', 'Clark', 'Diana']            
    const persons = [
                    {
                        id: 1,
                        name: 'Bruce',
                        age: 21
                    }, 
                    {
                        id: 2,
                        name: 'Diana',
                        age: 18
                    }, 
                    {
                        id: 3,
                        name: 'Clark',
                        age: 22 
                    }
                ]
    
    const nameList = names.map((name, index) => <h1 key={index}> {index} {name}</h1>)
    return nameList   
}
export default ListRenderingKeys1