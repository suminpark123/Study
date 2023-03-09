import logo from './logo.svg';
import './App.css';

//각각의 컴포넌트 페이지에 대해서 주소값을 달아주기위한 재료 import
import {Route,Routes} from 'react-router-dom'
//Route :각각의 컴포넌트에 주소값을 적용시켜주는 기능
///Routes : 주소값이 붙은 컴포넌트들을 관리해주는 기능, 옛날이름 Switch
import Home from './compo/Home';
import About1 from './compo/About1';
import About2 from './compo/About2';
import {Link} from  "react-router-dom";
import Menu from './compo/menu';
import About3 from './compo/About3';

function App() {
  return (
      <>
      
      <Menu/>
      <Routes>
      {/* path=>원하는 요소(컴포넌트에) 주소값을 부여해주는 역할 */}
      {/* '/'하나만 적을경우 기본값인 localhost:3000이라는 주소값이 부여됨
       element => 주소값을 부여할 컴포넌트를 정의
      */}
      <Route path='/' element={<Home></Home>}></Route>     
      <Route path='/about' element={<About1></About1>}></Route>
      <Route path='/about2' element={<About2/>}></Route>
      <Route Path='/about3' element={<About3/>}></Route>

      </Routes>
      
     
    
      </>
    
  );
}

export default App;
