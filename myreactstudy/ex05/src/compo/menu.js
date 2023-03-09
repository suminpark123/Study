import {Link,useNavigate} from  "react-router-dom";

//useNavigate: 원하는 주소로 이동할 수 있는 기능
//Link : 원하는 주소로 이동할 수 있는 태그

function Menu(){
    const nav=useNavigate();

    function chMain(){
        //nav("이동하고싶은 주소값")
        nav('/');
    }
    return(
        // <img src='K-132.png' onClick={chMain}/>
        <Link to="/"><img src='K-132.png'/></Link>
    );

}
export default Menu