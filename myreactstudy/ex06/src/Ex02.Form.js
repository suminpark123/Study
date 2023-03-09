import { useRef } from "react";

const Ex02Form = () => {
  //1.Form 태그 사용해보기
  //2.Ref 로 DOM요소 선택해보기

  // React Form 사용할때는 onSubmit 이벤트
  // 매개변수에 e를 받아와서 e.preventDefault()처리
  // =>다른페이지로 이동하지 못하게 막아준다.

  // 특정 DOM을 선택해야할 때 , (=getElement~사용하고싶을때)
  // useRef 라는 리액트 훅

  const nameRef = useRef();
  const handleName = (e) => {
    e.preventDefault();
    console.log(nameRef.current.value);
  };

  return (
    <div>
      <form onSubmit={handleName}>
        Name :
        <input type="text" ref={nameRef} />
        <button type="submit">제출</button>
      </form>
    </div>
  );
};

export default Ex02Form;
