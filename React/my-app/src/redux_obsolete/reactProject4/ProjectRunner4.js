import React from 'react'
import CakeContainer from './CakeContainer'
import {Provider} from 'react-redux'
import store from './store'
import IceCreamContainer from './IceCreamContainer'
import NewCakeContainer from './NewCakeContainer'
import ItemDisplay from './ItemDisplay'

function ProjectRunner4() {
  return (
    <Provider store={store}>
    <div>
      <ItemDisplay cake/>
      <ItemDisplay/>
        <NewCakeContainer/>
        <CakeContainer/>
        <IceCreamContainer/>
    </div>
    </Provider>
  )
}

export default ProjectRunner4