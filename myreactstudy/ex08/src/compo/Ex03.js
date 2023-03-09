import { useSelector } from "react-redux";
//useSelector :공유 되고있는 데이터를 가져오는 역할

function Ex03() {
  //useSelector((data) => data.num) data ->현재 공유하고있는 값
  const num = useSelector((data) => data.num);
  return (
    <>
      <h1>Ex03메인페이지</h1>
      <h1>{num}</h1>
    </>
  );
}
export default Ex03;
