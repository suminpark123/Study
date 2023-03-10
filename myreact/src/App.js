import logo from './logo.svg';
import './App.css';
import './App2.css'; //외부 css 파일 가져오기

function App() {
  
  const name = '승환'; 
  return (
    //사용자 정의태그를 만들기 위해서 꼭
    //태그 구조를 하나로 묶어 줘야한다.
    //<></>빈태그 ->프래그먼트
    //JSX 문법 -> HTML+Javascript
    //Javascript 와 HTML 문법을 동시에 적용할 수 있다.
    //특징 1. JSX 문법으로 사용자태그를 만들때는 꼭 하나의 태그로 묶여있어야한다.
    //특징 2. Javascript 안에있는 변수를 사용할때는 {변수명}으로 사용 할 수 있다.
    //{}중괄호 안에 변수명이나 삼항연산자를 사용할 수는 있지만
    //모든 Javascript의 문법을 적용시킬수는 없다.
    
    
    
    <p>  

       
      {/* <h1 className='text' style={{backgroundColor:"black", color:"red"}}>hello react</h1> */}
      <h1 className='text'>hello react</h1>
      <h1 className='text'>{name == "승환" ? name+"님" :"우리모두"}파이팅</h1>
      {/* input,br 같은 태그 -> self-closing 태그*/}
      {/* <input/><br></br> */}
    </p>


    
      
  
    

    
    
    
  );
}
//APP이라는 이름으로 위에서 만든 html코드를 넘겨 주겠습니다.
export default App;
