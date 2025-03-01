import './App.css'
import { CakeView } from './features/cake/CakeView'
import { IcecreamView } from './features/iceCream/IcecreamView'
import { UserView } from './features/user/UserView'

function App() {  
  return (
    <div>
      <CakeView/>
      <IcecreamView/>
      <UserView/>
    </div>
  )
}

export default App
