
const express =require("express")
const app=express();
const router=require("./router/router.js");
const body_parser=require('body-parser');
const ejs=require('ejs');

//view Engine :서버에서 처리한 데이터
//              편리하게 출력해주는 역할
// 여러 종류의 뷰엔진이 있지만 우리는 EJS를 사용할 것
// EJS(Embedded Javascript Template) -JS문법 사용

// (1) 설치 : npm i ejs --save
// (2) 등록 : require
// (3) 미들웨어 선언
// 화면엔진을 EJS로 세팅한다
// 왜 얘만 set을 사용할까? express 내부적으로 engine이 이미 설정되어있기 때문

app.set('view engine','EJS');
app.use(body_parser.urlencoded({extended:false}));


app.use(router);
app.listen(3001);