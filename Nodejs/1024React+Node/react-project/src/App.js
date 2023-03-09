import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import { Routes, Route } from 'react-router-dom'

// layout 
import Header from './Layout/Header'

// pages
import Main from './Pages/Main'
import Login from './Pages/Login'
import Join from './Pages/Join'

const App = () => {
  const pageStyle = {
    height: '93vh',
    backgroundColor: 'whitesmoke',
    width: '100vw',
    display: 'flex',
    justifyContent: 'center'
  }


  return (
    <div>
      {/* 헤더 */}
      <Header />

      <div style={pageStyle}>

        <Routes>
          <Route path="/" element={<Main />} />
          <Route path="/join" element={<Join />} />
          <Route path="/login" element={<Login />} />
        </Routes>
      </div>
    </div>
  )
}

export default App