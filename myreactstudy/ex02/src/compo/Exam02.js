import { useState } from "react";

function Exam02(props){

    let [text1, setText1] = useState("두번째 컴포넌트"); //useState(상태값의 초기화)
 
//     function ck11(){
//         document.getElementsByTagName('h1')[1].innerText="칼퇴"
//   }

  function chText1() {
   
    setText1("칼퇴");
}
    return (
    <h1 style={props.color} onClick={chText1}>{text1}</h1>
    );


}



export default Exam02;