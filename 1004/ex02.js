//const { create } = require("domain");
const http = require("http");
const url_p = require("url");
//사용자가 보낸 url을 분석해주는 모듈
const temp = require("../1007/ex02Temp")

http
  .createServer(function (request, response) {
    console.log("서버호출성공");

    console.log(request.url);

    let query = url_p.parse(request.url, true).query;

    console.log(query);
    console.log("사용자가 입력한 id:" + query.id);
    console.log("사용자가 입력한 pw:" + query.pw);
    response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
    response.write(temp.ex02Temp(query));

    //URL을 통해서 사용자가 서버로 값을 보내는 방식 : QueryString
    //사용자가 보낸 id/pw값을 웹브라우저에 출력하시오.
    response.end();
  })
  .listen(3001);
