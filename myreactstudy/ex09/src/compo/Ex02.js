import axios from "axios";
import { useState, useEffect } from "react";

function Ex02() {
  const [imageData, setImageData] = useState("");

  async function getImage() {
    let data = await axios.post("http://localhost:3005/getImage");
    console.log(data);

    window.Buffer = window.Buffer || require("buffer").Buffer;
    let encode = window.Buffer.from(data.data.image.imageCol.data).toString(
      "base64"
    );
    setImageData("data:image/png;base64," + encode);
    console.log("data:image/png;base64," + encode);
  }

  useEffect(function () {
    getImage();
  });

  return (
    <>
      <img src={imageData}></img>
    </>
  );
}

export default Ex02;
