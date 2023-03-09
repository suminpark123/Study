console.log("Node 실행확인");

// 모듈(Module) : 독립된 기능을 갖고있는 함수/파일(nodejs)

const http = require("http");
const temp= require("../1007/ex02Temp.js");



//require : nodejs에서 모듈을 갖고오는 기능
//http모듈 : 클라이언트에게 요청을 받고 응답해주는 모듈(js파일을 서버로 만들어주는 기능)

http
  .createServer(function (request, response) {
    //1.createServer : 현재 js파일을 서버로 만들어주는 기능
    //2.function(require,response) : 클라이언트가 요청한 값을 응답해주는 코드가 들어가는 부분
    console.log("누군가 서버에 접근");

    let ip = request.connection.remoteAddress;
    //request : 사용자의 모든정보를 갖고있는 객체.

    let ip_res = ip.substring(7);

    if (ip_res == "172.30.1.9") {
      console.log("팀원 환영");
    } else if (ip_res == "172.30.1.2") {
      console.log("팀원 환영");
    } else if (ip_res == "172.30.1.56") {
      console.log("팀원 환영");
    } else if (ip_res == "172.30.1.28") {
      console.log("팀원 환영");
    } else {
      console.log("다른 팀원 접근");
    }

    console.log("서버에 접근한 클라이언트의 IP: " + ip_res);

    response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });

    response.write(temp.ex01Temp());
    

    response.end();
  })
  .listen(3000);
//172.30.1.28
// ip (내 컴퓨터의 주소):port(프로그램이 실행되는 방번호) :172.30.1.28:3000

//터미널 명령어
//cd :폴더이동 [폴더명]
//cd.. : 전 폴더이동
//claer : 명령어 초기화
//ls : 파일목록확인
//방향키 위/아래 : 이전 명령어 확인
//tab : 파일명 자동완성
//주의사항 : 실행하려고하는 파일의 폴더에 와있는지/ 파일명이 정확한지
