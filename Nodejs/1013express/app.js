//express를 사용하기 위한 3가지 단계
//1. 프로젝트의 정보가 기입되는 package.json파일생성
// ->npm init
//2. 프로젝트에 express 설치
// ->install express --save
//3. 폴더구성을 생성
// ->config(환경설정),public(정적),router(경로),views(동적),app.js(메인)


const express =require("express")
const app=express();

const router=require("./router/router.js");

//post방식일때 사용하는 모듈 request 분석해주는 express기능
const body_parser=require('body-parser');

//미들웨어 : 요청과 응답할 때 사용해야하는 기능들을 선언
app.use(body_parser.urlencoded({extended:false}));
//서버에서 body-parser 기능을 사용하겠다라고 선언






//서버에서 router기능을 사용하겠다 선언
app.use(router);
app.listen(3001);