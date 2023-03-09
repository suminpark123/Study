const express = require("express");
const app = express();
const router = require("./router/router.js");
const body_parser = require("body-parser");

app.use(express.json());
var cors = require("cors");
app.use(cors());

app.use(body_parser.urlencoded({ extended: false }));
app.use(router);

app.listen(3005);
