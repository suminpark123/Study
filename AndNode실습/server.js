const express = require("express");
const path = require("path");
const app = express();
const router = require("./router/router");
const bodyParser = require("body-parser");
app.use(bodyParser.urlencoded({ extended: true }));

app.use(express.json());
const cors = require("cors");
app.use(cors());
app.use(router);
//-->http://ip주소:3001
app.listen(3010, function () {
  console.log("Server Start");
});
