exports.JoinTemp = function(post){

//회원가입할 때 HTML코드를 사용자에게 응답해주는 HTML코드를 만들어주는 기능
//exports : 현재 함수를 외부파일에서 사용할 수 있게 해주는 키워드

    let result_HTML = "<html><body>사용자가 입력한 id:"+post.id+"<br>"
    +"사용자가 입력한 pw:"+post.pw+"<br>"
    +"사용자가 입력한 성별:"+post.gender+"<br>"
    +"사용자가 입력한 혈액형:"+post.abc+"<br>"
    +"사용자가 입력한 생일:"+post.birth+"<br>"
    +"사용자가 입력한 좋아하는색깔:"+post.color+"<br>"
    +"사용자가 입력한 텍스트:"+post.text+"<br>"
    +"</body></html>";
      

    return result_HTML;
}


exports.ex01Temp = function(){
    let result_HTML ="<html><body>응답성공</body></html>"

    return result_HTML;
}

exports.ex02Temp = function(query){
    let result_HTML=`<html><body>사용자가 입력한 id: ${query.id}<br>
    사용자가 입력한 pw: ${query.pw}</body></html>`

    return result_HTML;
}




exports.GradeTemp =function(query){
    let avg =(parseInt(query.java))+(parseInt(query.web))+(parseInt(query.android))+(parseInt(query.iot));
    let gra =avg/4

    let result_grade="";

    if(gra>=95){
        result_grade='grade: A+';
    }
    else if(gra>=90){
        result_grade='grade: A';
        
    }
    else if(gra>=85){
        result_grade='grade: B+';
        
    }
    else if(gra>=80){
        result_grade='grade: B';
        

    }
    else if(gra>=75){
        result_grade='grade: C';
        

    }
    else if(gra<75){
        result_grade='grade: F';
        

    }

//Template Lieral:여러줄로 이루어진 문자열을 표현과 문자의 치환을 쉽게해주는 기능
//${}:표현식 (Template Lieral)에서 변수를 출력
let result_HTML = `<html><body>
                    이름:  ${query.name}<br>
                    자바점수: ${query.java}<br>
                    WEB점수:  ${query.web}<br>
                    IOT점수:  ${query.iot}<br>
                    ANDROID점수: ${query.android}<br>
                    AVG:  ${avg}<br>
                    ${result_grade}
                    </body></html>`;




                    





    return result_HTML;
}
exports.GradeTemp1 = function(query){
    let avg = parseInt(query.java) + parseInt(query.web) + parseInt(query.iot) +
    parseInt(query.android);
    let result=avg/4
    let result_grade = "";


    if(result>=95){
      result_grade ="학점 : " + "A+";
    }else if(result>=90){
        result_grade="학점 : " + "A";
    }else if(result>=85){
        result_grade="학점 : " + "B+";
    }else if(result>=80){
        result_grade="학점 : " + "B";
    }else if(result>=75){
        result_grade="학점 : " + "C";
    }else{
        result_grade="학점 : " + "F";
    }
    let result_HTML ="<html><body>"
    +"name : " + query.name+"<br>"
                    +"java : " + query.java+"<br>"
                    +"web : " + query.web+"<br>"
                    +"Iot : " + query.iot+"<br>"
                    +"Android : " + query.android+"<br>"
                    +"avg : " + avg + "<br>";
                    +result_grade
                    +"</body></html>"
    return result_HTML;
}



