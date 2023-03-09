import { useState } from "react";

function Exam02() {
  const [num, setnum] = useState(0);

  function add() {
    setnum(++num);
  }
  function minus() {
    if (num > 0) {
      setnum(--num);
    } else {
      setnum(0);
    }
  }
  return (
    <>
      <button onClick={add}>+</button>

      <span>{num}</span>
      <button onClick={minus}>-</button>
    </>
  );
}
export default Exam02;
