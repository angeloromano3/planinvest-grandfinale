import { useState, useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import api from '../../services/api';

function TransacaoForm() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [form, setForm] = useState({
    tpTransacao: '', vlTransacao: '', dtEfetivacao: '', dsTransacao: '',
    tpPagamento: '', flgRecorente: 'N', dsPeriodo: '', contaIdConta: '', categoriaIdCategoria: ''
  });

  useEffect(() => {
    if (id) {
      api.get(`/transacoes/${id}`).then(res => setForm(res.data));
    }
  }, [id]);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (id) {
      api.put(`/transacoes/${id}`, form).then(() => navigate('/transacoes'));
    } else {
      api.post('/transacoes', form).then(() => navigate('/transacoes'));
    }
  };

  return (
    <div>
      <h1>{id ? 'Editar' : 'Nova'} Transação</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Tipo:</label>
          <select value={form.tpTransacao} onChange={e => setForm({...form, tpTransacao: e.target.value})} required>
            <option value="">Selecione</option>
            <option value="receita">Receita</option>
            <option value="despesa">Despesa</option>
          </select>
        </div>
        <div>
          <label>Valor:</label>
          <input type="number" step="0.01" value={form.vlTransacao} onChange={e => setForm({...form, vlTransacao: e.target.value})} required />
        </div>
        <div>
          <label>Data:</label>
          <input type="date" value={form.dtEfetivacao} onChange={e => setForm({...form, dtEfetivacao: e.target.value})} required />
        </div>
        <div>
          <label>Descrição:</label>
          <input value={form.dsTransacao} onChange={e => setForm({...form, dsTransacao: e.target.value})} />
        </div>
        <div>
          <label>Tipo Pagamento:</label>
          <input value={form.tpPagamento} onChange={e => setForm({...form, tpPagamento: e.target.value})} />
        </div>
        <div>
          <label>ID da Conta:</label>
          <input type="number" value={form.contaIdConta} onChange={e => setForm({...form, contaIdConta: e.target.value})} required />
        </div>
        <div>
          <label>ID da Categoria:</label>
          <input type="number" value={form.categoriaIdCategoria} onChange={e => setForm({...form, categoriaIdCategoria: e.target.value})} required />
        </div>
        <button type="submit">Salvar</button>
        <button type="button" onClick={() => navigate('/transacoes')}>Cancelar</button>
      </form>
    </div>
  );
}

export default TransacaoForm;