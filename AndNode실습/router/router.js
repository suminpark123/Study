const express = require("express");
const router = express.Router();
const path = require("path");

router.get("/", function (req, res) {
  console.log("라우터 접속 감지!");
});

router.post("/login1", function (req, res) {
  console.log("로그인 라우터");
  //전달된 데이터 확인
  //비교

  console.log(req.body.pw);
  //{result: "성공"}
  if (req.body.id == "smhrd" && req.body.pw == "123") {
    res.json({ result: 1 });
  } else {
    res.json({ result: 0 });
  }
});

router.post("/join", function (req, res) {
  console.log("조인라우터");
  console.log(req.body);
  res.json({ result: 1 });
});

module.exports = router;
