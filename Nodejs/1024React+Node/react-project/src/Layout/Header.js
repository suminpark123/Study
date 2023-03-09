import { Nav, Container, Button } from 'react-bootstrap/';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import FestivalIcon from '@mui/icons-material/Festival';

import { Link } from 'react-router-dom'


function Header() {

    const logoBox = {
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center'
    }
    const logoStyle = {
        marginLeft: '10px',
        fontWeight: 'bold',
        fontSize: '25px'
    }
    const linkStyle = {
        textDecoration: 'none',
        color: 'darkgreen'
    }
    return (
        <div>
            <Container>
                <Row>
                    <Col style={logoBox}>
                        <FestivalIcon color="success"></FestivalIcon>
                        <Link to='./' style={linkStyle}>
                            <span style={logoStyle}>
                                Camping Fire
                            </span>
                        </Link>

                    </Col>
                    <Col xs={6}></Col>
                    <Col>
                        <Nav className="justify-content-center">
                            <Nav.Item>
                                <Nav.Link href="/login">
                                    <Button variant="outline-success">로그인</Button>{' '}
                                </Nav.Link>
                            </Nav.Item>
                            <Nav.Item>
                                <Nav.Link href="/join">
                                    <Button variant="outline-success">회원가입</Button>{' '}
                                </Nav.Link>
                            </Nav.Item>


                        </Nav>
                    </Col>
                </Row>
            </Container >
        </div>

    );
}

export default Header;