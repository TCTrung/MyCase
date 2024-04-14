import {BrowserRouter, Route, Routes} from "react-router-dom";
import RegisterPage from "./component/Register/RegisterPage";
import LoginPage from "./component/Login/LoginPage";
import Layout from "./component/HomePage/Layout/Layout";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path='/login' element={<LoginPage/>}/>
          <Route path='/register' element={<RegisterPage/>}/>
          <Route path='/' element={<Layout/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
