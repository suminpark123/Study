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

const session=require('express-session');
const session_mysql_save=require('express-mysql-session');



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


// 나의 DB정보를 하나의 객체 안에 저장
let dbInfo ={ 
host:"127.0.0.1",
user:"root",
password:"123456",
port:"3306",
database:"nodejs_DB"}

//3. 사용
//세션을 저장하기 위한 모듈을 사용하겠다 => 내 DB안에다가
let s_m_s=new session_mysql_save(dbInfo);

//4.미들웨어 등록
//세션을 등록할건데, session()안에다가 session 정보입력
app.use(session({
    //세션의 비밀 키 값을 등록 =>원하는 값 입력
    secret : 'sumin',
    //세션 값을 게속해서 새롭게 저장할건지 물어보는 것
    // => 변동사항이 없어도 매번 다시 저장하면 작동효율이 떨어진다
    // => false를 권장하는 편
    resave : false,
    //세션 값에 새로운 요청이 들어오면 그 값을 저장할건지 물어보는 것
    saveUninitialized : true,
    //이 정보를 어디에 저장할건지? 저장하는 모듈 등록
    store : s_m_s



}))

//미들웨어 : 요청과 응답할 때 사용해야하는 기능들을 선언
app.use(body_parser.urlencoded({extended:false}));
//서버에서 body-parser 기능을 사용하겠다라고 선언








//서버에서 router기능을 사용하겠다 선언
app.use(router);
app.listen(3001);