import {useEffect,useState} from 'react'

function Ex02(){
    
    const [inputId,setId] =useState('');
    const [inputPw,setPw] =useState('');
    const [loginMessage,setMessage]=useState('');
    
    //렌더링의기준 : 사용자에게 보여지는 화면도 맞지만
    //상태값도 마찬가지로 렌더링에 영향을 끼친다 
    //useEffect : 렌더링 될때 (사용자한테 보여질때) 이것부터 실행해주세요
    //리렌더링 : 사용자가 보여지는 화면이 바뀌어질때!
    useEffect(function(){

        
        console.log('오늘도1 파이팅')
        if(inputId==='smhrd' && inputPw==='123'){
            setMessage(inputId+"님 환영합니다")
        }
        else {

            setMessage("로그인실패")
        }
        
       
    },[inputPw]); //useEffect 실행하는기준을 임의로 지정하는방법

    
    // function inputIdText(e){
       
    //     setId(e.target.value);
        
    // }
    // function inputPwText(e){
        
    //     setPw(e.target.value);
    // }

    // function cckk(){
    //     if(inputId==='smhrd' && inputPw==='123'){
    //         setMessage(inputId+"님 환영합니다")
    //     }
    //     else{
    //         setMessage("로그인실패")
    //     }
    // }
    
    return(
        <>
            <input placeholder="아이디입력" id="id" onChange={(e)=>{setId(e.target.value)}}></input>
            <br/>
            <input placeholder="비밀번호입력" id="pw" onChange={(e)=>{setPw(e.target.value)}}></input>
            
            <h1 id="result">{loginMessage}</h1>
        </>
    );
}
export default Ex02