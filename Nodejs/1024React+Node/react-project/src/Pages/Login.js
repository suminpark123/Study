import React from 'react'
import { Form, Button } from 'react-bootstrap'

const Login = () => {
    const joinStyle = {
        width: '80%',
        padding: '5%'
    }
    return (
        <div style={joinStyle} >
            <h1>로그인</h1>
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




                <div className="d-grid gap-2">
                    <Button variant="success" size="lg">
                        Login
                    </Button>
                </div>
            </Form>
        </div>
    )
}

export default Login