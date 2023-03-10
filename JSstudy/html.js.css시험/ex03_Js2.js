let n=document.getElementById('num').innerText;
function add(){
    n++;
    document.getElementById('num').innerText=n;
}

function minus(){
    if(n>0){
    n--;
    document.getElementById('num').innerText=n;
    }
}
function reset(){
    n=0;
    document.getElementById('num').innerText=n;
    
}
