const { render } = require("ejs");
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

//join기능구현하기
router.post("/Join", function (request, response) {
  let id = request.body.id;
  let pw = request.body.pw;
  let nick = request.body.nick;

  conn.connect();

  //db sql문
  let sql = "insert into member values(?,?,?)"; //?값으로 대체
  conn.query(sql, [id, pw, nick], function (err, rows) {
    if (!err) {
      //만약 에러가 안났으면
      console.log("입력성공");
      response.redirect(
        "http://127.0.0.1:5501/1013express_DB/public/Main.html"
      );
    } else {
      console.log("입력실패" + err);
    }
  });
});

//로그인 기능구현하기
//조건1 /login 라우터를 구현
//조건2 사용자가 입력한 id가 'smart'이고 pw가 '123'인지 확인
//조건3 참이면 s이동 /거짓이면 f이동
// router.post("/login", function (request, response) {
//   console.log("사용자가 보낸 값 :" + request.body.id);
//   console.log("사용자가 보낸 값 :" + request.body.pw);

//   let id = request.body.id;
//   let pw = request.body.pw;

//   let sql = "select * from member where id=? and pw=?";

//   conn.query(sql, [id, pw], function (err, rows) {
//     if (rows.length > 0) {
//       console.log("로그인성공 : " + rows.length);
//       response.redirect("http://127.0.0.1:5503/1013express/public/ex03S.html");
//     } else {
//       console.log("로그인실패 :" + rows.length);
//       response.redirect("http://127.0.0.1:5503/1013express/public/ex03F.html");
//     }
//   });
// });

// if(request.body.id=="smart" && request.body.pw=='123'){
//     response.redirect('http://127.0.0.1:5501/1013express/public/ex03s.html')
// }
// else{
//     response.redirect('http://127.0.0.1:5501/1013express/public/ex03F.html')
// }

router.post("/Delete", function (request, response) {
  let id = request.body.id;
  let pw = request.body.pw;

  conn.connect();

  //db sql문
  let sql = "delete from member where id=? "; //?값으로 대체
  conn.query(sql, [id], function (err, rows) {
    if (!err) {
      //만약 에러가 안났으면
      console.log("삭제성공");
      response.redirect(
        "http://127.0.0.1:5501/1013express_DB/public/Main.html"
      );
    } else {
      console.log("삭제실패" + err);
    }
  });
});

router.post("/re", function (request, response) {
  let id = request.body.id;
  let data = request.body.data;
  let nick = request.body.nick;

  let opt = request.body.opt;

  conn.connect();

  //db sql문
  if (opt == "pw") {
    let sql = "update member set pw=? where id=?"; //?값으로 대체
    conn.query(sql, [data, id], function (err, rows) {
      if (!err) {
        //만약 에러가 안났으면
        console.log("수정성공");
        response.redirect(
          "http://127.0.0.1:5501/1013express_DB/public/Main.html"
        );
      } else {
        console.log("수정실패" + err);
      }
    });
  } else if (opt == "nick") {
    let sql = "update member set nick=? where id=?"; //?값으로 대체
    conn.query(sql, [data, id], function (err, rows) {
      if (!err) {
        //만약 에러가 안났으면
        console.log("수정성공");
        response.redirect(
          "http://127.0.0.1:5501/1013express_DB/public/Main.html"
        );
      } else {
        console.log("수정실패" + err);
      }
    });
  }

  //  let sql ="update member set pw=? where id=?"; //?값으로 대체
  //  conn.query(sql,[pw,id],function(err,rows){
  //      if(!err){ //만약 에러가 안났으면
  //          console.log("수정성공")
  //          response.redirect('http://127.0.0.1:5501/1013express_DB/public/Main.html');

  //      }
  //      else{
  //          console.log("수정실패"+err)
  //      }
  //  });
});

