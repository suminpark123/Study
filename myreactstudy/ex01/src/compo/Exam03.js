import { useState } from "react";

function Exam03() {
  let [name, setName] = useState("수민"); //useState(상태값의 초기화)
  //리액트에서 변수는 한번 렌더링될때 보여진후에 다시 적용되지않는다.
  //Hooks: 리액트에서 기본적으로 제공하는 기능
  //useState :변수를 렌더링된후에도 변경시켜서 컴포넌트에 적용시킬수 있는방법
  // -->상태값, 상태값을 바꿀수 있는 함수-->비구조 할당
  function chName() {
    if (name == "수민") {
      setName("찬익");
    } else {
      setName("수민");
    }
  }
  return (
    <>
      {/* 리액트에서 페이지가 보여질때(렌더링될때) 
    변수는 맨 처음 초창기에만 적용되어진다.*/}
      <h1>{name}</h1>
      <button onClick={chName}>이름바꾸기</button>
    </>
  );
}
export default Exam03;
