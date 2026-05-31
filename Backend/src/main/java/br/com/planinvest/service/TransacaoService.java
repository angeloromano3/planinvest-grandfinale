package br.com.planinvest.service;

import br.com.planinvest.model.Transacao;
import br.com.planinvest.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public List<Transacao> listarTodos() {
        return transacaoRepository.findAll();
    }

    public Transacao buscarPorId(Long id) {
        return transacaoRepository.findById(id).orElse(null);
    }

    public Transacao salvar(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public Transacao atualizar(Long id, Transacao transacao) {
        transacao.setIdTransacao(id);
        return transacaoRepository.save(transacao);
    }

    public void deletar(Long id) {
        transacaoRepository.deleteById(id);
    }
}