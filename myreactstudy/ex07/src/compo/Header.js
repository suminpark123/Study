import React from "react";

function Header() {
  return (
    <div className="header">
      <div className="header_search">
        <input className="header_searchInput" type="text" />
        <button>검색</button>
      </div>
      <div className="header_nav">
        <div className="header_option">
          <span className="header_optionLineOne">안녕하세요</span>
          <span className="header_optionLineTwo">로그인하기</span>
        </div>
        <div className="header_option">
          <span className="header_optionLineOne">돌아가기</span>
          <span className="header_optionLineTwo">주문내역</span>
        </div>
        <div className="header_option">
          <span className="header_optionLineOne">ㅎㅇㅎㅇ</span>
          <span className="header_optionLineTwo">해보자</span>
        </div>
        <div className="header_optionBasket">
          장바구니
          <span className="header_optionLineTwo header_basketCount">0</span>
        </div>
      </div>
    </div>
  );
}
export default Header;
