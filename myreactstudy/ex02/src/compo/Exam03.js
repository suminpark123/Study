import { useState } from "react";

function Exam03(){
    
    const [inputId,setId] =useState('');
    const [inputPw,setPw] =useState('');
    const [loginMessage,setMessage]=useState('');

    // if(id=='SMHRD'&& pw=='123'){
    //     console.log("환영")
    // }
    //inputID에 적은값을 가져오기
    function inputIdText(e){
        //e:이벤트 객체(이벤트에 대한 전반적인 모든 정보가 들어가 있는 객체)
        //e.target: 이벤트를 실행시키는 주체 ! -> input 태그
        setId(e.target.value);
        
    }
    function inputPwText(e){
        //e:이벤트 객체(이벤트에 대한 전반적인 모든 정보가 들어가 있는 객체)
        //e.target: 이벤트를 실행시키는 주체 ! -> input 태그
        setPw(e.target.value);
    }
    
    function cckk(){
        if(inputId==='SMHRD' && inputPw==='123'){
            setMessage("환영합니다")
        }
        else{
            setMessage("다시")
        }


        //inputID에 적은값을 가져오기
    //    if(document.getElementById('id').value=='SMHRD' && document.getElementById('pw').value=='123'){
    //         document.getElementById('result').innerText='환영'
    //    }
    //    else{
    //     document.getElementById('result').innerText='다시'

    //    } 
       
      
        
        
    }
    return(
        //onChange : 태그안에 값이 바뀌면 실행해주세요

        <>
            <input placeholder="아이디입력" id="id" onChange={inputIdText}></input>
            <input placeholder="비밀번호입력" id="pw" onChange={inputPwText}></input>
            <button onClick={cckk}>로그인</button>
            <h1 id="result">{loginMessage}</h1>
            
        
        
        
        </>

    );
    
}
export default Exam03