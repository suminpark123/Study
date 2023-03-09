// express:Nodejs를 이용해서 서버를 개발할 때 가장 많이 사용되는 프레임워크
// 폴더구성
// config :프로젝트에 대한 모든 환경변수 정보 저장(ex.db연결정도,외부api key값)
//public: 정적파일관리(html,css,javascript,image등)
//router:서버경로설정
//views : 동적파일관리(ejs등)
//app.js:서버를 실행하기위한 main파일
const express=require("express")
//express사용설정
const app=express();
//express실행후 app변수에 저장
console.log("서버실행")
const router=express.Router();
//router기능사용설정

router.get('/test',function(request,response){
    console.log('/test 라우터실행')
})
router.get('/plus',function(request,response){
    console.log('/plus 라우터실행') 
    
})
router.get('/cal',function(request,response){
   console.log('/cal실행')
    
   
    console.log("사용자 num1값: " + request.query.num1);
    console.log("사용자 num2값: " + request.query.num2);
    // if(request.query.cal=="+"){
    //     (parseInt(query.num1)+parseInt(query.num2))
    // }
    // else if(request.query.cal=='-'){
    //     (parseInt(query.num1)-parseInt(query.num2))
    // }
    // else if(request.query.cal=='*'){
    //     (parseInt(query.num1)*parseInt(query.num2))
    // }
    // else if(request.query.cal=='/'){
    //     (parseInt(query.num1)/parseInt(query.num2))
    // }
   
    response.writeHead(200, { "ConTent-Type": "text/html;charset=utf-8" });
    response.write("<html>");
    response.write("<body>");
    if(request.query.cal=="+"){
        response.write("합계 :"+(parseInt(request.query.num1)+parseInt(request.query.num2)))
    }
    else if(request.query.cal=='-'){
        response.write("합계 :"+(parseInt(request.query.num1)-parseInt(request.query.num2)))
    }
    else if(request.query.cal=='*'){
        response.write("합계 :"+(parseInt(request.query.num1)*parseInt(request.query.num2)))
    }
    else if(request.query.cal=='/'){
        response.write("합계 :"+(parseInt(request.query.num1)/parseInt(request.query.num2)))
    }
    
    response.write("</body>");

    response.write("</html>");


    response.end();
   
})

router.get('/mul',function(request,response){
    console.log('/mul 라우터실행') 
   
    
    response.writeHead(200, { "Content-Type": "text/html;charset=utf-8" });
    response.write("<html>");
    response.write("<body><table border=1>");
     for(let i = 1; i <= 9; i++){
         response.write("<tr><td>"+request.query.td + "*" + i + "=" + request.query.td*i+"</td></tr>");
      
     }
    response.write("</table></body>");
    response.write("</html>");
    response.end();
})

router.get('/login',function(request,response){
    console.log('/login 라우터실행');
    response.write('<html>');
    response.write('<body>');
    response.write('id :'+request.query.id);
    response.write('<br>');   
    response.write('pw :'+request.query.pw);
    response.write('</body>');
    response.write('</html>');
    response.end();



})



app.use(router);

app.listen(3001);