
import {Link} from  "react-router-dom";
function Home(){
    return(

        <>
            <h1>HOME</h1>
            <p>First Page</p>
            <Link to="./about"><button>서브페이지로 이동</button></Link><br/><br/>
            <Link to="./about2"><button>서브페이지로 이동2</button></Link><br/><br/>
            <Link to="./about3"><button>서브페이지로 이동3</button></Link>


            
        </>
        

    );
}

export default Home