router.get("/all", function (request, response) {
  // let id= request.body.id;
  // let pw= request.body.pw;
  // let nick=request.body.nick;

  conn.connect();

  //db sql문
  let sql = "select *from member "; //?값으로 대체
  conn.query(sql, function (err, rows) {
    if (!err) {
      //만약 에러가 안났으면
      console.log("검색성공");
      console.log(rows);

      response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
      response.write("<html>");
      response.write("<body>");

      for (i = 0; i < rows.length; i++) {
        response.write("id :" + rows[i].id);
        response.write("<br/>");
        response.write("pw :" + rows[i].pw);
        response.write("<br/>");
        response.write("nick :" + rows[i].nick);
        response.write("<br/>");
        response.write("<br/>");
      }
      response.write("</body>");
      response.write("</html>");
      response.end();
    } else {
      console.log("검색실패" + err);
    }
  });
});
//한명검색
router.post("/one", function (request, response) {
  let id = request.body.id;
  // let pw= request.body.pw;
  // let nick=request.body.nick;

  conn.connect();

  //db sql문
  let sql = "select *from member where id=?"; //?값으로 대체
  conn.query(sql, [id], function (err, rows) {
    if (!err) {
      //만약 에러가 안났으면
      console.log("검색성공");
      console.log(rows);
      response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
      response.write("<html>");
      response.write("<body>");
      response.write("id :" + rows[0].id);
      response.write("<br/>");
      response.write("pw :" + rows[0].pw);
      response.write("<br/>");
      response.write("nick :" + rows[0].nick);
      response.write("</body>");
      response.write("</html>");
      response.end();
    } else {
      console.log("검색실패" + err);
    }
  });
});

router.get("/ex011", function (request, response) {
  console.log("session Save!");
  // console.log(request.query.id)
  // console.log(request.query.pw)

  console.log("사용자가 보낸 값 :" + request.query.id);
  console.log("사용자가 보낸 값 :" + request.query.pw);

  let id = request.query.id;
  let pw = request.query.pw;

  request.session.user = {
    id: id,
    pw: pw,
  };
  //   request.query.comment = "님이 로그인에 성공하셨습니다.";
  //   request.query.btn = "";
  //   request.query.ing = "";
  let sql = "select * from member where id=? and pw=?";

  conn.query(sql, [id, pw], function (err, rows) {
    if (rows.length > 0) {
      console.log("로그인성공 : " + rows.length);

      response.render("ex01", {
        userid: request.session.user.id,
        // ucomment: request.query.comment,
        // inout: request.query.btn,
        // usering: request.query.ing,
      });
      console.log("세션등록성공");
    } else {
      console.log("로그인실패 :" + rows.length);
      response.redirect("http://127.0.0.1:5503/1013express/public/ex03F.html");
    }
  });

  //   let id = request.query.id;
  //   let pw = request.query.pw;

  //세션 등록
  //request.session.원하는변수이름 ={}
  //key 는 ""안에 작성 =>EJS render 작업할때와 비교해서 주의할 것★
  //   request.session.user = {
  //     id: id,
  //     pw: pw,
  //   };
  //   console.log("세션등록성공");
  //등록한 세션 확인
  console.log(request.session.user.id);
  console.log(request.session.user.pw);
  //   response.render("ex01", {
  //     userid: request.session.user.id,
  //     userpw: request.session.user.pw,
  //   });
});

router.get("/", function (request, response) {
  console.log("session Save!");
  // console.log(request.query.id)
  // console.log(request.query.pw)

  //세션 등록
  //request.session.원하는변수이름 ={}
  //key 는 ""안에 작성 =>EJS render 작업할때와 비교해서 주의할 것★

  console.log("세션등록성공");
  //등록한 세션 확인

  console.log(request.session.user.id);
  console.log(request.session.user.pw);

  request.query.btn = "로그아웃";
  request.query.ing = "현재 로그인 중인 아이디 :";
  request.query.comment = "";

  //   request.query.site.href = '"delete"';

  response.render("ex03main", {
    userid: request.session.user.id,
    inout: request.query.btn,
    usering: request.query.ing,
    ucomment: request.query.comment,
    // usite: request.query.site.href,
  });
});

router.get("/delete", function (request, response) {
  console.log("현재 user :" + request.session.user.id);

  //세션삭제
  delete request.session.user;

  if ((request.session.user = "")) {
    request.session.user.id = "";
    // request.query.btn = "로그인";
  }
  request.query.btn = "로그인";
  request.query.ing = "";
  request.query.comment = "";

  console.log("로그아웃 되셨습니다" + request.session.user);
  response.render("ex03main", {
    userid: request.session.user.id,
    inout: request.query.btn,
    usering: request.query.ing,
    ucomment: request.query.comment,
  });

  //   response.redirect("http://127.0.0.1:5503/");
});

module.exports = router;
//router에 대한 정보를 갖고있는 객체를 외부에서 사용할 수 있게 모듈화
