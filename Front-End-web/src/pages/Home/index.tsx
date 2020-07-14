import React from 'react';
import { FiSearch } from 'react-icons/fi';
import { Link } from 'react-router-dom';

import './styles.css';

import logo from '../../assets/logo.svg';

const Home = () => {
  return (
    <div id="page-home">
      <div className="content">
        <header>
          <img src={logo} alt="Ecoleta" />
          <Link to='/create-point' className="linkCadastrer">
              <span></span><h5>Cadastrer un point de collete</h5>
          </Link>
        </header>

        <main>
          <h1>Votre marketplace de collete de déchêt.</h1>
          <p>On vous aide à trouver un point de collete de façon efficace.</p>

          <Link to="#">
            <span>
              <FiSearch />
            </span>
            <strong>Rechercher un point de collete</strong>
          </Link>
        </main>
      </div>
    </div>
  )
}

export default Home;