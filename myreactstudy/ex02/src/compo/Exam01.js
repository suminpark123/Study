import { useState } from "react";
import Exam02 from "./Exam02";

function Exam01() {

   
  let [text, setText] = useState("안녕하세용!"); //useState(상태값의 초기화)
  //리액트에서 변수는 한번 렌더링될때 보여진후에 다시 적용되지않는다.
  //Hooks: 리액트에서 기본적으로 제공하는 기능
  //useState :변수를 렌더링된후에도 변경시켜서 컴포넌트에 적용시킬수 있는방법
  // -->상태값, 상태값을 바꿀수 있는 함수-->비구조 할당
  function chText() {
   
      setText("안녕하세용!");
  }
  function chText2() {
      setText("안녕히가세용!");
  }
  let [color,setColor] =useState('black')

  function chcolor(){
    
        setColor("red")  
  } 
   
  function chcolor2(){
    
     
    setColor("green")
  } 
    
   function chcolor3(){ 
    setColor('blue')
    
  }
  
  
  return (
    <>
      {/* 리액트에서 페이지가 보여질때(렌더링될때) 
    변수는 맨 처음 초창기에만 적용되어진다.*/}
      
      <button onClick={chText}>입장</button>
      <button onClick={chText2}>퇴장</button>
      <h1 style={{color}}>{text}</h1> 
      {/* 컬러는 객체형식으로 중괄호필수 */}
      <button onClick={chcolor}>빨강</button>
      <button onClick={chcolor2}>초록</button>
      <button onClick={chcolor3}>파랑</button>
      <Exam02 color={{color}}/>
      
      {/* 온클릭 이벤트는 컴포너늩에 바로 적용시킬수 없다
      이벤트를 적용시키기 위해서는 컴포넌트를 구성하는 요소에 직접적으로 적용해줘야한다. */}


    </>
  );
}
export default Exam01;
