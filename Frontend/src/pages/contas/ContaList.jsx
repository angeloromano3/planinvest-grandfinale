import { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import api from '../../services/api';

function ContaList() {
  const [contas, setContas] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    api.get('/contas').then(res => setContas(res.data));
  }, []);

  const handleDelete = (id) => {
    if (confirm('Deseja excluir?')) {
      api.delete(`/contas/${id}`).then(() => {
        setContas(contas.filter(c => c.idConta !== id));
      });
    }
  };

  return (
    <div>
      <h1>Contas</h1>
      <button onClick={() => navigate('/contas/novo')}>Nova Conta</button>
      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Tipo</th>
            <th>Saldo Inicial</th>
            <th>Ações</th>
          </tr>
        </thead>
        <tbody>
          {contas.map(c => (
            <tr key={c.idConta}>
              <td>{c.idConta}</td>
              <td>{c.nmConta}</td>
              <td>{c.tpConta}</td>
              <td>{c.valSaldoInicial}</td>
              <td>
                <button onClick={() => navigate(`/contas/editar/${c.idConta}`)}>Editar</button>
                <button onClick={() => handleDelete(c.idConta)}>Excluir</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default ContaList;