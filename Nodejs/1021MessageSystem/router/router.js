const { render, compile } = require("ejs");
const { response } = require("express");
const express = require("express");

const router = express.Router();

const mysql = require("mysql"); //설치한 mysql기능

let conn = mysql.createConnection({
  //db연결
  host: "127.0.0.1",
  user: "root",
  password: "123456",
  port: "3306",
  database: "nodejs_DB",
});

//메인페이지
router.get("/", function (req, res) {
  console.log("메인라우터");
  res.render("Message", {});
});

router.post("/Join", function (request, response) {
  console.log("회원가입 라우터");
  let id = request.body.id;
  let pw = request.body.pw;
  let Number = request.body.Number;
  let address = request.body.address;

  request.session.user = {
    id: id,
    pw: pw,
    Nb: Number,
    address: address,
  };

  let sql = "insert into member2 values(?,?,?,?)";

  conn.query(sql, [id, pw, Number, address], function (err, rows) {
    if (!err) {
      //만약 에러가 안났으면
      console.log("입력성공");
      // response.redirect("http://127.0.0.1:3001/");

      response.render("Message", {
        userid: request.session.user.id,
        // ucomment: request.query.comment,
        // inout: request.query.btn,
        // usering: request.query.ing,
      });
      console.log("세션등록성공");
    } else {
      console.log("입력실패" + err);
    }

    // response.redirect("http://127.0.0.1:3001/");
  });

  console.log(request.session.user.id);
  console.log(request.session.user.pw);
  console.log(request.session.user.Nb);
  console.log(request.session.user.address);
});

// router.post("/Login", function (request, response) {
//   console.log("로그인 라우터");
//   // console.log(request.query.id)
//   // console.log(request.query.pw)

//   console.log("사용자가 보낸 값 :" + request.body.id);
//   console.log("사용자가 보낸 값 :" + request.body.pw);

//   let id = request.body.id;
//   let pw = request.body.pw;

//   //   request.query.comment = "님이 로그인에 성공하셨습니다.";
//   //   request.query.btn = "";
//   //   request.query.ing = "";
//   let sql = "select * from member2 where id=? and pw=?";

//   conn.query(sql, [id, pw], function (err, rows) {
//     if (rows.length > 0) {
//       console.log("로그인성공 : " + rows.length);

//       response.render("Message", {
//         // userid: request.session.user.id,
//         // ucomment: request.query.comment,
//         // inout: request.query.btn,
//         // usering: request.query.ing,
//       });
//       console.log("세션등록성공");
//     } else {
//       console.log("로그인실패 :" + rows.length);
//     }
//   });
// });

module.exports = router;
//router에 대한 정보를 갖고있는 객체를 외부에서 사용할 수 있게 모듈화
