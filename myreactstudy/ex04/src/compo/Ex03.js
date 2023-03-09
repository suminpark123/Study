import {useEffect,useRef,useState} from 'react'
//useRef : 컴포넌트 내부에서 일관된 이벤트를 적용시키기 위한 기능



function Ex03(){
    const [chcolor,setcolor]=useState('black')
    const h1 =useRef();
    //const [Message,setMessage]=useState(<h1>오늘은 야근 확정</h1>);


    // function color1(){
    //     //setMessage(<h1 style={{color :"red"}}>오늘은 야근 확정</h1>)
    //     setcolor('red')
    // }

    useEffect(function(){
        if(chcolor=='red'){
            //h1를 가지고와서 텍스트를 수정해주고싶다.
            //document.getElementById('text').innerText="야근취소"
            h1.current.innerText='야근취소되라 얍'
        }
        })
    
        





 
    return(
        <>
        
       <h1 style={{color:chcolor}} ref={h1}>오늘은 야근 확정</h1>
       
       <button onClick={()=>setcolor('red')}>색깔변경</button>
        </>

        
    );
}
export default Ex03