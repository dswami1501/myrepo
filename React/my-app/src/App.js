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
import ClassCounter from './hooksPractical/1-UseStateDemo/ClassCounter';
import HookCounter from './hooksPractical/1-UseStateDemo/HookCounter';
import HookCounterTwo from './hooksPractical/1-UseStateDemo/2WithPreviousState/HookCounterTwo';
import HookCounterThree from './hooksPractical/1-UseStateDemo/3WithObject/HookCounterThree';
import HookCounterFour from './hooksPractical/1-UseStateDemo/4WithArrays/HookCounterFour';
// import ClassCounterOne from './hooksPractical/2-UseEffectDemo/1AfterRender/ClassCounterOne';
// import HookCounterOne from './hooksPractical/2-UseEffectDemo/1AfterRender/HookCounterOne';
import ClassCounterOne from './hooksPractical/2-UseEffectDemo/2ConditionallyRunEffects/ClassCounterOne';
import HookCounterOne from './hooksPractical/2-UseEffectDemo/2ConditionallyRunEffects/HookCounterOne';
import ClassMouse from './hooksPractical/2-UseEffectDemo/3OnlyOnce/ClassMouse';
import HookMouse from './hooksPractical/2-UseEffectDemo/3OnlyOnce/HookMouse';
import MouseContainer from './hooksPractical/2-UseEffectDemo/4CleanUp/MouseContainer';
import IntervalClassCounter from './hooksPractical/2-UseEffectDemo/5IncorrectDependency/IntervalClassCounter';
import IntervalHookCounter from './hooksPractical/2-UseEffectDemo/5IncorrectDependency/IntervalHookCounter';
import DataFetching1 from './hooksPractical/2-UseEffectDemo/6FetchData/DataFetching1';
import DataFetching2 from './hooksPractical/2-UseEffectDemo/6FetchData/DataFetching2';
import DataFetching3 from './hooksPractical/2-UseEffectDemo/6FetchData/DataFetching3';
import UserContextHooks from './hooksPractical/3-UseContextDemo/1Demo/UserContextHooks';
import UserContextHooks1 from './hooksPractical/3-UseContextDemo/2Demo/UserContextHooks1';
import CounterReducer from './hooksPractical/4-UserReducer/1SimpleStateAndAction/CounterReducer';
import CounterReducer2 from './hooksPractical/4-UserReducer/2ComplexStateAndAction/CounterReducer2';
import CounterReducer3 from './hooksPractical/4-UserReducer/3MultipleUseReducer/CounterReducer3';
import ParentCompo from './hooksPractical/4-UserReducer/4WithUseContext/ParentCompo';
import DataFetchingOne from './hooksPractical/5-DataFetching/DataFetchingOne';
import DataFetchingTwo from './hooksPractical/5-DataFetching/DataFetchingTwo';
import ParentCompono from './hooksPractical/6-UseCallBack/1NormalCode/ParentCompono';
import ParentCompono1 from './hooksPractical/6-UseCallBack/2OptimizedCode/ParentCompono1';
import Memo1 from './hooksPractical/7-UseMemo/Memo1';
import Memo2 from './hooksPractical/7-UseMemo/Memo2';
import Memo3 from './hooksPractical/7-UseMemo/Memo3';
import Memo4 from './hooksPractical/7-UseMemo/Memo4';
import Ref1 from './hooksPractical/8-UseRef/Ref1';
import Ref2 from './hooksPractical/8-UseRef/Ref2';
import HookTimer from './hooksPractical/8-UseRef/HookTimer';
import HookTimer1 from './hooksPractical/8-UseRef/HookTimer1';
import DocTitle1 from './hooksPractical/9-CustomHooks/DocTitle/Ex1/DocTitle1';
import DocTitle2 from './hooksPractical/9-CustomHooks/DocTitle/Ex2/DocTitle2';
import DocTitle3 from './hooksPractical/9-CustomHooks/DocTitle/Ex2/DocTitle3';
import HookCounterEx1 from './hooksPractical/9-CustomHooks/counter/Ex1/HookCounterEx1';
import HookCounterEx2 from './hooksPractical/9-CustomHooks/counter/Ex1/HookCounterEx2';
import HookCounterEx3 from './hooksPractical/9-CustomHooks/counter/Ex2/HookCounterEx3';
import HookCounterEx4 from './hooksPractical/9-CustomHooks/counter/Ex2/HookCounterEx4';
import HookCounterEx5 from './hooksPractical/9-CustomHooks/counter/Ex3/HookCounterEx5';
import HookCounterEx6 from './hooksPractical/9-CustomHooks/counter/Ex3/HookCounterEx6';
import UserForm1 from './hooksPractical/9-CustomHooks/UserForm/Ex1/UserForm1';
import UserForm2 from './hooksPractical/9-CustomHooks/UserForm/Ex2/UserForm2';

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
        {/* <PostForm/> */}
        {/* <ClassCounter/> */}
        {/* <HookCounter/> */}
        {/* <HookCounterTwo/> */}
        {/* <HookCounterThree/> */}
        {/* <HookCounterFour/> */}
        {/* <ClassCounterOne/> */}
        {/* <HookCounterOne/> */}
        {/* <ClassCounterOne/> */}
        {/* <HookCounterOne/> */}
        {/* <ClassMouse/> */}
        {/* <HookMouse/> */}
        {/* <MouseContainer/> */}
        {/* <IntervalClassCounter/> */}
        {/* <IntervalHookCounter/> */}
        {/* <DataFetching1/> */}
        {/* <DataFetching2/> */}
        {/* <DataFetching3/> */}
        {/* <UserContextHooks/> */}
        {/* <UserContextHooks1/> */}
        {/* <CounterReducer/> */}
        {/* <CounterReducer2/> */}
        {/* <CounterReducer3/> */}
        {/* <ParentCompo/> */}
        {/* <DataFetchingOne/> */}
        {/* <DataFetchingTwo/> */}
        {/* <ParentCompono /> */}
        {/* <ParentCompono1 /> */}
        {/* <Memo1/> */}
        {/* <Memo2/> */}
        {/* <Memo3/> */}
        {/* <Memo4/> */}
        {/* <Ref1/> */}
        {/* <Ref2/> */}
        {/* <HookTimer/> */}
        {/* <HookTimer1/> */}
        {/* <DocTitle1/> */}
        {/* <DocTitle2/> */}
        {/* <DocTitle3/> */}
        {/* <HookCounterEx1/> */}
        {/* <HookCounterEx2/> */}
        {/* <HookCounterEx3/> */}
        {/* <HookCounterEx4/> */}
        {/* <HookCounterEx5/> */}
        {/* <HookCounterEx6/> */}
        {/* <UserForm1/> */}
        {/* <UserForm2/> */}
    </div>
  );
}

export default App;
