import React from 'react'
import CakeContainer from './CakeContainer'
import {Provider} from 'react-redux'
import store from './store'
import IceCreamContainer from './IceCreamContainer'

function ProjectRunner() {
  return (
    <Provider store={store}>
    <div>
        <CakeContainer/>
        <IceCreamContainer/>
    </div>
    </Provider>
  )
}

export default ProjectRunner