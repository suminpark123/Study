import { Link,useSearchParams } from "react-router-dom";


//useSearchParams : 쿼리스트링(주소값)에 있는 데이터를 꺼내올때사용하는 기능 

function About2(){

    const [params,setParams] = useSearchParams();
    
    //params:쿼리스트링으로 보낸 데이터를 객체 형식으로 가지고 있다.
    const name =params.get("name");//get ->쿼리스트링에있는 value값을 가져오는 기능
    const foods =params.get("food");
    
    
    return(


        <>
            <h1>Sub2</h1>
            <p>넘겨받은이름 :{name}</p>
            <button onClick={()=>setParams({name :'세연',food:foods})}>이름바꾸기</button>
            <p>넘겨받은음식 :{foods}</p>

            {/* <Link to="/"><button>본페이지로 이동</button></Link> */}
            
        </>
    );
}

export default About2