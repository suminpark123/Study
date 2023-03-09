const http = require("http");
const url_p = require("url");
http.createServer(function (request, response) {
    console.log("서버호출성공");
    console.log(request.url);

    let query = url_p.parse(request.url, true).query;
   
    
    
   
    response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
    response.write("<html>");
    response.write("<body>");
    response.write("td수: "+query.td)
    response.write("<table border='1'>");
    response.write("<tr>");


     for(let i =1; i<=query.td; i++){
         response.write("<td>"+i+"</td>")
     }
   

    response.write("</tr>");
    response.write("</table>");
    response.write("</body>");

    response.write("</html>");


    response.end();
  })
  .listen(3001);
