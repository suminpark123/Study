import {Link} from  "react-router-dom";

function About1(){
    return(
        <>
        
            <h1>Sub1</h1>
            {/* 데이터 전송 첫번째:쿼리스트링방식!
            -->주소값에 넘기고 싶은 데이터를 명시!
            -->다음페이지에서 주소값을 통해 데이터를 가져옴 */}
            <Link to="/about2?name=승환&food=짜장면"><button>sub2로 이동</button></Link>
        </>
    );
}

export default About1