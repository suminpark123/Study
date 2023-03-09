const express = require("express");
const app = express();

const router = require("./router/router.js");

const body_parser = require("body-parser");

const session = require("express-session");
const session_mysql_save = require("express-mysql-session");

const ejs = require("ejs");

app.set("view engine", "EJS");

let dbInfo = {
  host: "127.0.0.1",
  user: "root",
  password: "123456",
  port: "3306",
  database: "nodejs_DB",
};

let s_m_s = new session_mysql_save(dbInfo);

app.use(
  session({
    secret: "sumin",

    resave: false,

    saveUninitialized: true,

    store: s_m_s,
  })
);
//정적인 데이터들을 이 디렉토리 밑에있는 것들을 제공하겠다.
app.use(express.static("public"));

app.use(body_parser.urlencoded({ extended: false }));

app.use(router);
app.listen(3001);
