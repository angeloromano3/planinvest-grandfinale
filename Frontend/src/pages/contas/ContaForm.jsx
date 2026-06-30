import { useState, useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import api from '../../services/api';

function ContaForm() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [form, setForm] = useState({
    nmConta: '', nrConta: '', tpConta: '', nmInstituicao: '',
    sgMoeda: 'BRL', valSaldoInicial: '', stAtiva: 'S',
    dtCriacao: '', usuarioIdUsuario: ''
  });
  const [salvando, setSalvando] = useState(false);
  const [erro, setErro] = useState('');
  const [sucesso, setSucesso] = useState('');

  useEffect(() => {
    if (id) {
      api.get(`/contas/${id}`).then(res => setForm(res.data));
    }
  }, [id]);

  const handleSubmit = async (e) => {
    e.preventDefault();
    setErro('');
    setSucesso('');
    setSalvando(true);

    try {
      if (id) {
        await api.put(`/contas/${id}`, form);
      } else {
        await api.post('/contas', form);
      }
      setSucesso('Conta salva com sucesso!');
      setTimeout(() => navigate('/contas'), 1000);
    } catch (err) {
      setErro('Não foi possível salvar a conta. Verifique os dados e tente novamente.');
      setSalvando(false);
    }
  };

  return (
    <div>
      <h1>{id ? 'Editar' : 'Nova'} Conta</h1>
      {erro && <p style={{ color: 'red' }}>{erro}</p>}
      {sucesso && <p style={{ color: 'green' }}>{sucesso}</p>}
      <form onSubmit={handleSubmit}>
        <div>
          <label>Nome:</label>
          <input value={form.nmConta} onChange={e => setForm({...form, nmConta: e.target.value})} required />
        </div>
        <div>
          <label>Número:</label>
          <input value={form.nrConta} onChange={e => setForm({...form, nrConta: e.target.value})} required />
        </div>
        <div>
          <label>Tipo:</label>
          <input value={form.tpConta} onChange={e => setForm({...form, tpConta: e.target.value})} required />
        </div>
        <div>
          <label>Instituição:</label>
          <input value={form.nmInstituicao} onChange={e => setForm({...form, nmInstituicao: e.target.value})} required />
        </div>
        <div>
          <label>Saldo Inicial:</label>
          <input type="number" value={form.valSaldoInicial} onChange={e => setForm({...form, valSaldoInicial: e.target.value})} required />
        </div>
        <div>
          <label>Data de Criação:</label>
          <input type="date" value={form.dtCriacao} onChange={e => setForm({...form, dtCriacao: e.target.value})} required />
        </div>
        <div>
          <label>ID do Usuário:</label>
          <input type="number" value={form.usuarioIdUsuario} onChange={e => setForm({...form, usuarioIdUsuario: e.target.value})} required />
        </div>
        <button type="submit" disabled={salvando}>
          {salvando ? 'Salvando...' : 'Salvar'}
        </button>
        <button type="button" onClick={() => navigate('/contas')}>Cancelar</button>
      </form>
    </div>
  );
}

export default ContaForm;