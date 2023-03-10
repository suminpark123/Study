const express = require("express");
const router = express.Router();
const mysql = require("mysql"); //설치한 mysql기능
//사용자가 보낸 값이 post방식일때 분석해주는 express기능

let conn = mysql.createConnection({
  // 나의 DB 정보
});

router.get("/", function (request, response) {
  console.log("Happy Hacking!");
});

router.get("/join", function (request, response) {
  console.log("Happy Hacking2!");
});

router.get("/login", function (request, response) {
  console.log("Happy Hacking3!");
});

module.exports = router;
