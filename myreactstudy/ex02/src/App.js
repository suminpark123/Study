import logo from './logo.svg';
import './App.css';
import Exam01 from './compo/Exam01';
import Exam03 from './compo/Exam03';
function App() {
  return (
    <>
    
    {/* 부모 컴포넌트에서 자식컴포넌트로 데이터를 넘겨줄때는 속성값으로 넘겨줄수있다. */}
    <Exam03 />
    
  </>
  );
}

export default App;
