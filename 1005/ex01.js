const http = require("http");
const url_p = require("url");
http.createServer(function (request, response) {
    console.log("서버호출성공");
    console.log(request.url);

    let query = url_p.parse(request.url, true).query;
   
    console.log("사용자 num1값: " + query.num1);
    console.log("사용자 num2값: " + query.num2);
    // if(query.cal=="+"){
    //     (parseInt(query.num1)+parseInt(query.num2))
    // }
    // else if(query.cal=='-'){
    //     (parseInt(query.num1)-parseInt(query.num2))
    // }
    // else if(query.cal=='*'){
    //     (parseInt(query.num1)*parseInt(query.num2))
    // }
    // else if(query.cal=='/'){
    //     (parseInt(query.num1)/parseInt(query.num2))
    // }
   
    response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
    response.write("<html>");
    response.write("<body>");
    if(query.cal=="+"){
        response.write("합계 :"+(parseInt(query.num1)+parseInt(query.num2)))
    }
    else if(query.cal=='-'){
        response.write("합계 :"+(parseInt(query.num1)-parseInt(query.num2)))
    }
    else if(query.cal=='*'){
        response.write("합계 :"+(parseInt(query.num1)*parseInt(query.num2)))
    }
    else if(query.cal=='/'){
        response.write("합계 :"+(parseInt(query.num1)/parseInt(query.num2)))
    }
    response.write("</body>");
    response.write("</html>");


    response.end();
  })
  .listen(3001);
