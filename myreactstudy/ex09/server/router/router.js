const express = require("express");
const router = express.Router();

const mysql = require("mysql"); //설치한 mysql기능
//사용자가 보낸 값이 post방식일때 분석해주는 express기능
var multer = require("multer");
var upload = multer({ test: "upload/" });

let conn = mysql.createConnection({
  host: "127.0.0.1",
  user: "root",
  password: "123456",
  port: "3306",
  database: "nodejs_DB",
});

router.post("/upload", upload.single("gicher"), (req, res) => {
  console.log("노드서버접속");
  console.log("1.  ");
  console.log(req.body);
  console.log("2.  ");
  console.log(req.file);

  let sql = "insert into imageTest values(?)";
  conn.query(sql, [req.file.buffer], function (err, rows) {
    if (rows.length == 0) {
      console.log("실패");
    } else {
      console.log("성공");
    }
  });
});
router.post("/getImage", (req, res) => {
  console.log("이미지가져오기서버");

  let sql = "select * from imageTest ";
  conn.query(sql, function (err, rows) {
    if (rows.length == 0) {
      console.log("실패");
    } else {
      console.log(rows[0]);
      console.log("성공");
      res.json({ image: rows[0] });
    }
  });
});

//  '/Login' 이라는 라우터를 만들어서 -> Sing in 버튼 눌렀을때
// 접근하게끔 만들어 주세요!
router.post("/Login", (req, res) => {
  console.log("로그인서버 접속!");
  //req 객체로 데이터 꺼내오기! //email, pw
  let id = req.body.email;
  let pw = req.body.pw;

  console.log("넘겨받은 id ", id);
  console.log("넘겨받은 pw ", pw);

  let sql = "select * from member where id = ? and pw = ?";
  conn.query(sql, [id, pw], function (err, rows) {
    if (rows.length > 0) {
      console.log("로그인성공");
      res.redirect("http://localhost:3000/presentation");
    } else {
      console.log("입력실패" + err);
    }
  });

  //Main 페이지로 이동
  //res.redirect("http://localhost:3000/presentation");
});

module.exports = router;
