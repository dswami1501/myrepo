import React from 'react'
import CakeContainer from './CakeContainer'
import {Provider} from 'react-redux'
import store from './store'
import IceCreamContainer from './IceCreamContainer'
import NewCakeContainer from './NewCakeContainer'
import ItemDisplay from './ItemDisplay'
import UserContainer from './UserContainer'

function ProjectRunner5() {
  return (
    <Provider store={store}>
    <div>
      <ItemDisplay cake/>
      <ItemDisplay/>
        {/* <NewCakeContainer/>
        <CakeContainer/>
        <IceCreamContainer/> */}
        <UserContainer/>
    </div>
    </Provider>
  )
}

export default ProjectRunner5