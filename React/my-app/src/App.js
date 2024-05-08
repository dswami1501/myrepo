import './App.css';
import Greet from './components/1-functional-component/Greet';
import {Greeting} from './components/1-functional-component/NamedExport';
import Welcome from './components/2-class-component/Welcome';
import Hello from './components/3-jsx-example/Hello';
import PropsExampleWithComponent from './components/4-props-example/PropsExampleWithComponent';
import PropsExampleWithClassCompnent from './components/4-props-example/PropsExampleWithClassCompnent';
import ClassStateExample from './components/5-state-example/ClassStateExample';
import Counter from './components/6-setState-ex/Counter';
import DestructuringPropsNdState from './components/7-DestructuringPropsNdState/DestructuringPropsNdState'
import DestructuringPropsNdStateWithClass from './components/7-DestructuringPropsNdState/DestructuringPropsNdStateWithClass';
import EventHandling from './components/8-EventHandling/EventHandling';
import EventHandlingInClass from './components/8-EventHandling/EventHandlingInClass';
import BindingEventApproach1 from './components/9-BindingEvent/BindingEventApproach1';
import BindingEventApproach2 from './components/9-BindingEvent/BindingEventApproach2';
import BindingEventApproach3 from './components/9-BindingEvent/BindingEventApproach3';
import BindingEventApproach4 from './components/9-BindingEvent/BindingEventApproach4';
import MethodPropParent from './components/10-MethodProp/MethodPropParent';
import MethodPropParentParam from './components/10-MethodProp/WithParameter/MethodPropParentParam';
import Approach1 from './components/11-ConditionalRendering/Approach1';
import Approach2 from './components/11-ConditionalRendering/Approach2';
import Approach3 from './components/11-ConditionalRendering/Approach3';
import Approach4 from './components/11-ConditionalRendering/Approach4';
import ListRendering1 from './components/12-ListRendering/ListRendering1';
import ListRendering2 from './components/12-ListRendering/ListRendering2';
import ListRenderingKeys from './components/13-keys/ListRenderingKeys';
import ListRenderingKeys1 from './components/14-IndexAsKey-AntiPattern/ListRenderingKeys1';
import Stylesheet from './components/15-StylingAndCSS/Stylesheet';
import Inline from './components/15-StylingAndCSS/InlineStyling/Inline';
import FormHandling from './components/16-FormHandling/FormHandling';
import LifecycleA from './components/18-LifeCycleMethods/Mounting/LifecycleA';
import LifecycleAB from './components/18-LifeCycleMethods/Updating/LifecycleAB';
import FragmentDemo from './components/19-Fragments/FragmentDemo';
import Tables from './components/19-Fragments/Tables';
import ParentComp from './components/20-PureComponents/ParentComp';
import ParentMemoComp from './components/21-memo/ParentMemoComp';
import RefsDemo from './components/22-RefsExample/RefsDemo';
import RefsDemo1 from './components/22-RefsExample/RefDemo1';
import FocusInput from './components/23-RefsClassComponent/FocusInput';
import FRParentInput from './components/24-ForwardingRef/FRParentInput';
import PortalDemo from './components/25-portals/PortalDemo';
import HeroParent from './components/26-ErrorBoundaries/HeroParent';
import ClickCounter from './components/27-HigherOrderComponent/ClickCounter';
import HoverCounter from './components/27-HigherOrderComponent/HoverCounter';
import ClickCounter2 from './components/28-HigherOrderComponent2/ClickCounter2';
import HoverCounter2 from './components/28-HigherOrderComponent2/HoverCounter2';
import ClickCounterRenderProps from './components/29-RenderProps/ClickCounterRenderProps';
import HoverCounterRenderProps from './components/29-RenderProps/HoverCounterRenderProps';
import User from './components/30-RenderProps2/User';
import UserParent from './components/30-RenderProps2/UserParent';
import CounterRenderProps2 from './components/30-RenderProps2/CounterRenderProps2';
import ClickCounterRenderProps1 from './components/30-RenderProps2/ClickCounterRenderProps1';
import HoverCounterRenderProps1 from './components/30-RenderProps2/HoverCounterRenderProps1';
import A from './components/31-Context/A';
import { UserProvider } from './components/31-Context/userContext';
import { UserProvider1 } from './components/32-Context2/userContext1';
import A1 from './components/32-Context2/A1';
import PostList from './components/33-HttpGetRequest/PostList';
import PostForm from './components/33-HttpGetRequest/PostForm';
function App() {
  return (
    <div className="App">
      {/* <Greet/> */}
      {/* <Greeting/> */}
      {/* <Welcome/> */}
      {/* <Hello/> */}
      {/* <PropsExampleWithComponent name="Bruce" heroName="Batman">
        <p>Testing multiple lines</p>
      </PropsExampleWithComponent>
      <PropsExampleWithComponent name="Clark" heroName="Superman">
        <button>action</button>
      </PropsExampleWithComponent>
      <PropsExampleWithComponent name="Diana" heroName="Wonder Women"/> */}
      {/* <PropsExampleWithClassCompnent name="Bruce" heroName="Batman"/>      
      <PropsExampleWithClassCompnent name="Clark" heroName="Superman"/>
      <PropsExampleWithClassCompnent name="Diana" heroName="Wonder Women"/> */}
      {/* <ClassStateExample/> */}
      {/* <Counter/> */}
      {/* <DestructuringPropsNdState name="Bruce" heroName="Batman"/> */}
      {/* <DestructuringPropsNdStateWithClass name="Bruce" heroName="Batman"/> */}
      {/* <EventHandling/> */}
      {/* <EventHandlingInClass/> */}
      {/* <BindingEventApproach1/> */}
      {/* <BindingEventApproach2/> */}
      {/* <BindingEventApproach3/> */}
      {/* <BindingEventApproach4/> */}
      {/* <MethodPropParent/> */}
      {/* <MethodPropParentParam/> */}
      {/* <Approach1/> */}
      {/* <Approach2/> */}
      {/* <Approach3/> */}
      {/* <Approach4/> */}
      {/* <ListRendering1/> */}
      {/* <ListRendering2/> */}
      {/* <ListRenderingKeys/> */}
      {/* <ListRenderingKeys1/> */}
      {/* <Stylesheet test={true}/> */}
      {/* <Inline/> */}
      {/* <FormHandling/> */}
      {/* <LifecycleA/> */}
      {/* <LifecycleAB/> */}
      {/* <FragmentDemo/> */}
      {/* <Tables/> */}
      {/* <ParentComp/> */}
      {/* <ParentMemoComp/> */}
      {/* <RefsDemo/> */}
      {/* <RefsDemo1/> */}
      {/* <FocusInput/> */}
      {/* <FRParentInput/> */}
      {/* <PortalDemo/> */}
      {/* <HeroParent/> */}
      {/* <ClickCounter/> */}
      {/* <HoverCounter/> */}
      {/* <ClickCounter2 name='Deepak'/> */}
      {/* <HoverCounter2/> */}
      {/* <ClickCounterRenderProps/> */}
      {/* <HoverCounterRenderProps/> */}
      {/* <UserParent/> */}
      {/* <CounterRenderProps2 
      name = {(count, incrementCount) => (
        <ClickCounterRenderProps1 count={count} incrementCount={incrementCount} />
      )}
      /> */}
      {/* <CounterRenderProps2 
      name = {(count, incrementCount) => (
        <HoverCounterRenderProps1 count={count} incrementCount={incrementCount} />
      )}
      />       */}
      {/* <UserProvider value='Deepak'>
        <A/>
      </UserProvider> */}      
        {/* <A1/> */}
        {/* <PostList/> */}
        <PostForm/>
    </div>
  );
}

export default App;
