import logo from "./logo.svg";
import "./App.css";
import App2 from "./compo/App2";
import Exam01 from "./compo/Exam01";
import Exam02 from "./compo/Exam02";
import Exam03 from "./compo/Exam03";

//function App ->기본적인 컴포넌트
//컴포넌트의 첫번째 문자는 영어대문자 이어야만 한다.
function App() {
  const data = "Ap2";
  const name = "수민";
  return (
    //data 안에 있는 정보가 'App'이라면 '잼있는 리액트'만 출력

    <>
      <h1>{data == "App" ? "잼있는 리액트1" : "잼있는 리액트2"}</h1>
      {/* 부모 컴포넌트에서 자식컴포넌트로 데이터를 넘겨줄때는 속성값으로 넘겨줄수있다. */}
      <Exam01 name={name} />
      <Exam02 />
      <Exam03 />
    </>
  );
}

export default App;
