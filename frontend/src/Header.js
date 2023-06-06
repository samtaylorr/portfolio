import logo from './st_logo.svg';
import { Link } from 'react-router-dom';

function Header(){
    return (
        <header className="app-header">
            <Link to="/"><img src={logo} className='st-logo' /></Link>
        </header>
    )
}

export default Header;