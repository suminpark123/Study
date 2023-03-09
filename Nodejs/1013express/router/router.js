const express=require('express')

const router=express.Router();




router.get('/review', function(request,response){

    console.log("사용자가 보낸 값"+request.query.text);
 
})
router.get('/response', function(request,response){

    console.log("사용자가 보낸 값"+request.query.site);
    
   
    if(request.query.site=='네이버'){
        response.redirect('https://www.naver.com/')
    }
    else if(request.query.site=='다음'){
        response.redirect('https://www.daum.net/')
    }
    else if(request.query.site=='구글'){
        response.redirect('https://www.google.co.kr/')
    }
   
   //외부/내부 해당페이지로 이동
   //네이버/구글/다음 사용자가 선ㄴ택한 값으로 사이트를 이동시키시오.


})

router.post('/post',function(request,response){

    console.log('사용자가 보낸 값 :'+request.body.text);
})


//로그인 기능구현하기
//조건1 /login 라우터를 구현
//조건2 사용자가 입력한 id가 'smart'이고 pw가 '123'인지 확인
//조건3 참이면 s이동 /거짓이면 f이동
router.post('/login',function(request,response){

    console.log('사용자가 보낸 값 :'+request.body.id);
    console.log('사용자가 보낸 값 :'+request.body.pw);
    if(request.body.id=="smart" && request.body.pw=='123'){
        response.redirect('http://127.0.0.1:5501/1013express/public/ex03s.html')
    }
    else{
        response.redirect('http://127.0.0.1:5501/1013express/public/ex03F.html')
    }

})



module.exports=router;
//router에 대한 정보를 갖고있는 객체를 외부에서 사용할 수 있게 모듈화