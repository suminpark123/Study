import { useEffect, useState } from "react";

function Ex01() {
  const [message, setMessage] = useState("오늘도 파이팅");
  //useEffect : 렌더링 될때 (사용자한테 보여질때) 이것부터 실행해주세요
  //리렌더링 : 사용자가 보여지는 화면이 바뀌어질때!
  useEffect(function () {
    console.log("오늘도 파이팅");
  });

  function add() {
    // setMessage('내일도 파이팅')
    let num = 1;
    console.log(num);
  }
  //버튼이 클릭되며 message를 '내일도 파이팅'으로 고치기
  return (
    <>
      <h1>{message}</h1>
      <button onClick={add} id="ex01">
        클릭
      </button>
    </>
  );
}
export default Ex01;
