import {useState} from "react";

//리액트에서 기본적으로 제공하는기능! : Hooks
function Ex02(){

    //p158~pp170
    //투두리스트 p255~270
    //useState 만든 변수는 상태값으로써
    //렌더링이 된후에도 바뀐값을 확인할수있다.
    const [data,setData] =useState("");
    const [inputList,setList] =useState([]);
    
    
    function add(e){
        console.log(e.target.value);
        // data=e.target.value
        setData(e.target.value);
      

    }
    //배열에 데이터 저장하는 기능
    function setDataList(){
        
        //let array=[data];
        setList(inputList.concat(data));
        //javascript에서 배열에 추가할때 :push
        //react에서 배열을 추가할때는 concat 사용
        //불변성 유지때문에 : 상태값을 업데이트(수정)할때는 기존의 상태를
        //그대로 두면서 새로운 값을 상태값으로 설정해야함
        //-->기존의 배열은 그대로 두고 새로운 배열을 만들어서 적용해 줘야한다.
        
    }

    // function deleteList(e){

    //    console.log(e.target.value);
    //    //선택한 인덱스 값이 아닐때만 새로운 배열을 만들어서 적용
    //    setList(inputList.filter(function(data,index){
    //         return index != e.target.value
    //    }))
    // }
    const remove = (e) =>{
        setList(inputList.filter((todo,index)=> index != e.target.value));
    }

    return(

        <>
        <h1>TodoList</h1>
        <input id='ee' onChange={add}></input>
        <button onClick={setDataList}>추가</button>
        {/* map함수 : 기존의 배열을 특정한 규칙에 맞는 새로윤 배열로 만드는 함수 */}
        {inputList.map(function(inputData,index){
            return (
                <div>
                
               <h1>{inputData}</h1>
                <button onClick={remove} value={index}>삭제</button>
                </div>
            )
        })}

        </>

    );



}
export default Ex02;