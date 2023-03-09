import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import Exam01 from "./compo/Exam01";
//import App2 from './compo/App2';// ./App.js 뒤에있는 js는 생략가능!
import reportWebVitals from "./reportWebVitals";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
