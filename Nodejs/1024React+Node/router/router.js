const express = require("express");
const router = express.Router();
const mysql = require("mysql"); //설치한 mysql기능
//사용자가 보낸 값이 post방식일때 분석해주는 express기능
const path = require("path");
let conn = mysql.createConnection({
  // 나의 DB 정보
  host: "127.0.0.1",
  user: "root",
  password: "123456",
  port: "3306",
  database: "nodejs_DB",
});
router.post("/joinData", function (request, response) {
  ///view (react) =>router로 데이터 보내기
  console.log("join router", request.body.id);
  console.log("join router", request.body.like);
  console.log("join router", request.body.pw);
  console.log("join router주소", request.body.add);
  // console.log("아이디값:" + id);

  //router => view (react)로 데이터 보내기
  response.json({ result: "success1", id: request.body.id });

  response.end();
});
module.exports = router;
