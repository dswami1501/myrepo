import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { buyCake } from '../reactProject1'

function HooksCakeContainer() {
    const numOfCakes = useSelector(state => state.numOfCakes)
    const dispatch = useDispatch()
  return (
    <div>
        <h2>Num Of Cakes - {numOfCakes}</h2>
        <button onClick={() => dispatch(buyCake())}>Buy cake</button>
    </div>
  )
}

export default HooksCakeContainer