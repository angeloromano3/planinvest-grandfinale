import { useState, useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import api from '../../services/api';

function UsuarioForm() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [form, setForm] = useState({
    nmUsuario: '', docCpf: '', emlEmail: '', senSenha: '',
    dtNascimento: '', dtCadastro: '', stsAtivo: 'S'
  });

  useEffect(() => {
    if (id) {
      api.get(`/usuarios/${id}`).then(res => setForm(res.data));
    }
  }, [id]);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (id) {
      api.put(`/usuarios/${id}`, form).then(() => navigate('/usuarios'));
    } else {
      api.post('/usuarios', form).then(() => navigate('/usuarios'));
    }
  };

  return (
    <div>
      <h1>{id ? 'Editar' : 'Novo'} Usuário</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Nome:</label>
          <input value={form.nmUsuario} onChange={e => setForm({...form, nmUsuario: e.target.value})} required />
        </div>
        <div>
          <label>CPF:</label>
          <input value={form.docCpf} onChange={e => setForm({...form, docCpf: e.target.value})} required />
        </div>
        <div>
          <label>Email:</label>
          <input type="email" value={form.emlEmail} onChange={e => setForm({...form, emlEmail: e.target.value})} required />
        </div>
        <div>
          <label>Senha:</label>
          <input type="password" value={form.senSenha} onChange={e => setForm({...form, senSenha: e.target.value})} required />
        </div>
        <div>
          <label>Data de Nascimento:</label>
          <input type="date" value={form.dtNascimento} onChange={e => setForm({...form, dtNascimento: e.target.value})} required />
        </div>
        <div>
          <label>Data de Cadastro:</label>
          <input type="date" value={form.dtCadastro} onChange={e => setForm({...form, dtCadastro: e.target.value})} />
        </div>
        <button type="submit">Salvar</button>
        <button type="button" onClick={() => navigate('/usuarios')}>Cancelar</button>
      </form>
    </div>
  );
}

export default UsuarioForm;