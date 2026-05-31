import { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import api from '../../services/api';

function TransacaoList() {
  const [transacoes, setTransacoes] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    api.get('/transacoes').then(res => setTransacoes(res.data));
  }, []);

  const handleDelete = (id) => {
    if (confirm('Deseja excluir?')) {
      api.delete(`/transacoes/${id}`).then(() => {
        setTransacoes(transacoes.filter(t => t.idTransacao !== id));
      });
    }
  };

  return (
    <div>
      <h1>Transações</h1>
      <button onClick={() => navigate('/transacoes/novo')}>Nova Transação</button>
      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Tipo</th>
            <th>Valor</th>
            <th>Data</th>
            <th>Ações</th>
          </tr>
        </thead>
        <tbody>
          {transacoes.map(t => (
            <tr key={t.idTransacao}>
              <td>{t.idTransacao}</td>
              <td>{t.tpTransacao}</td>
              <td>{t.vlTransacao}</td>
              <td>{t.dtEfetivacao}</td>
              <td>
                <button onClick={() => navigate(`/transacoes/editar/${t.idTransacao}`)}>Editar</button>
                <button onClick={() => handleDelete(t.idTransacao)}>Excluir</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default TransacaoList;