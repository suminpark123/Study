

const http = require("http");
const url_p = require("url");//get방식일때사용하는 모듈(url)
const qs=require('querystring');
//post방식일때 사용하는 모듈(패킷안에 body영역)
const temp=require('../1007/ex02Temp.js')

http.createServer(function (request, response) {
    console.log("서버호출성공");
    console.log(request.url);

    //post방식때 데이터를 읽어들이는 방법 2가지

    //1.패킷안에 body영역을 읽어들이는 영역
    let body="";
    request.on('data',function(data){
        body +=data;
    })
    //2.모든 데이터를 읽어들이고 분석해서 출력하는 부분
    request.on('end',function(){
     let post =qs.parse(body);
        console.log(post);
        response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
        response.write(temp.JoinTemp(post));
        //response.write(result_HTML)
        response.end();



        
    })
    
   

  })
  .listen(3001);
