import Carousel from 'react-bootstrap/Carousel';

function Photo() {
    const carouselStyle = {
        width: '100vw',
        height: '20vh'
    }

    const imgStyle = {
        width: '1290px',
        height: '400px'
    }
    return (
        <div style={carouselStyle}>

            <Carousel fade>
                <Carousel.Item>
                    <img
                        style={imgStyle}
                        className="d-block w-100"
                        src="https://images.unsplash.com/photo-1601236414929-677713b2d078?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2790&q=80"
                        alt="First slide"
                    />
                </Carousel.Item>
                <Carousel.Item>
                    <img
                        style={imgStyle}
                        className="d-block w-100 "
                        src="https://images.unsplash.com/photo-1623346941853-243f475acf92?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2854&q=80"
                        alt="Second slide"
                    />

                </Carousel.Item>
                <Carousel.Item>
                    <img
                        style={imgStyle}
                        className="d-block w-100 "
                        src="https://images.unsplash.com/photo-1504069424204-a54566b5165c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2884&q=80"
                        alt="Second slide"
                    />

                </Carousel.Item>

            </Carousel>
        </div>

    );
}

export default Photo;