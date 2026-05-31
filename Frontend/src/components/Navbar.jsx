import { useNavigate } from 'react-router-dom';

function Navbar() {
  const navigate = useNavigate();

  return (
    <nav style={{ padding: '10px', background: '#333', color: 'white', display: 'flex', gap: '10px' }}>
      <strong style={{ marginRight: '20px' }}>Plan+Invest</strong>
      <button onClick={() => navigate('/')}>Home</button>
      <button onClick={() => navigate('/usuarios')}>Usuários</button>
      <button onClick={() => navigate('/contas')}>Contas</button>
      <button onClick={() => navigate('/transacoes')}>Transações</button>
      <button onClick={() => navigate('/login')}>Login</button>
    </nav>
  );
}

export default Navbar;