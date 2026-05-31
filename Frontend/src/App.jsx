import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Login from './pages/Login';
import NotFound from './pages/NotFound';
import UsuarioList from './pages/usuarios/UsuarioList';
import UsuarioForm from './pages/usuarios/UsuarioForm';
import ContaList from './pages/contas/ContaList';
import ContaForm from './pages/contas/ContaForm';
import TransacaoList from './pages/transacoes/TransacaoList';
import TransacaoForm from './pages/transacoes/TransacaoForm';
import Navbar from './components/Navbar';

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/usuarios" element={<UsuarioList />} />
        <Route path="/usuarios/novo" element={<UsuarioForm />} />
        <Route path="/usuarios/editar/:id" element={<UsuarioForm />} />
        <Route path="/contas" element={<ContaList />} />
        <Route path="/contas/novo" element={<ContaForm />} />
        <Route path="/contas/editar/:id" element={<ContaForm />} />
        <Route path="/transacoes" element={<TransacaoList />} />
        <Route path="/transacoes/novo" element={<TransacaoForm />} />
        <Route path="/transacoes/editar/:id" element={<TransacaoForm />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;