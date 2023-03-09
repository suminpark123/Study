import axios from 'axios'
import { useState } from 'react';
//axios react 에서 비동기 통신작업을 할 수 있는 기능


function Ex01(){

    const [one,setone] = useState([]);
    async function getMoivedData(){
     //컴포넌트에서 안정적으로 통신이 진행되지 않는다면 
     //응답 데이터는 promise type 으로 가져온다.
     //컴포넌트에서 안정적으로 통신이 진행 되기 위해서는 
     //async ~ await 가 필요하다.
      const result=await axios.get("http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101");
      


    let movieArray=result.data.boxOfficeResult.dailyBoxOfficeList
   

    // for (let i=0; i<11; i++){
    //     let movien=result.data.boxOfficeResult.dailyBoxOfficeList[i].movieNm
    //     let movier=result.data.boxOfficeResult.dailyBoxOfficeList[i].rank
    //     let movieo=result.data.boxOfficeResult.dailyBoxOfficeList[i].openDt

    // }

      
      
    
    
    let array2=movieArray.map(function(data){

        return (
            <>
           
            <tr>
                <td>{data.rank}</td>
                <td>{data.movieNm}</td>
                <td>{data.open.Dt}</td>               
            </tr>
            </>
            
        );  
     })
     setone(array2);
    


     
      
     
    


    }
return(

        <>
        <h1>영화 가져오기</h1>
        <button onClick={getMoivedData}>GetMovie</button>
        <table border="1" id="movieInfo">
        <tr>
            <td>순위</td>
            <td>영화명</td>
            <td>개봉일</td>
        </tr>
        {one}

        
            
        </table>
        </>


    );
    }
export default Ex01 