package br.com.planinvest.service;

import br.com.planinvest.exception.RecursoNaoEncontradoException;
import br.com.planinvest.model.Conta;
import br.com.planinvest.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> listarTodos() {
        return contaRepository.findAll();
    }

    public Conta buscarPorId(Long id) {
        return contaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Conta não encontrada com id: " + id));
    }

    public Conta salvar(Conta conta) {
        return contaRepository.save(conta);
    }

    public Conta atualizar(Long id, Conta conta) {
        if (!contaRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Conta não encontrada com id: " + id);
        }
        conta.setIdConta(id);
        return contaRepository.save(conta);
    }

    public void deletar(Long id) {
        if (!contaRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Conta não encontrada com id: " + id);
        }
        contaRepository.deleteById(id);
    }
}