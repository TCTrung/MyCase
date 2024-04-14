import React from 'react';
import "./layout.css";
import { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Offcanvas from 'react-bootstrap/Offcanvas';
import {Image} from "@chakra-ui/react";
const Layout = () => {
    const [show, setShow] = useState(false);

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    return (
        <>

            <div>
                <div className="div-1">
                    <Image
                        className="image-logo"
                        borderRadius='full'
                        boxSize='300px'
                        src='https://t4.ftcdn.net/jpg/03/26/46/89/360_F_326468949_IoE69XFemuiIkqceK1XtlYvzspcF65XF.jpg'
                        alt='Dan Abramov'
                    />

                </div>
            </div>
            <div>
                <Button variant="primary" onClick={handleShow}>
                    Launch
                </Button>

                <Offcanvas show={show} onHide={handleClose}>
                    <Offcanvas.Header closeButton>
                        <Offcanvas.Title>Offcanvas</Offcanvas.Title>
                    </Offcanvas.Header>
                    <Offcanvas.Body>
                    Some text as placeholder. In real life you can have the elements you
                    have chosen. Like, text, images, lists, etc.
                </Offcanvas.Body>
            </Offcanvas>
        </div>

        </>
    );
};

export default Layout;