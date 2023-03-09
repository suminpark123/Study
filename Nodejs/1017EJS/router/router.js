const express=require('express')
const router=express.Router();

router.get('/',function(request,response){
    console.log("성공체크")
})

//ex01

router.get('/ex01',function(request,response){
    console.log(request.query.menu)
    console.log(request.query.mbti)

    

    console.log('ex01체크')
    response.render('ex01',{
        userMbti : request.query.mbti,
        userMenu : request.query.menu 
        
    })




    //ejs란 응답하는 페이지를 쉽게 만들어주는 뷰엔진
    //서버=> 사용자에게 주는 것 :응답 response
    //response.render(뷰엔진파일,{보내줄데이터})

})
//ex02 학점계산기 예제
// 1. ex02.html에서 받아온 정보를 router ex02로 보내준다
// 2. 받아온 정보들을 ex02.ejs 뷰엔진으로 보내준다
// 3.총점,등급 또한 ex02.ejs 뷰엔진으로 보내준다
// 이 때, 등급은 평균 90이상 A나머지는 B로
// 4. 최종 뷰 화면에는 이름,등등 뜨도록한다. 

router.get('/ex02',function(request,response){
    console.log(request.query.menu)
    console.log(request.query.mbti)
    let sum =parseInt(request.query.html)+parseInt(request.query.react)+parseInt(request.query.node)
    let grade =""
    if((sum/3)>=90){
        grade = "A+등급"
    }
    else{
        grade = "B등급"

    }
    

    console.log('ex02체크')
    response.render('ex02',{
        userName : request.query.name,
        userHtml : request.query.html,
        userReact : request.query.react,
        userNode : request.query.node,
        userSum : sum,
        usergg : grade

        
    })

})
//ex03 홀짝게임
router.get('/ex03',(request,response)=>{
    console.log('ex03 router!')
    // step1) 랜덤 숫자를 뽑아보자 (1~10)
    let ranNum = parseInt(Math.random()*10)+1
    console.log(ranNum)
    // step2) 랜덤 숫자의 홀/짝 구분 ==> 삼항연산자
    let ranRes = ranNum%2 == 1 ? '홀' : '짝'
    console.log(ranRes)
    // step3) 사용자가 입력한 홀/짝 을 받아오자
    let inputRes = request.query.game
    console.log('user : ',inputRes)
    // step4) 랜덤 홀/짝 - 사용자 홀/짝 비교
    //          맞다면? "정답입니다" 틀렸다면? "오답입니다"
    //          => 삼항연산자
    let result = (ranRes == inputRes) ? "정답입니다" : "오답입니다"
    console.log('최종 결과',result)
    // step5) ex03 렌더링 => 랜덤숫자, 최종 결과
    response.render('ex03',{
        // key -> EJS 에서 사용할 이름
        // value -> router.js 에서 사용한 이름
        ranNum : ranNum,
        result : result
    })
})
//error : app.use() requires a middleware fuction
// case 1) moudle exports 안한 것
// case 2) npm 설치 확인 할 것
module.exports=router;
