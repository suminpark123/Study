import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';//APP이라는 태그를 가져옴
import reportWebVitals from './reportWebVitals';

//html 태그 중에서 아이디가 root인 태그를 가져와서
//부가 내용을 만들어 주겠다.->렌더링 해주겠다.
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* Ctrl + / */}
    {/* <React.StrictMode> -->안전장치 :app이라는 태그가 실행되기전에 한번 검사하는 부분</React.StrictMode>*/}
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
