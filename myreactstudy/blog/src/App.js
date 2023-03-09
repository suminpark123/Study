/*eslint-disable*/ 
import {useState} from 'react';
import logo from './logo.svg';
import './App.css';
function App() {

  let [num,setNum]=useState(0);
  function addfa(){
    setNum(num+1)
  }
  let [글제목,글제목변경]=useState(['남자코트추천','강남 우동맛집','파이썬독학']);
  function 제목바꾸기(){

    let a =[...글제목]
    a[0]='여자코트추천'
    글제목변경(a)
  }
  function 정렬하기(){
    let b =[...글제목]
    b[0]='강남 우동맛집'
    b[1]='여자코트추천'
    b[2]='파이썬독학'
    글제목변경(b)
  }
  let posts ='강남 고기 맛집'
  return (
    <div className="App">
      <div class="black-nav">
        <div>개발 Blog</div>
      </div>
      <button onClick={정렬하기}>버튼</button>
      <div className='list'>
      <h3>{글제목[0]}<span onClick={addfa}>👍</span>{num}</h3>
      <p>2월 17일 발행</p>
      <hr/>
      <h3>{글제목[1]}</h3>
      <p>2월 18일 발행</p>
      <hr/>
      <h3>{글제목[2]}</h3>
      <p>2월 19일 발행</p>
      <hr/>    
      </div>
      <Modal/>
    </div>
  );
}


  function Modal(){
    return(
        <div className='modal'>
            <h2>제목</h2>
            <p>날짜</p>
            <p>글내용</p>

        </div>
    )
  }


export default App;
