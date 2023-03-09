import { useRef } from "react";
import { useNavigate } from "react-router-dom";

function Ex01() {
  const image = useRef();
  const nav = useNavigate();

  function uploadImage(e) {
    //e.target.files[0];
    console.log(e.target.files[0]);
  }

  return (
    <>
      <form
        action="http://localhost:3005/upload"
        method="post"
        encType="multipart/form-data"
      >
        <input
          type="file"
          accept="image/*"
          ref={image}
          onChange={uploadImage}
          name="gicher"
        ></input>
        <input type="text" name="id"></input>
        <br></br>
        <br></br>
        <button>업로드</button>
      </form>

      <button onClick={() => nav("/Ex02")}>화면전환</button>
    </>
  );
}

export default Ex01;
