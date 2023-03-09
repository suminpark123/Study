
const express =require("express")
const app=express();
const router=require("./router/router.js");

 //session
    //1.설치
    //npm i express-session --save
    // => 나 session 기능 사용할거다

    //npm i express-mysql-session --save
    // => mysql에다가 session 기능 임시 저장용


    //2.require(모듈 등록)
    const session=require('express-session');
    const session_mysql_save=require('express-mysql-session');

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

app.use(router);
app.listen(3001);