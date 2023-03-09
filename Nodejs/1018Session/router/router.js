const express = require("express");
const router = express.Router();

router.get("/", function (request, response) {
  console.log("성공체크");
});
//세션저장 -로그인기능
router.get("/sessionSave", function (request, response) {
  console.log("session Save!");
  // console.log(request.query.id)
  // console.log(request.query.pw)

  let id = request.query.id;
  let pw = request.query.pw;

  //세션 등록
  //request.session.원하는변수이름 ={}
  //key 는 ""안에 작성 =>EJS render 작업할때와 비교해서 주의할 것★
  request.session.user = {
    id: id,
    pw: pw,
  };
  console.log("세션등록성공");
  //등록한 세션 확인
  console.log(request.session.user.id);
  console.log(request.session.user.pw);

  //응답을 끝내주는 작업
  response.end();
});
//로그인 상태 일때를
//세션 삭제-로그아웃기능
router.get("/sessionSaveDelete", function (request, response) {
  console.log("현재 user :" + request.session.user.id);

  //세션삭제
  delete request.session.user;
  console.log("로그아웃 되셨습니다" + request.session.user);
});

module.exports = router;
