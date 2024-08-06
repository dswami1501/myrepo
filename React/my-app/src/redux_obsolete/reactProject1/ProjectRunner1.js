import React from 'react'
import CakeContainer from './CakeContainer'
import {Provider} from 'react-redux'
import store from './store'
import HooksCakeContainer from './HooksCakeContainer'

function ProjectRunner1() {
  return (
    <Provider store={store}>
    <div>
      <HooksCakeContainer/>
      <CakeContainer/>
    </div>
    </Provider>
  )
}

export default ProjectRunner1