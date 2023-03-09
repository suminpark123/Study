const http = require("http");
const url_p = require("url");
const Temp = require("../1007/ex02Temp.js")
http
  .createServer(function (request, response) {
    let query = url_p.parse(request.url, true).query;
    response.writeHead(200, { "Content-Type": "text/html;charset=utf-8" });
    let result_HTML = Temp.GradeTemp1(query);
    response.write(result_HTML);
    response.end();
  })
  .listen(3001);