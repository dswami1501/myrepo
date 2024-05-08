import React from 'react'
import Person from './Person'

function ListRendering2() {
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
    // const personList = persons.map(person => <h2>I am {person.name}, I am {person.age} years old</h2>)
    // return <div> {personList}</div>
    const personList = persons.map(person => <Person test={person} />)    
    return <div> {personList}</div>    
}
export default ListRendering2