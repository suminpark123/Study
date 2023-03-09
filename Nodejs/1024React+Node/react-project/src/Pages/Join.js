import { React, useRef, useState } from "react";
import { Form, Button } from "react-bootstrap";
import axios from "axios";

const Join = () => {
  const joinStyle = {
    width: "80%",
    padding: "5%",
  };
  const idRef = useRef();
  const pwRef = useRef();
  const addRef = useRef();
  const likeRef = useRef();

  const [name, setName] = useState("");
  const handleJoin = (e) => {
    // form태그가 다른 페이지로 이동시키지 않도록 방지
    e.preventDefault();
    console.log("handleJoin!");

    //axios.post(보낼위치, 보낼데이터)
    axios
      .post("http://127.0.0.1:3001/joinData", {
        id: idRef.current.value,
        like: likeRef.current.value,
        pw: pwRef.current.value,
        add: addRef.current.value,
      })
      .then((result) => {
        console.log("데이터셩공", result.data.result);
        console.log("아이디", result.data.id);
        setName(result.data.id + "님 환영");
      })
      .catch(() => {
        console.log("데이터실패");
      });
  };

  return (
    <div style={joinStyle}>
      <h1>회원가입</h1>

      <h1>{name}</h1>
      <br></br>
      <Form onSubmit={handleJoin}>
        {/* ID */}
        <Form.Group className="mb-3">
          <Form.Label>ID</Form.Label>
          <Form.Control type="text" placeholder="Enter ID" ref={idRef} />
          <Form.Text className="text-muted"></Form.Text>
        </Form.Group>
        {/* PW */}
        <Form.Group className="mb-3">
          <Form.Label>Password</Form.Label>
          <Form.Control type="password" placeholder="Password" ref={pwRef} />
        </Form.Group>
        {/* 주소 */}
        <Form.Group className="mb-3">
          <Form.Label>주소</Form.Label>
          <Form.Control type="text" placeholder="Enter Address" ref={addRef} />
          <Form.Text className="text-muted"></Form.Text>
        </Form.Group>
        {/* 선호도 */}
        <Form.Group className="mb-3">
          <Form.Label>선호도</Form.Label>
          <Form.Select aria-label="Default select example" ref={likeRef}>
            <option>선호하는 풍경을 골라주세요</option>
            <option value="mountain">산</option>
            <option value="ocean">바다</option>
            <option value="valley">계곡</option>
          </Form.Select>
        </Form.Group>
        <div className="d-grid gap-2">
          <Button type="submit" variant="success" size="lg">
            Join Us!
          </Button>
        </div>
      </Form>
    </div>
  );
};
export default Join;
