package br.com.planinvest.service;

import br.com.planinvest.model.Endereco;
import br.com.planinvest.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listarTodos() {
        return enderecoRepository.findAll();
    }

    public Endereco buscarPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco atualizar(Long id, Endereco endereco) {
        endereco.setIdEndereco(id);
        return enderecoRepository.save(endereco);
    }

    public void deletar(Long id) {
        enderecoRepository.deleteById(id);
    }
}