import logo from "./logo.svg";
import "./App.css";
import Ex01 from "./compo/Ex01";
import { Route, Routes } from "react-router-dom";
import Ex02 from "./compo/Ex02";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Ex01></Ex01>}></Route>
      <Route path="/Ex02" element={<Ex02></Ex02>}></Route>
    </Routes>
  );
}

export default App;
