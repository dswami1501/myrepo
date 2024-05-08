import React from 'react'
import Person from './PersonKeys'

function ListRenderingKeys() {
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
    //Note:- Key props are not accessible in child component
    const personList = persons.map(person => <Person key={person.id} test={person} />)    
    return <div> {personList}</div>    
}
export default ListRenderingKeys