const express = require("express");
const app = express();
const router = require("./router/router");
const bodyParser = require("body-parser");

const session = require("express-session");
const session_mysql_save = require("express-mysql-session");

//path :경로 처리를 해주는 모듈
//여러 환경때문에 프로그램이 특정 운영체제에서만 돌아가는 것을 방지하기 위함
const path = require("path");

//cors : 외부에 있는 정보들을 주고 받을 때 필수적으로 등록해야하는 모듈
const cors = require("cors");
const { dirname } = require("path");

// 이 폴더 안에 있는 static파일 가져다가 쓸게요
app.use(express.static(path.join(__dirname, "react-project", "bulid")));

//axios로 값을 주고 받을때 꼭 필요한 미들웨어
app.use(express.json());
app.use(cors());

let dbInfo = {
  //본인 DB정보채우기
  host: "127.0.0.1",
  user: "root",
  password: "123456",
  port: "3306",
  database: "nodejs_DB",
};

let SMS = new session_mysql_save(dbInfo);

app.use(
  session({
    secret: "smart",
    resave: false,
    saveUninitializedt: true,
    store: SMS,
  })
);

app.use(bodyParser.urlencoded({ extended: false }));
app.use(router);
app.listen(3001);
