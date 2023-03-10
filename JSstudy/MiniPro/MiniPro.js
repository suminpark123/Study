let cnt = 0;
  function add(){
    
      cnt++
      if(cnt>=1){
        let n1=(document.querySelector("#proCnt").innerText)
        n1++;
      document.querySelector("#proCnt").innerText =n1;
      if(num==0){
        document.querySelector("#totalPrice").innerText="금액:"+n1*1000;
      }
      else if(num==1){
        document.querySelector("#totalPrice").innerText="금액:"+n1*1500;

      }
      else {
        document.querySelector("#totalPrice").innerText="금액:"+n1*2000;

      }
      

        
      }
    }
    function minus(){
    
    cnt++
    if(cnt>=0){
      let n2=(document.querySelector("#proCnt").innerText)
      if(n2>0){
      n2--;
      document.querySelector("#proCnt").innerText =n2;
      if(num==0){
        document.querySelector("#totalPrice").innerText="금액:"+n2*1000;
      }
      else if(num==-1){
        document.querySelector("#totalPrice").innerText="금액:"+n2*1500;

      }
      else {
        document.querySelector("#totalPrice").innerText="금액:"+n2*2000;

      }
      }
    
  }}      

let num = 0;

function aa(){
      
      let img = document.getElementsByTagName("img");//유사배열
    
       
      if(num==0){
          img[0].setAttribute("src","K-101.png")
          document.querySelector("#proName").innerText="포카리스웨터";
          document.querySelector("#proPrice").innerText="1500";
          document.querySelector("#totalPrice").innerText="금액:0"
          document.querySelector("#proCnt").innerText="0"
          document.querySelector(".commentList").innerText=""

          
          

          
          num++;
      }
      else if(num==1){
          img[0].setAttribute("src","K-102.png")
          document.querySelector("#proName").innerText="파워에이드";
          document.querySelector("#proPrice").innerText="2000";
          document.querySelector("#totalPrice").innerText="금액:0"
          document.querySelector("#proCnt").innerText="0"
          document.querySelector(".commentList").innerText=""


          
          num++;
      }
      else {
        img[0].setAttribute("src","K-100.png")
          document.querySelector("#proName").innerText="삼다수";
          document.querySelector("#proPrice").innerText="1000";
          document.querySelector("#totalPrice").innerText="금액:0"
          document.querySelector("#proCnt").innerText="0"
          document.querySelector(".commentList").innerText=""



          
          
        num=0;
      }            
       
       
  }

  function bb(){
      
      let img = document.getElementsByTagName("img");//유사배열
    
       
      if(num==0){
          img[0].setAttribute("src","K-102.png")
          document.querySelector("#proName").innerText="파워에이드";
          document.querySelector("#proPrice").innerText="2000";
          document.querySelector("#totalPrice").innerText="금액:0"
          document.querySelector("#proCnt").innerText="0"
          document.querySelector(".commentList").innerText=""




          num--;
      }
      else if(num==-1){
          img[0].setAttribute("src","K-101.png")
          document.querySelector("#proName").innerText="포카리스웨터";
          document.querySelector("#proPrice").innerText="1500";
          document.querySelector("#totalPrice").innerText="금액:0"
          document.querySelector("#proCnt").innerText="0"
          document.querySelector(".commentList").innerText=""



          
          num--;
        
      }
      else {
        img[0].setAttribute("src","K-100.png")
        document.querySelector("#proName").innerText="삼다수";
        document.querySelector("#proPrice").innerText="1000";
        document.querySelector("#totalPrice").innerText="금액:0"
        document.querySelector("#proCnt").innerText="0"
        document.querySelector(".commentList").innerText=""



        num=0;
      }    
       
       
  }
  function getInput(){
    let data=$('input').val();
    let com_ment=document.querySelector(".commentList");
     const v = document.createElement("br");
    com_ment.append(data,v);
    
  }
 

