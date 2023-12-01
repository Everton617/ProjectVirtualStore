import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../css/navBar.css'

const Navbar = () => {
    const [isNavActive, setIsNavActive] = useState(false);

    const handleMenuClick = () => {
        setIsNavActive(!isNavActive);
    };
    return (
        <div className={` ${isNavActive ? 'nav-ativa' : ''}`}>
            <nav className={isNavActive ? 'active' : ''}>
                <div class="menu-icons" onClick={handleMenuClick}>
                    <i class="fas fa-bars"></i>
                    <i class="fas fa-times"></i>
                </div>
                <ul class="nav-list">
                    <li>
                        <a href="#">Compre por departamento <i class="fas fa-caret-down"></i></a>
                        <ul className="sub-menu">
                            <li>
                                <a href="" >
                                    Melhores Ofertas
                                </a>
                                <a href="" >
                                    Eletroportáteis
                                </a>
                                <a href="">
                                    Mochilas, Bolsas e Acessórios
                                </a>
                                <a href="">
                                    Smartwacth
                                </a>
                                <a href="">
                                    Casa Inteligente
                                </a>
                                <a href="">
                                    Escritório
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Pcs e Notebooks </a>
                    </li>
                    <li>
                        <a href="#">Gamer</a>
                    </li>
                    <li>
                        <a href="#">
                            Hardware
                        </a>

                    </li>
                    <li>
                        <a href="#">Tablets</a>
                    </li>
                    <li>
                        <a href="#">Mídias Digitais</a>
                    </li>
                    <li>
                        <a href="#">Placas de vídeos</a>
                    </li>

                </ul>

            </nav>
        </div>
    );
};

export default Navbar;