import React from "react";
import Product from "./Product";
import "./Product.css";

function Home() {
  return (
    <div className="home">
      <div className="home_container">
        <div className="home_row">
          <Product id="2323" title="제품1" price={3000} rating={2} />
          <Product id="2324" title="제품5" price={4000} rating={2} />
        </div>
        <div className="home_row">
          <Product id="2325" title="제품2" price={5000} rating={4} />
          <Product id="2326" title="제품3" price={4000} rating={2} />
          <Product id="2327" title="제품4" price={4000} rating={2} />
        </div>
        <div className="home_row">
          <Product id="2328" title="제품6" price={1500} rating={2} />
          <Product id="2329" title="제품7" price={1000} rating={2} />
        </div>
      </div>
    </div>
  );
}
export default Home;
