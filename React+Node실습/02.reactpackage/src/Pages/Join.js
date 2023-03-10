import React from 'react'
import { Form, Button } from 'react-bootstrap'

const Join = () => {
    const joinStyle = {
        width: '80%',
        padding: '5%'
    }
    return (
        <div style={joinStyle} >
            <h1>회원가입</h1>
            <br></br>
            <Form>
                {/* ID */}
                <Form.Group className="mb-3">
                    <Form.Label>ID</Form.Label>
                    <Form.Control type="text" placeholder="Enter ID" />
                    <Form.Text className="text-muted">
                    </Form.Text>
                </Form.Group>


                {/* PW */}
                <Form.Group className="mb-3" >
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password" />
                </Form.Group>


                {/* 주소 */}
                <Form.Group className="mb-3" >
                    <Form.Label>주소</Form.Label>
                    <Form.Control type="text" placeholder="Enter Address" />
                    <Form.Text className="text-muted">
                    </Form.Text>
                </Form.Group>

                {/* 선호도 */}
                <Form.Group className="mb-3" >
                    <Form.Label>선호도</Form.Label>
                    <Form.Select aria-label="Default select example">
                        <option>선호하는 풍경을 골라주세요</option>
                        <option value="mountain">산</option>
                        <option value="ocean">바다</option>
                        <option value="valley">계곡</option>
                    </Form.Select>

                </Form.Group>





                <div className="d-grid gap-2">
                    <Button variant="success" size="lg">
                        Join Us!
                    </Button>
                </div>
            </Form>
        </div>
    )
}

export default Join