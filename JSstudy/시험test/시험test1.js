
let n=document.querySelector("#tag").innerHTML
function add(){
    n++;
    document.querySelector("#tag").innerHTML=n;

}

function minus(){
    if(n>0){
        n--;
        document.querySelector("#tag").innerHTML=n;
        
    }
        
}

function reset(){
    document.querySelector("#tag").innerHTML='0';
}



