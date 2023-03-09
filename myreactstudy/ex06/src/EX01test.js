import axios from "axios";
// axios react에서 비동기 통신작업을 할 수 있는 기능
import {useState} from 'react'
// 컴포넌트에서 안정적으로 통신이 진행되지 않는다면
// 응답 데이터는 promise type 으로 가져온다!
//컴포넌트에서 안정적으로 통신이 진행하기 위해서는
//async ~ await가 필요하다!
function Ex01test(){
    const [movieArray, setMovieArray] = useState([]);
    const [movieArray2, setMovieArray2] = useState('');

    async function getMovieData(){
        const result = await axios.get("http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt="+movieArray2);
        setMovieArray(result.data.boxOfficeResult.dailyBoxOfficeList)
        
        
       

    }
return(
    <>

    <h1>영화 가져오기</h1>
    ;
    <input onChange={(e)=>setMovieArray2(e.target.value)}></input>
    <button onClick={getMovieData}>getMovie</button>
    <table border="1" id="movieInfo">
        <tr>
            <td>순위</td>
            <td>영화명</td>
            <td>개봉일</td>
        </tr>
        {movieArray.map(function(data){
            //map : 배열전체에 일정한 규칙을 적용하여
            //기존 배열과 갯수가 같은 새로운 배열을 만드는 함수

            //filter :배열 전체에 조건을 부여해서
            //해당하는 요소들만 뽑아서 새로운 배열을 만드는 함수
            return(
                <tr>
                    <td>{data.rank}</td>
                    <td>{data.movieNm}</td>
                    <td>{data.openDt}</td>
                </tr>
            )
        })}
    </table>
    </>
)
}
export default Ex01test