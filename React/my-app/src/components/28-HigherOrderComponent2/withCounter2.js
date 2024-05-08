import React from 'react';

const withCounter2 = (WrappedComponent, incrementNumber) => {
    class WithCounter2 extends React.Component {
        constructor(props) {
            super(props)
          
            this.state = {
               count: 0
            }
          }
      
          incrementCount = () =>{
              this.setState(prevState => {
                  return {count: prevState.count + incrementNumber}
              })
          }

        render(){
            return <WrappedComponent  
            count={this.state.count} 
            incrementCount={this.incrementCount}
            {... this.props}
            />
        }
    }
    return WithCounter2
}

export default withCounter2