import './App.css';
import Home from './Home';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import ProjectHandler from './ProjectHandler';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />}></Route>
        <Route path="/project/:id" element={<ProjectHandler />}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
