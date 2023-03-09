const http = require("http");
const url_p = require("url");
http .createServer(function (request, response) {
    console.log("서버응답성공")
    let query = url_p.parse(request.url, true).query;
    response.writeHead(200, { "Content-Type": "text/html;charset=utf-8" });
    response.write("<html>");
    response.write("<body><table border=1>");

    
     for(let i = 1; i <= 9; i++){
         response.write("<tr><td>"+query.gob + "*" + i + "=" + query.gob*i+"</td></tr>");
       
     }
    response.write("</table></body>");
    response.write("</html>");
    response.end();
  })
  .listen(3001);