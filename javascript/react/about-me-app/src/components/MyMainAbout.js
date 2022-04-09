import React from 'react';
import MyInfo from './PersonalInfo.js'

//const Hello 

const details = [
    {
      name: 'Emre',
      age: '28',
      color: 'Brunette',
    }
  ];

const MainComponent = (props) => (
  <div>
    <MyInfo
      details={details}
    />
  </div>
)

export default MainComponent;


// const MainComponent = (props) => (
//     <div>
//         <Infos
//       infos={info}
//     />      
//     </div>
//   )
  
// export default MainComponent