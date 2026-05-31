import { useNavigate } from 'react-router-dom';

function NotFound() {
  const navigate = useNavigate();

  return (
    <div>
      <h1>404 - Página não encontrada</h1>
      <p>A página que você procura não existe.</p>
      <button onClick={() => navigate('/')}>Voltar para Home</button>
    </div>
  );
}

export default NotFound;