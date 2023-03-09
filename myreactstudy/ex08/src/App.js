import logo from "./logo.svg";
import "./App.css";
import Ex01 from "./compo/Ex01";
import Ex02 from "./compo/Ex02";
import Ex03 from "./compo/Ex03";
import { Routes, Route } from "react-router-dom";

//1. 컴포넌트끼리 공유할수 있는 공간 만들기
//2.공유하고 있는 공간에 데이터를 바꿀수 있는 reducer 만들기
//3.공유할 컴포넌트에 권한 부여하기
import { createStore } from "redux";
import { Provider } from "react-redux";

function reducer(currentState, action) {
  //currentState ->현재공유하고있는 값
  //action ->컴포넌트에서 요청한 message

  //현재공유하는 값이 없을때
  if (currentState === undefined) {
    return {
      num: 0,
    };
  }
  if (action.type == "plus") {
    currentState.num = action.data;
  }
  return { ...currentState };
}
//공유하는 공간
const store = createStore(reducer);
function App() {
  return (
    <Provider store={store}>
      <Routes>
        <Route path="/" element={<Ex01></Ex01>}></Route>
        <Route path="/ex01" element={<Ex02></Ex02>}></Route>
        <Route path="/ex02" element={<Ex03></Ex03>}></Route>
      </Routes>
    </Provider>
  );
}
//프로바이더 안에 라우츠들은 스토어에 접근가능
export default App;
