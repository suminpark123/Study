const http = require("http");
const url_p = require("url");

const temp=require('../1007/ex02Temp.js')



http
  .createServer(function (request, response) {
    console.log("서버호출성공");

    console.log(request.url);

    let query = url_p.parse(request.url, true).query;
    
    console.log(query);
    console.log("이름:" + (query.name));
    console.log("자바점수:" + (query.java));
    console.log("WEB점수:" + (query.web));
    console.log("IOT점수:" + query.iot);
    console.log("ANDROID점수:" + query.android);
    
  
    

    



    response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
    result_HTML=(temp.GradeTemp(query));
    response.write(result_HTML);
    //URL을 통해서 사용자가 서버로 값을 보내는 방식 : QueryString
    //사용자가 보낸 id/pw값을 웹브라우저에 출력하시오.
    response.end();
  })
  .listen(3001);
