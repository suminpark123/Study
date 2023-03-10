const express = require("express");
const app = express();
const router = require("./router/router");
const bodyParser = require("body-parser");
const ejs = require("ejs");
const session = require("express-session");
const session_mysql_save = require("express-mysql-session");

let dbInfo = {
  // 본인 DB 정보 채우기
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

app.set("view engine", "ejs");
app.use(bodyParser.urlencoded({ extended: false }));
app.use(router);
app.listen(3003);
