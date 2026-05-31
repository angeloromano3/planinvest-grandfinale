import { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';
import api from '../../services/api';

function UsuarioList() {
  const [usuarios, setUsuarios] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    api.get('/usuarios').then(res => setUsuarios(res.data));
  }, []);

  const handleDelete = (id) => {
    if (confirm('Deseja excluir?')) {
      api.delete(`/usuarios/${id}`).then(() => {
        setUsuarios(usuarios.filter(u => u.idUsuario !== id));
      });
    }
  };

  return (
    <div>
      <h1>Usuários</h1>
      <button onClick={() => navigate('/usuarios/novo')}>Novo Usuário</button>
      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Ações</th>
          </tr>
        </thead>
        <tbody>
          {usuarios.map(u => (
            <tr key={u.idUsuario}>
              <td>{u.idUsuario}</td>
              <td>{u.nmUsuario}</td>
              <td>{u.emlEmail}</td>
              <td>
                <button onClick={() => navigate(`/usuarios/editar/${u.idUsuario}`)}>Editar</button>
                <button onClick={() => handleDelete(u.idUsuario)}>Excluir</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default UsuarioList;