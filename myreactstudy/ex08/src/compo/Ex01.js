import { Link } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { useState } from "react";

//useDispatch 공유하고있는 저장소에 데이터를 수정하는기능
import Ex02 from "./Ex02";
import Ex03 from "./Ex03";
//페이지간의 이동
import { useDispatch } from "react-redux";

function Ex01() {
  const dispatch = useDispatch();
  const [num, setNum] = useState(0);
  const data = 11;
  const nav = useNavigate();
  function page() {
    if (data == 10) {
      nav("/ex01");
    } else {
      nav("/ex02");
    }
  }
  function chNum() {
    setNum(num + 1);

    //reducer에 message 보내기
    dispatch({
      type: "plus",
      data: num,
    });
  }
  //전값까지 디스패치로 이동

  return (
    <>
      <h1>메인페이지</h1>
      <button onClick={page}>페이지 이동</button>
      <br />
      {num}
      <button onClick={chNum}>+</button>
    </>
  );
}
export default Ex01;
